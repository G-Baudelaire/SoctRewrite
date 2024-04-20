package intermediate_representation;

public abstract class Solo {
    private final Channel channel;
    private final SoloObjects soloObjects;

    Solo(Channel channel, SoloObjects soloObjects) {
        this.channel = channel;
        this.soloObjects = soloObjects;
    }

    public Channel getChannel() {
        return channel;
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

