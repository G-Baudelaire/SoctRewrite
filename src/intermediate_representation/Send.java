package intermediate_representation;

import java.util.ArrayList;

public class Send extends Solo {
    public Send(Channel channel, ArrayList<Channel> soloObjects, ArrayList<Match> matches) {
        super(channel, soloObjects, matches);
    }
}
