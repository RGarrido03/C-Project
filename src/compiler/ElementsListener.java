// Generated from Elements.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ElementsParser}.
 */
public interface ElementsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ElementsParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ElementsParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElementsParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ElementsParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link ElementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(ElementsParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link ElementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(ElementsParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPow}
	 * labeled alternative in {@link ElementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprPow(ElementsParser.ExprPowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPow}
	 * labeled alternative in {@link ElementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprPow(ElementsParser.ExprPowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link ElementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprString(ElementsParser.ExprStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link ElementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprString(ElementsParser.ExprStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprCast}
	 * labeled alternative in {@link ElementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprCast(ElementsParser.ExprCastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprCast}
	 * labeled alternative in {@link ElementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprCast(ElementsParser.ExprCastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link ElementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprParent(ElementsParser.ExprParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link ElementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprParent(ElementsParser.ExprParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link ElementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprUnary(ElementsParser.ExprUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link ElementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprUnary(ElementsParser.ExprUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFloat}
	 * labeled alternative in {@link ElementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprFloat(ElementsParser.ExprFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFloat}
	 * labeled alternative in {@link ElementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprFloat(ElementsParser.ExprFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStdIn}
	 * labeled alternative in {@link ElementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprStdIn(ElementsParser.ExprStdInContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStdIn}
	 * labeled alternative in {@link ElementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprStdIn(ElementsParser.ExprStdInContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link ElementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprInteger(ElementsParser.ExprIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link ElementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprInteger(ElementsParser.ExprIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprBool}
	 * labeled alternative in {@link ElementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprBool(ElementsParser.ExprBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprBool}
	 * labeled alternative in {@link ElementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprBool(ElementsParser.ExprBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprVariable}
	 * labeled alternative in {@link ElementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprVariable(ElementsParser.ExprVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprVariable}
	 * labeled alternative in {@link ElementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprVariable(ElementsParser.ExprVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMultDivMod}
	 * labeled alternative in {@link ElementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprMultDivMod(ElementsParser.ExprMultDivModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMultDivMod}
	 * labeled alternative in {@link ElementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprMultDivMod(ElementsParser.ExprMultDivModContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElementsParser#execute}.
	 * @param ctx the parse tree
	 */
	void enterExecute(ElementsParser.ExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElementsParser#execute}.
	 * @param ctx the parse tree
	 */
	void exitExecute(ElementsParser.ExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElementsParser#stdin}.
	 * @param ctx the parse tree
	 */
	void enterStdin(ElementsParser.StdinContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElementsParser#stdin}.
	 * @param ctx the parse tree
	 */
	void exitStdin(ElementsParser.StdinContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElementsParser#tuple}.
	 * @param ctx the parse tree
	 */
	void enterTuple(ElementsParser.TupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElementsParser#tuple}.
	 * @param ctx the parse tree
	 */
	void exitTuple(ElementsParser.TupleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Degree}
	 * labeled alternative in {@link ElementsParser#angle}.
	 * @param ctx the parse tree
	 */
	void enterDegree(ElementsParser.DegreeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Degree}
	 * labeled alternative in {@link ElementsParser#angle}.
	 * @param ctx the parse tree
	 */
	void exitDegree(ElementsParser.DegreeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Radian}
	 * labeled alternative in {@link ElementsParser#angle}.
	 * @param ctx the parse tree
	 */
	void enterRadian(ElementsParser.RadianContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Radian}
	 * labeled alternative in {@link ElementsParser#angle}.
	 * @param ctx the parse tree
	 */
	void exitRadian(ElementsParser.RadianContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forward}
	 * labeled alternative in {@link ElementsParser#moveAction}.
	 * @param ctx the parse tree
	 */
	void enterForward(ElementsParser.ForwardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forward}
	 * labeled alternative in {@link ElementsParser#moveAction}.
	 * @param ctx the parse tree
	 */
	void exitForward(ElementsParser.ForwardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code backward}
	 * labeled alternative in {@link ElementsParser#moveAction}.
	 * @param ctx the parse tree
	 */
	void enterBackward(ElementsParser.BackwardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code backward}
	 * labeled alternative in {@link ElementsParser#moveAction}.
	 * @param ctx the parse tree
	 */
	void exitBackward(ElementsParser.BackwardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code left}
	 * labeled alternative in {@link ElementsParser#moveAction}.
	 * @param ctx the parse tree
	 */
	void enterLeft(ElementsParser.LeftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code left}
	 * labeled alternative in {@link ElementsParser#moveAction}.
	 * @param ctx the parse tree
	 */
	void exitLeft(ElementsParser.LeftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code right}
	 * labeled alternative in {@link ElementsParser#moveAction}.
	 * @param ctx the parse tree
	 */
	void enterRight(ElementsParser.RightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code right}
	 * labeled alternative in {@link ElementsParser#moveAction}.
	 * @param ctx the parse tree
	 */
	void exitRight(ElementsParser.RightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code down}
	 * labeled alternative in {@link ElementsParser#penAction}.
	 * @param ctx the parse tree
	 */
	void enterDown(ElementsParser.DownContext ctx);
	/**
	 * Exit a parse tree produced by the {@code down}
	 * labeled alternative in {@link ElementsParser#penAction}.
	 * @param ctx the parse tree
	 */
	void exitDown(ElementsParser.DownContext ctx);
	/**
	 * Enter a parse tree produced by the {@code up}
	 * labeled alternative in {@link ElementsParser#penAction}.
	 * @param ctx the parse tree
	 */
	void enterUp(ElementsParser.UpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code up}
	 * labeled alternative in {@link ElementsParser#penAction}.
	 * @param ctx the parse tree
	 */
	void exitUp(ElementsParser.UpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElementsParser#typeCast}.
	 * @param ctx the parse tree
	 */
	void enterTypeCast(ElementsParser.TypeCastContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElementsParser#typeCast}.
	 * @param ctx the parse tree
	 */
	void exitTypeCast(ElementsParser.TypeCastContext ctx);
}