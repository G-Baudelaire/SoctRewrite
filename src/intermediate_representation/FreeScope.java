package intermediate_representation;

public class FreeScope extends Binding {
    public FreeScope() {
        super(null);
    }

    @Override
    public boolean hasChannel(String channelName) {
        return true;
    }

    @Override
    boolean isFreeScope() {
        return true;
    }
}
