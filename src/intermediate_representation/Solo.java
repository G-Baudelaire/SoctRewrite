package intermediate_representation;

import java.util.ArrayList;
import java.util.HashSet;

public abstract class Solo implements StatementValue {
    protected Channel channel;
    protected final ArrayList<Channel> soloObjects;
    protected final ArrayList<Match> matches;

    Solo(Channel channel, ArrayList<Channel> soloObjects, ArrayList<Match> matches) {
        this.channel = channel;
        this.soloObjects = soloObjects;
        this.matches= new ArrayList<>(matches.size());
        this.matches.addAll(matches);
    }
    public boolean isMatching(){
        for (Match match : matches) {
            if (!match.isMatching()) return false;
        }
        return true;
    }
    public void substitution(Channel replacementChannel, HashSet<Channel> replacedChannels) {
        HashSet<Channel> intersection = new HashSet<>();

        intersection.add(channel);
        intersection.retainAll(replacedChannels);

        if (intersection.size() == 1) {
            channel = replacementChannel;
        }

        for (int i = 0; i < soloObjects.size(); i++) {
            if (replacedChannels.contains(soloObjects.get(i))) {
                soloObjects.set(i, replacementChannel);
            }
        }

        for (Match match : matches) {
            for (int j = 0; j < match.channels1.size(); j++) {
                if (replacedChannels.contains(match.channels1.get(j))) {
                    match.channels1.set(j, replacementChannel);
                }
            }

            for (int j = 0; j < match.channels2.size(); j++) {
                if (replacedChannels.contains(match.channels2.get(j))) {
                    match.channels2.set(j, replacementChannel);
                }
            }
        }
    }

    public Channel getChannel() {
        return channel;
    }

    public ArrayList<Channel> getSoloObjects() {
        return soloObjects;
    }

    @Override
    public String toString() {
        return "Solo{" +
                "channel=" + channel +
                ", soloObjects=" + soloObjects +
                ", matches=" + matches +
                '}';
    }
}

