package intermediate_representation;

public class CompositionBinding extends Binding {
    public CompositionBinding() {
        super(null);
    }

    @Override
    public boolean hasChannel(String channelName) {
        return true;
    }
}
