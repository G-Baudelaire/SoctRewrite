package intermediate_representation;

import java.util.ArrayList;
import java.util.Iterator;

public class Match {
    ArrayList<Channel> channels1, channels2;

    public Match(ArrayList<Channel> lhsChannels, ArrayList<Channel> rhsChannels) throws Exception {
        if (lhsChannels.size() != rhsChannels.size()) {
            throw new Exception("Match channels do not have the same size "
                    + lhsChannels.size() + "!=" + rhsChannels.size() + ".");
        }
        channels1 = lhsChannels;
        channels2 = rhsChannels;
    }

    boolean isMatching() {
        // Iterate over the elements of both lists simultaneously
        Iterator<Channel> it1 = channels1.iterator();
        Iterator<Channel> it2 = channels2.iterator();
        while (it1.hasNext() && it2.hasNext()) {
            if (!it1.next().equals(it2.next())) {
                return false; // If elements are different, return false
            }
        }

        // If all elements are same, return true
        return true;
    }
}
