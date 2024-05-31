// Generated from ipdraw.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ipdrawParser}.
 */
public interface ipdrawListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ipdrawParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(ipdrawParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link ipdrawParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(ipdrawParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link ipdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(ipdrawParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ipdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(ipdrawParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ipdrawParser#moveAction}.
	 * @param ctx the parse tree
	 */
	void enterMoveAction(ipdrawParser.MoveActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ipdrawParser#moveAction}.
	 * @param ctx the parse tree
	 */
	void exitMoveAction(ipdrawParser.MoveActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ipdrawParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ipdrawParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ipdrawParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ipdrawParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link ipdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(ipdrawParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link ipdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(ipdrawParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPow}
	 * labeled alternative in {@link ipdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprPow(ipdrawParser.ExprPowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPow}
	 * labeled alternative in {@link ipdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprPow(ipdrawParser.ExprPowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link ipdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprString(ipdrawParser.ExprStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link ipdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprString(ipdrawParser.ExprStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprCast}
	 * labeled alternative in {@link ipdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprCast(ipdrawParser.ExprCastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprCast}
	 * labeled alternative in {@link ipdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprCast(ipdrawParser.ExprCastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link ipdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprParent(ipdrawParser.ExprParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link ipdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprParent(ipdrawParser.ExprParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link ipdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprUnary(ipdrawParser.ExprUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link ipdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprUnary(ipdrawParser.ExprUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFloat}
	 * labeled alternative in {@link ipdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprFloat(ipdrawParser.ExprFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFloat}
	 * labeled alternative in {@link ipdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprFloat(ipdrawParser.ExprFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStdIn}
	 * labeled alternative in {@link ipdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprStdIn(ipdrawParser.ExprStdInContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStdIn}
	 * labeled alternative in {@link ipdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprStdIn(ipdrawParser.ExprStdInContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link ipdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprInteger(ipdrawParser.ExprIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link ipdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprInteger(ipdrawParser.ExprIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprBool}
	 * labeled alternative in {@link ipdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprBool(ipdrawParser.ExprBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprBool}
	 * labeled alternative in {@link ipdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprBool(ipdrawParser.ExprBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprVariable}
	 * labeled alternative in {@link ipdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprVariable(ipdrawParser.ExprVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprVariable}
	 * labeled alternative in {@link ipdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprVariable(ipdrawParser.ExprVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMultDivMod}
	 * labeled alternative in {@link ipdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprMultDivMod(ipdrawParser.ExprMultDivModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMultDivMod}
	 * labeled alternative in {@link ipdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprMultDivMod(ipdrawParser.ExprMultDivModContext ctx);
	/**
	 * Enter a parse tree produced by {@link ipdrawParser#stdin}.
	 * @param ctx the parse tree
	 */
	void enterStdin(ipdrawParser.StdinContext ctx);
	/**
	 * Exit a parse tree produced by {@link ipdrawParser#stdin}.
	 * @param ctx the parse tree
	 */
	void exitStdin(ipdrawParser.StdinContext ctx);
	/**
	 * Enter a parse tree produced by {@link ipdrawParser#tuple}.
	 * @param ctx the parse tree
	 */
	void enterTuple(ipdrawParser.TupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ipdrawParser#tuple}.
	 * @param ctx the parse tree
	 */
	void exitTuple(ipdrawParser.TupleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Degree}
	 * labeled alternative in {@link ipdrawParser#angle}.
	 * @param ctx the parse tree
	 */
	void enterDegree(ipdrawParser.DegreeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Degree}
	 * labeled alternative in {@link ipdrawParser#angle}.
	 * @param ctx the parse tree
	 */
	void exitDegree(ipdrawParser.DegreeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Radian}
	 * labeled alternative in {@link ipdrawParser#angle}.
	 * @param ctx the parse tree
	 */
	void enterRadian(ipdrawParser.RadianContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Radian}
	 * labeled alternative in {@link ipdrawParser#angle}.
	 * @param ctx the parse tree
	 */
	void exitRadian(ipdrawParser.RadianContext ctx);
	/**
	 * Enter a parse tree produced by the {@code down}
	 * labeled alternative in {@link ipdrawParser#penAction}.
	 * @param ctx the parse tree
	 */
	void enterDown(ipdrawParser.DownContext ctx);
	/**
	 * Exit a parse tree produced by the {@code down}
	 * labeled alternative in {@link ipdrawParser#penAction}.
	 * @param ctx the parse tree
	 */
	void exitDown(ipdrawParser.DownContext ctx);
	/**
	 * Enter a parse tree produced by the {@code up}
	 * labeled alternative in {@link ipdrawParser#penAction}.
	 * @param ctx the parse tree
	 */
	void enterUp(ipdrawParser.UpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code up}
	 * labeled alternative in {@link ipdrawParser#penAction}.
	 * @param ctx the parse tree
	 */
	void exitUp(ipdrawParser.UpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ipdrawParser#typeCast}.
	 * @param ctx the parse tree
	 */
	void enterTypeCast(ipdrawParser.TypeCastContext ctx);
	/**
	 * Exit a parse tree produced by {@link ipdrawParser#typeCast}.
	 * @param ctx the parse tree
	 */
	void exitTypeCast(ipdrawParser.TypeCastContext ctx);
}