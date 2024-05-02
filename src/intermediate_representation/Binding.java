package intermediate_representation;

import java.util.ArrayList;

public class Binding {
    private static int counter = 0;  // Static variable to keep track of the last assigned ID
    private final int id;  // Instance variable to store the unique ID of each instance
    private final ArrayList<String> boundChannels;

    // Constructor
    public Binding(ArrayList<String> boundChannels) {
        synchronized (Binding.class) {
            counter++;
            this.id = counter;
        }

        this.boundChannels = boundChannels;
    }

    // Override the equals method to compare Foo objects based on their ID
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  // Check for reference equality
        if (obj == null || getClass() != obj.getClass())
            return false;  // Check for null and ensure objects are of the same class
        Binding binding = (Binding) obj;  // Type cast
        return this.id == binding.id;  // Compare IDs
    }

    // Override the hashCode method to comply with the contract between equals and hashCode
    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    // Override the toString method for better readability
    @Override
    public String toString() {
        return "Binding{id=" + id + ", bound channel=" + boundChannels + "}";
    }

    public boolean hasChannel(String channelName) {
        return boundChannels.contains(channelName);
    }

    boolean isFreeScope() {
        return false;
    }
}
