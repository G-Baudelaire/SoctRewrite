// Generated from D:/Users/Germain Jones/IdeaProjects/Soct/src/Soct.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SoctParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SoctVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SoctParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SoctParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoctParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(SoctParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoctParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SoctParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoctParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SoctParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoctParser#inaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInaction(SoctParser.InactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoctParser#soloObjects}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoloObjects(SoctParser.SoloObjectsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoctParser#solo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSolo(SoctParser.SoloContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoctParser#agent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAgent(SoctParser.AgentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoctParser#innerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerList(SoctParser.InnerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoctParser#channelList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChannelList(SoctParser.ChannelListContext ctx);
}