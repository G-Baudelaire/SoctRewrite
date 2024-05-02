package intermediate_representation;

import java.util.ArrayList;
import java.util.HashSet;

public class EquivalenceClasses {
    class CommunicationRecord {
        boolean isCommunicationPossible;
        ArrayList<HashSet<Channel>> equivalenceSets;
        ArrayList<Channel> rangeChannels;

        CommunicationRecord(boolean communicationPossible,
                            ArrayList<HashSet<Channel>> equivalenceSets,
                            ArrayList<Channel> rangeChannels) {
            this.isCommunicationPossible = communicationPossible;
            this.equivalenceSets = equivalenceSets;
            this.rangeChannels = rangeChannels;
        }
    }

    public CommunicationRecord checkCommunicationForScope(ArrayList<Channel> receiveChannels, ArrayList<Channel> sentChannels) {
        ArrayList<HashSet<Channel>> equivalenceSets = new ArrayList<>();
        addPairs(equivalenceSets, receiveChannels, sentChannels);
        collapseSets(equivalenceSets);
        return checkValidSets(equivalenceSets);
    }

    private CommunicationRecord checkValidSets(ArrayList<HashSet<Channel>> equivalenceSets) {
        int numberOfFreeChannels;
        ArrayList<Channel> rangeChannels = new ArrayList<>();
        for (HashSet<Channel> set : equivalenceSets) {
            numberOfFreeChannels = 0;
            if (set.size() == 1) continue;

            for (Channel channel : set) {
                if (channel.getBinding().isFreeScope()) {
                    rangeChannels.add(channel);
                    numberOfFreeChannels++;
                }
            }
            if (numberOfFreeChannels != 1) {
                return new CommunicationRecord(false, null, null);
            }
        }
        return new CommunicationRecord(true, equivalenceSets, rangeChannels);
    }

    void addPairs(ArrayList<HashSet<Channel>> equivalenceSets,
                  ArrayList<Channel> receiveChannels,
                  ArrayList<Channel> sentChannels) {
        for (int i = 0; i < receiveChannels.size(); i++) {
            HashSet<Channel> set = new HashSet<>();
            set.add(receiveChannels.get(i));
            set.add(sentChannels.get(i));
            equivalenceSets.add(set);
        }
    }

    void collapseSets(ArrayList<HashSet<Channel>> equivalenceSets) {
        for (int i = equivalenceSets.size() - 1; 0 <= i; i--) {
            HashSet<Channel> endSet = equivalenceSets.get(i);
            for (int j = 0; j < i; j++) {
                HashSet<Channel> intersection = new HashSet<>(endSet);
                intersection.retainAll(equivalenceSets.get(j));
                if (!intersection.isEmpty()) {
                    equivalenceSets.get(j).addAll(endSet);
                    equivalenceSets.remove(endSet);
                    break;
                }
            }
        }
    }
}
