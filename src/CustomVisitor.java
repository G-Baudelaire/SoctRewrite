import intermediate_representation.*;

import java.util.ArrayList;

public class CustomVisitor extends SoctBaseVisitor<Void> {
    private Statement currentStatement = new Statement();
    private ArrayList<Binding> currentBindings = new ArrayList<>();
    private ArrayList<Match> currentMatches = new ArrayList<>();
    private final Program program = new Program();
    private ArrayList<String> currentChannelList = new ArrayList<>();

    /**
     * @param context the parse tree
     * @return
     */
    @Override
    public Void visitProgram(SoctParser.ProgramContext context) {
        return super.visitProgram(context);
    }

    /**
     * @param context the parse tree
     * @return
     */
    @Override
    public Void visitStatements(SoctParser.StatementsContext context) {
        return super.visitStatements(context);
    }

    /**
     * @param context the parse tree
     * @return
     */
    @Override
    public Void visitStatement(SoctParser.StatementContext context) {
        currentMatches = new ArrayList<>();
        currentBindings = new ArrayList<>();
        currentBindings.add(new FreeScope());
        currentStatement = new Statement();
        program.addStatement(currentStatement);
        visitAgent(context.agent());
        return null;
    }

    /**
     * @param context the parse tree
     * @return
     */
    @Override
    public Void visitAgent(SoctParser.AgentContext context) {
        if (context.BIND() != null) {
            visitChannelList(context.channelList(0));
            Binding binding = new Binding(currentChannelList);
            currentBindings.add(binding);
            visitAgent(context.agent(0));
            currentBindings.remove(binding);
        } else if (context.MATCH() != null) {
            ArrayList<Channel> lhsChannels = new ArrayList<>();
            ArrayList<Channel> rhsChannels = new ArrayList<>();

            visitChannelList(context.channelList(0));
            for (String channelName : currentChannelList) {
                lhsChannels.add(Channel.getChannel(channelName, currentBindings));
            }

            visitChannelList(context.channelList(1));
            for (String channelName : currentChannelList) {
                rhsChannels.add(Channel.getChannel(channelName, currentBindings));
            }
            try {
                Match match = new Match(lhsChannels, rhsChannels);
                currentMatches.add(match);
                visitAgent(context.agent(0));
                currentMatches.remove(match);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.exit(1);
            }
        } else {
            visitChildren(context);
        }

        return null;
    }

    /**
     * @param context the parse tree
     * @return
     */
    @Override
    public Void visitSolo(SoctParser.SoloContext context) {

        if (context.PRINT() != null) {
            currentStatement.addStatementValue(new PrintStatement(context.STRING().getText()));
            return null;
        }

        if (context.channelList() != null) {
            visitChannelList(context.channelList());
        } else {
            currentChannelList = new ArrayList<>();
            currentChannelList.add(context.CHANNEL(1).getText());
        }

        Channel channel = Channel.getChannel(context.CHANNEL(0).getText(), currentBindings);
        ArrayList<Channel> soloObjects = new ArrayList<>();
        for (String channelName : currentChannelList) {
            soloObjects.add(Channel.getChannel(channelName, currentBindings));
        }

        if (context.SEND() != null) {
            currentStatement.addStatementValue(new Send(channel, soloObjects, currentMatches));
        } else {
            currentStatement.addStatementValue(new Receive(channel, soloObjects, currentMatches));
        }
        return null;
    }

    /**
     * @param context the parse tree
     * @return
     */
    @Override
    public Void visitChannelList(SoctParser.ChannelListContext context) {
        currentChannelList = new ArrayList<>();
        visitChildren(context);
        return null;
    }

    /**
     * @param ctx the parse tree
     * @return
     */
    @Override
    public Void visitInnerList(SoctParser.InnerListContext ctx) {
        if (ctx.innerList() != null) {
            visitInnerList(ctx.innerList());
        }
        currentChannelList.add(ctx.CHANNEL().getText());
        return null;
    }

    /**
     * @return
     */
    public Program getProgram() {
        return program;
    }
}
