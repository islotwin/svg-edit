package islotwin.tkom.gen;// Generated from /Users/iga/Desktop/STUDIA/SEM6/TKOM/extra/Gram.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GramParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(GramParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(GramParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#mathStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathStmt(GramParser.MathStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#saveDocStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSaveDocStmt(GramParser.SaveDocStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#printStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStmt(GramParser.PrintStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#initListStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitListStmt(GramParser.InitListStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#onVarStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnVarStmt(GramParser.OnVarStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#onVarFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnVarFun(GramParser.OnVarFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#initListFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitListFun(GramParser.InitListFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#createFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFun(GramParser.CreateFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#readFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadFun(GramParser.ReadFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#filterFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterFun(GramParser.FilterFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#filterAttrFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterAttrFun(GramParser.FilterAttrFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#filterTagFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterTagFun(GramParser.FilterTagFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#modListFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModListFun(GramParser.ModListFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#sizeFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeFun(GramParser.SizeFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#initElemStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitElemStmt(GramParser.InitElemStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#initElemFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitElemFun(GramParser.InitElemFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#createElemFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateElemFun(GramParser.CreateElemFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#getElemFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetElemFun(GramParser.GetElemFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#modAttrFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModAttrFun(GramParser.ModAttrFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#setAttrFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetAttrFun(GramParser.SetAttrFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#deleteAttrFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteAttrFun(GramParser.DeleteAttrFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#getAttrFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetAttrFun(GramParser.GetAttrFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#initValStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitValStmt(GramParser.InitValStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(GramParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#textArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextArgument(GramParser.TextArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#numberArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberArgument(GramParser.NumberArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(GramParser.ArgumentContext ctx);
}