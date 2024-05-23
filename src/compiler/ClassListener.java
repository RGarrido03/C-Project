// Generated from Class.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ClassParser}.
 */
public interface ClassListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code CreateCanvas}
	 * labeled alternative in {@link ClassParser#class}.
	 * @param ctx the parse tree
	 */
	void enterCreateCanvas(ClassParser.CreateCanvasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CreateCanvas}
	 * labeled alternative in {@link ClassParser#class}.
	 * @param ctx the parse tree
	 */
	void exitCreateCanvas(ClassParser.CreateCanvasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CreatePen}
	 * labeled alternative in {@link ClassParser#class}.
	 * @param ctx the parse tree
	 */
	void enterCreatePen(ClassParser.CreatePenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CreatePen}
	 * labeled alternative in {@link ClassParser#class}.
	 * @param ctx the parse tree
	 */
	void exitCreatePen(ClassParser.CreatePenContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassParser#classProps}.
	 * @param ctx the parse tree
	 */
	void enterClassProps(ClassParser.ClassPropsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassParser#classProps}.
	 * @param ctx the parse tree
	 */
	void exitClassProps(ClassParser.ClassPropsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(ClassParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(ClassParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ClassParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ClassParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link ClassParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(ClassParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link ClassParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(ClassParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPow}
	 * labeled alternative in {@link ClassParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprPow(ClassParser.ExprPowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPow}
	 * labeled alternative in {@link ClassParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprPow(ClassParser.ExprPowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link ClassParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprString(ClassParser.ExprStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link ClassParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprString(ClassParser.ExprStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprCast}
	 * labeled alternative in {@link ClassParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprCast(ClassParser.ExprCastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprCast}
	 * labeled alternative in {@link ClassParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprCast(ClassParser.ExprCastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link ClassParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprParent(ClassParser.ExprParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link ClassParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprParent(ClassParser.ExprParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link ClassParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprUnary(ClassParser.ExprUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link ClassParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprUnary(ClassParser.ExprUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFloat}
	 * labeled alternative in {@link ClassParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprFloat(ClassParser.ExprFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFloat}
	 * labeled alternative in {@link ClassParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprFloat(ClassParser.ExprFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStdIn}
	 * labeled alternative in {@link ClassParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprStdIn(ClassParser.ExprStdInContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStdIn}
	 * labeled alternative in {@link ClassParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprStdIn(ClassParser.ExprStdInContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link ClassParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprInteger(ClassParser.ExprIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link ClassParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprInteger(ClassParser.ExprIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link ClassParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprId(ClassParser.ExprIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link ClassParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprId(ClassParser.ExprIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprVariable}
	 * labeled alternative in {@link ClassParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprVariable(ClassParser.ExprVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprVariable}
	 * labeled alternative in {@link ClassParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprVariable(ClassParser.ExprVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMultDivMod}
	 * labeled alternative in {@link ClassParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprMultDivMod(ClassParser.ExprMultDivModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMultDivMod}
	 * labeled alternative in {@link ClassParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprMultDivMod(ClassParser.ExprMultDivModContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassParser#execute}.
	 * @param ctx the parse tree
	 */
	void enterExecute(ClassParser.ExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassParser#execute}.
	 * @param ctx the parse tree
	 */
	void exitExecute(ClassParser.ExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassParser#stdin}.
	 * @param ctx the parse tree
	 */
	void enterStdin(ClassParser.StdinContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassParser#stdin}.
	 * @param ctx the parse tree
	 */
	void exitStdin(ClassParser.StdinContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassParser#tuple}.
	 * @param ctx the parse tree
	 */
	void enterTuple(ClassParser.TupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassParser#tuple}.
	 * @param ctx the parse tree
	 */
	void exitTuple(ClassParser.TupleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Degree}
	 * labeled alternative in {@link ClassParser#angle}.
	 * @param ctx the parse tree
	 */
	void enterDegree(ClassParser.DegreeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Degree}
	 * labeled alternative in {@link ClassParser#angle}.
	 * @param ctx the parse tree
	 */
	void exitDegree(ClassParser.DegreeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Radian}
	 * labeled alternative in {@link ClassParser#angle}.
	 * @param ctx the parse tree
	 */
	void enterRadian(ClassParser.RadianContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Radian}
	 * labeled alternative in {@link ClassParser#angle}.
	 * @param ctx the parse tree
	 */
	void exitRadian(ClassParser.RadianContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forward}
	 * labeled alternative in {@link ClassParser#moveAction}.
	 * @param ctx the parse tree
	 */
	void enterForward(ClassParser.ForwardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forward}
	 * labeled alternative in {@link ClassParser#moveAction}.
	 * @param ctx the parse tree
	 */
	void exitForward(ClassParser.ForwardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code backward}
	 * labeled alternative in {@link ClassParser#moveAction}.
	 * @param ctx the parse tree
	 */
	void enterBackward(ClassParser.BackwardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code backward}
	 * labeled alternative in {@link ClassParser#moveAction}.
	 * @param ctx the parse tree
	 */
	void exitBackward(ClassParser.BackwardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code left}
	 * labeled alternative in {@link ClassParser#moveAction}.
	 * @param ctx the parse tree
	 */
	void enterLeft(ClassParser.LeftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code left}
	 * labeled alternative in {@link ClassParser#moveAction}.
	 * @param ctx the parse tree
	 */
	void exitLeft(ClassParser.LeftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code right}
	 * labeled alternative in {@link ClassParser#moveAction}.
	 * @param ctx the parse tree
	 */
	void enterRight(ClassParser.RightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code right}
	 * labeled alternative in {@link ClassParser#moveAction}.
	 * @param ctx the parse tree
	 */
	void exitRight(ClassParser.RightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code down}
	 * labeled alternative in {@link ClassParser#penAction}.
	 * @param ctx the parse tree
	 */
	void enterDown(ClassParser.DownContext ctx);
	/**
	 * Exit a parse tree produced by the {@code down}
	 * labeled alternative in {@link ClassParser#penAction}.
	 * @param ctx the parse tree
	 */
	void exitDown(ClassParser.DownContext ctx);
	/**
	 * Enter a parse tree produced by the {@code up}
	 * labeled alternative in {@link ClassParser#penAction}.
	 * @param ctx the parse tree
	 */
	void enterUp(ClassParser.UpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code up}
	 * labeled alternative in {@link ClassParser#penAction}.
	 * @param ctx the parse tree
	 */
	void exitUp(ClassParser.UpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassParser#typeCast}.
	 * @param ctx the parse tree
	 */
	void enterTypeCast(ClassParser.TypeCastContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassParser#typeCast}.
	 * @param ctx the parse tree
	 */
	void exitTypeCast(ClassParser.TypeCastContext ctx);
}