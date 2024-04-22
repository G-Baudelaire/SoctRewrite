package intermediate_representation;

public class Receive extends Solo {
    public Receive(Channel channel, SoloObjects soloObjects) {
        super(channel, soloObjects);
    }

    public boolean isCommunicable(Send send) {
        // I know I can write it more efficiently but this is great for readability.
        boolean sameChannel, sameSoloObjectsSize;
        sameChannel = (this.channel == send.getChannel());
        sameSoloObjectsSize= (this.soloObjects.getChannels().size() == send.getSoloObjects().getChannels().size());
        return sameChannel && sameSoloObjectsSize;
    }
}
