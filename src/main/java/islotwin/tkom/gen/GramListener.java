package islotwin.tkom.gen;// Generated from /Users/iga/Desktop/STUDIA/SEM6/TKOM/extra/Gram.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramParser}.
 */
public interface GramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GramParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GramParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GramParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GramParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(GramParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(GramParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#elseFun}.
	 * @param ctx the parse tree
	 */
	void enterElseFun(GramParser.ElseFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#elseFun}.
	 * @param ctx the parse tree
	 */
	void exitElseFun(GramParser.ElseFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(GramParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(GramParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#mathStmt}.
	 * @param ctx the parse tree
	 */
	void enterMathStmt(GramParser.MathStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#mathStmt}.
	 * @param ctx the parse tree
	 */
	void exitMathStmt(GramParser.MathStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#saveDocStmt}.
	 * @param ctx the parse tree
	 */
	void enterSaveDocStmt(GramParser.SaveDocStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#saveDocStmt}.
	 * @param ctx the parse tree
	 */
	void exitSaveDocStmt(GramParser.SaveDocStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(GramParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(GramParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#initListStmt}.
	 * @param ctx the parse tree
	 */
	void enterInitListStmt(GramParser.InitListStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#initListStmt}.
	 * @param ctx the parse tree
	 */
	void exitInitListStmt(GramParser.InitListStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#onVarStmt}.
	 * @param ctx the parse tree
	 */
	void enterOnVarStmt(GramParser.OnVarStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#onVarStmt}.
	 * @param ctx the parse tree
	 */
	void exitOnVarStmt(GramParser.OnVarStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#onVarFun}.
	 * @param ctx the parse tree
	 */
	void enterOnVarFun(GramParser.OnVarFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#onVarFun}.
	 * @param ctx the parse tree
	 */
	void exitOnVarFun(GramParser.OnVarFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#initListFun}.
	 * @param ctx the parse tree
	 */
	void enterInitListFun(GramParser.InitListFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#initListFun}.
	 * @param ctx the parse tree
	 */
	void exitInitListFun(GramParser.InitListFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#createFun}.
	 * @param ctx the parse tree
	 */
	void enterCreateFun(GramParser.CreateFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#createFun}.
	 * @param ctx the parse tree
	 */
	void exitCreateFun(GramParser.CreateFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#readFun}.
	 * @param ctx the parse tree
	 */
	void enterReadFun(GramParser.ReadFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#readFun}.
	 * @param ctx the parse tree
	 */
	void exitReadFun(GramParser.ReadFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#filterFun}.
	 * @param ctx the parse tree
	 */
	void enterFilterFun(GramParser.FilterFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#filterFun}.
	 * @param ctx the parse tree
	 */
	void exitFilterFun(GramParser.FilterFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#filterAttrFun}.
	 * @param ctx the parse tree
	 */
	void enterFilterAttrFun(GramParser.FilterAttrFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#filterAttrFun}.
	 * @param ctx the parse tree
	 */
	void exitFilterAttrFun(GramParser.FilterAttrFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#filterTagFun}.
	 * @param ctx the parse tree
	 */
	void enterFilterTagFun(GramParser.FilterTagFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#filterTagFun}.
	 * @param ctx the parse tree
	 */
	void exitFilterTagFun(GramParser.FilterTagFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#modListFun}.
	 * @param ctx the parse tree
	 */
	void enterModListFun(GramParser.ModListFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#modListFun}.
	 * @param ctx the parse tree
	 */
	void exitModListFun(GramParser.ModListFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#sizeFun}.
	 * @param ctx the parse tree
	 */
	void enterSizeFun(GramParser.SizeFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#sizeFun}.
	 * @param ctx the parse tree
	 */
	void exitSizeFun(GramParser.SizeFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#initElemStmt}.
	 * @param ctx the parse tree
	 */
	void enterInitElemStmt(GramParser.InitElemStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#initElemStmt}.
	 * @param ctx the parse tree
	 */
	void exitInitElemStmt(GramParser.InitElemStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#initElemFun}.
	 * @param ctx the parse tree
	 */
	void enterInitElemFun(GramParser.InitElemFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#initElemFun}.
	 * @param ctx the parse tree
	 */
	void exitInitElemFun(GramParser.InitElemFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#createElemFun}.
	 * @param ctx the parse tree
	 */
	void enterCreateElemFun(GramParser.CreateElemFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#createElemFun}.
	 * @param ctx the parse tree
	 */
	void exitCreateElemFun(GramParser.CreateElemFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#getElemFun}.
	 * @param ctx the parse tree
	 */
	void enterGetElemFun(GramParser.GetElemFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#getElemFun}.
	 * @param ctx the parse tree
	 */
	void exitGetElemFun(GramParser.GetElemFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#modAttrFun}.
	 * @param ctx the parse tree
	 */
	void enterModAttrFun(GramParser.ModAttrFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#modAttrFun}.
	 * @param ctx the parse tree
	 */
	void exitModAttrFun(GramParser.ModAttrFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#setAttrFun}.
	 * @param ctx the parse tree
	 */
	void enterSetAttrFun(GramParser.SetAttrFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#setAttrFun}.
	 * @param ctx the parse tree
	 */
	void exitSetAttrFun(GramParser.SetAttrFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#deleteAttrFun}.
	 * @param ctx the parse tree
	 */
	void enterDeleteAttrFun(GramParser.DeleteAttrFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#deleteAttrFun}.
	 * @param ctx the parse tree
	 */
	void exitDeleteAttrFun(GramParser.DeleteAttrFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#getAttrFun}.
	 * @param ctx the parse tree
	 */
	void enterGetAttrFun(GramParser.GetAttrFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#getAttrFun}.
	 * @param ctx the parse tree
	 */
	void exitGetAttrFun(GramParser.GetAttrFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#initValStmt}.
	 * @param ctx the parse tree
	 */
	void enterInitValStmt(GramParser.InitValStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#initValStmt}.
	 * @param ctx the parse tree
	 */
	void exitInitValStmt(GramParser.InitValStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GramParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GramParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#textArgument}.
	 * @param ctx the parse tree
	 */
	void enterTextArgument(GramParser.TextArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#textArgument}.
	 * @param ctx the parse tree
	 */
	void exitTextArgument(GramParser.TextArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#numberArgument}.
	 * @param ctx the parse tree
	 */
	void enterNumberArgument(GramParser.NumberArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#numberArgument}.
	 * @param ctx the parse tree
	 */
	void exitNumberArgument(GramParser.NumberArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(GramParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(GramParser.ArgumentContext ctx);
}