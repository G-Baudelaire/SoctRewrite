import intermediate_representation.*;

import java.util.ArrayList;

public class CustomListener extends SoctBaseListener {
    private Statement currentStatement = new Statement();
    private ArrayList<Binding> currentBindings = new ArrayList<>();
    private final Expressions expressions = new Expressions();

    @Override
    public void enterExpressions(SoctParser.ExpressionsContext context) {
        super.enterExpressions(context);
    }

    @Override
    public void exitExpressions(SoctParser.ExpressionsContext context) {
        super.exitExpressions(context);
    }

    @Override
    public void enterStatement(SoctParser.StatementContext context) {
        currentBindings = new ArrayList<>();
        currentBindings.add(new CompositionBinding());
        currentStatement = new Statement();
    }

    @Override
    public void exitStatement(SoctParser.StatementContext context) {
        expressions.addStatement(currentStatement);
    }

    @Override
    public void enterSolo(SoctParser.SoloContext context) {
        Solo solo;

        SoloObjects soloObjects = getSoloObjects(context.soloObjects());
        Channel channel = Channel.getChannel(context.CHANNEL().getSymbol().getText(), currentBindings);

        if (context.SEND() != null) {
            solo = new Send(channel, soloObjects);
        } else if (context.RECEIVE() != null) {
            solo = new Receive(channel, soloObjects);
        } else {
            solo = new ReplicatedReceive(channel, soloObjects);
        }

        currentStatement.addSolo(solo);
    }

    private SoloObjects getSoloObjects(SoctParser.SoloObjectsContext soloObjectsContext) {
        if (soloObjectsContext.CHANNEL() != null) {
            return new SoloObjects(Channel.getChannel(soloObjectsContext.CHANNEL().getText(), currentBindings));
        } else {
            ArrayList<String> channelList = getChannelList(soloObjectsContext.channelList());
            ArrayList<Channel> channels = new ArrayList<>(channelList.size());
            for (String channelName : channelList) {
                channels.add(Channel.getChannel(channelName, currentBindings));
            }
            return new SoloObjects(channels);

        }
    }

    @Override
    public void enterAgent(SoctParser.AgentContext context) {
        if (context.BIND() != null) {
            Binding binding = new Binding(getChannelList(context.channelList()));
            currentBindings.add(binding);
            System.out.println(currentBindings);
        }
    }

    @Override
    public void exitAgent(SoctParser.AgentContext context) {
        if (context.BIND() != null) {
            currentBindings.remove(currentBindings.size() - 1);
            System.out.println(currentBindings);
        }
    }

    public Expressions getExpressions() {
        return expressions;
    }

    private ArrayList<String> getChannelList(SoctParser.ChannelListContext context) {
        ArrayList<String> channelList = new ArrayList<>();
        recursiveInnerList(channelList, context.innerList());
        return channelList;
    }

    private void recursiveInnerList(ArrayList<String> channelList, SoctParser.InnerListContext context) {
        if (context.innerList() != null) {
            recursiveInnerList(channelList, context.innerList());
        }

        channelList.add(context.CHANNEL().getText());
        System.out.println(context.CHANNEL().getText());
    }
}
