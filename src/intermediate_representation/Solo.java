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
        this.matches = matches;
    }

    public void substitution(Channel replacementChannel, HashSet<Channel> replacedChannels) {
        HashSet<Channel> intersection = new HashSet<>();
        intersection.add(channel);
        intersection.retainAll(replacedChannels);

        if (intersection.size() == 1) {
            channel = replacementChannel;
        }

        for (int i = 0; i < soloObjects.size(); i++) {
            intersection = new HashSet<>();
            intersection.add(soloObjects.get(i));
            intersection.retainAll(replacedChannels);

            if (intersection.size() == 1) {
                soloObjects.set(i, replacementChannel);
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
        return this.getClass().getSimpleName() +
                "{" +
                "channel=" + channel +
                ", soloObjects=" + soloObjects +
                '}';
    }
}

