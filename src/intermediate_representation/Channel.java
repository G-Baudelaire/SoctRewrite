package intermediate_representation;

import java.util.ArrayList;

public class Channel {
    private static int counter = 0;  // Static variable to keep track of the last assigned ID
    private final int id;  // Instance variable to store the unique ID of each instance
    private final String channelName;
    private static final ArrayList<Channel> channels = new ArrayList<>();
    private final Binding binding;

    private Channel(String channelName, Binding binding) {
        synchronized (Channel.class) {
            counter++;
            this.id = counter;
            channels.add(this);
        }
        this.channelName = channelName;
        this.binding = binding;
    }

    public Binding getBinding() {
        return binding;
    }

    public static Channel getChannel(String channelName, ArrayList<Binding> bindings) {
        Binding binding = selectBinding(channelName, bindings);

        synchronized (Channel.class) {
            for (Channel existingChannel : channels) {
                if (channelName.equals(existingChannel.channelName) && existingChannel.getBinding() == binding) {
                    return existingChannel;
                }
            }
            return new Channel(channelName, binding);
        }
    }

    static Binding selectBinding(String channelName, ArrayList<Binding> bindings) {
        for (int i = bindings.size() - 1; 0 <= i; i--) {
            if (bindings.get(i).hasChannel(channelName)) {
                return bindings.get(i);
            }
        }
        return null;
    }

    // Override the equals method to compare Foo objects based on their ID
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  // Check for reference equality
        if (obj == null || getClass() != obj.getClass()) return false;
        Channel channel = (Channel) obj;
        return this.id == channel.id;
    }

    // Override the hashCode method to comply with the contract between equals and hashCode
    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    // Override the toString method for better readability
    @Override
    public String toString() {
        return "{id=" + id + ", channelName=" + channelName + "}";
    }
}