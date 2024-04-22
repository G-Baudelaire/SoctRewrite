package intermediate_representation;

public abstract class Solo implements StatementValue{
    protected final Channel channel;
    protected final SoloObjects soloObjects;

    Solo(Channel channel, SoloObjects soloObjects) {
        this.channel = channel;
        this.soloObjects = soloObjects;
    }

    public Channel getChannel() {
        return channel;
    }

    public SoloObjects getSoloObjects() {
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

