package intermediate_representation;

import java.util.ArrayList;

public class SoloObjects implements StatementValue{
    private final ArrayList<Channel> channels;

    public SoloObjects(ArrayList<Channel> channels) {
        this.channels = channels;
    }

    public SoloObjects(Channel channel) {
        this.channels = new ArrayList<>(1);
        this.channels.add(channel);
    }

    public ArrayList<Channel> getChannels() {
        return channels;
    }

    @Override
    public String toString() {
        return "SoloObjects{" +
                "channels=" + channels +
                '}';
    }
}
