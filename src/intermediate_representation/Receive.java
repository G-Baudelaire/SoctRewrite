package intermediate_representation;

import java.util.ArrayList;

public class Receive extends Solo {
    public Receive(Channel channel, ArrayList<Channel> soloObjects,ArrayList<Match> matches) {
        super(channel, soloObjects, matches);
    }

    public boolean isSameChannelAndObjectSize(Send send) {
        // I know I can write it more efficiently but this is great for readability.
        boolean sameChannel, sameSoloObjectsSize;
        sameChannel = (this.channel == send.getChannel());
        sameSoloObjectsSize= (this.soloObjects.size() == send.getSoloObjects().size());
        return sameChannel && sameSoloObjectsSize;
    }
}
