// Generated from D:/Users/Germain Jones/IdeaProjects/Soct/src/Soct.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SoctParser}.
 */
public interface SoctListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SoctParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SoctParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoctParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SoctParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoctParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(SoctParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoctParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(SoctParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoctParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SoctParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoctParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SoctParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoctParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SoctParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoctParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SoctParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoctParser#inaction}.
	 * @param ctx the parse tree
	 */
	void enterInaction(SoctParser.InactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoctParser#inaction}.
	 * @param ctx the parse tree
	 */
	void exitInaction(SoctParser.InactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoctParser#soloObjects}.
	 * @param ctx the parse tree
	 */
	void enterSoloObjects(SoctParser.SoloObjectsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoctParser#soloObjects}.
	 * @param ctx the parse tree
	 */
	void exitSoloObjects(SoctParser.SoloObjectsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoctParser#solo}.
	 * @param ctx the parse tree
	 */
	void enterSolo(SoctParser.SoloContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoctParser#solo}.
	 * @param ctx the parse tree
	 */
	void exitSolo(SoctParser.SoloContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoctParser#agent}.
	 * @param ctx the parse tree
	 */
	void enterAgent(SoctParser.AgentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoctParser#agent}.
	 * @param ctx the parse tree
	 */
	void exitAgent(SoctParser.AgentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoctParser#innerList}.
	 * @param ctx the parse tree
	 */
	void enterInnerList(SoctParser.InnerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoctParser#innerList}.
	 * @param ctx the parse tree
	 */
	void exitInnerList(SoctParser.InnerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoctParser#channelList}.
	 * @param ctx the parse tree
	 */
	void enterChannelList(SoctParser.ChannelListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoctParser#channelList}.
	 * @param ctx the parse tree
	 */
	void exitChannelList(SoctParser.ChannelListContext ctx);
}