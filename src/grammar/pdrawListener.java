// Generated from pdraw.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pdrawParser}.
 */
public interface pdrawListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pdrawParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(pdrawParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdrawParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(pdrawParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdrawParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(pdrawParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdrawParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(pdrawParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MoveAction_}
	 * labeled alternative in {@link pdrawParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterMoveAction_(pdrawParser.MoveAction_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code MoveAction_}
	 * labeled alternative in {@link pdrawParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitMoveAction_(pdrawParser.MoveAction_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code PenAction_}
	 * labeled alternative in {@link pdrawParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterPenAction_(pdrawParser.PenAction_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code PenAction_}
	 * labeled alternative in {@link pdrawParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitPenAction_(pdrawParser.PenAction_Context ctx);
	/**
	 * Enter a parse tree produced by {@link pdrawParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(pdrawParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdrawParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(pdrawParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdrawParser#cast}.
	 * @param ctx the parse tree
	 */
	void enterCast(pdrawParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdrawParser#cast}.
	 * @param ctx the parse tree
	 */
	void exitCast(pdrawParser.CastContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdrawParser#pause}.
	 * @param ctx the parse tree
	 */
	void enterPause(pdrawParser.PauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdrawParser#pause}.
	 * @param ctx the parse tree
	 */
	void exitPause(pdrawParser.PauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdrawParser#stdin}.
	 * @param ctx the parse tree
	 */
	void enterStdin(pdrawParser.StdinContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdrawParser#stdin}.
	 * @param ctx the parse tree
	 */
	void exitStdin(pdrawParser.StdinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stdout}
	 * labeled alternative in {@link pdrawParser#print}.
	 * @param ctx the parse tree
	 */
	void enterStdout(pdrawParser.StdoutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stdout}
	 * labeled alternative in {@link pdrawParser#print}.
	 * @param ctx the parse tree
	 */
	void exitStdout(pdrawParser.StdoutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stderr}
	 * labeled alternative in {@link pdrawParser#print}.
	 * @param ctx the parse tree
	 */
	void enterStderr(pdrawParser.StderrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stderr}
	 * labeled alternative in {@link pdrawParser#print}.
	 * @param ctx the parse tree
	 */
	void exitStderr(pdrawParser.StderrContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdrawParser#class}.
	 * @param ctx the parse tree
	 */
	void enterClass(pdrawParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdrawParser#class}.
	 * @param ctx the parse tree
	 */
	void exitClass(pdrawParser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdrawParser#classProps}.
	 * @param ctx the parse tree
	 */
	void enterClassProps(pdrawParser.ClassPropsContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdrawParser#classProps}.
	 * @param ctx the parse tree
	 */
	void exitClassProps(pdrawParser.ClassPropsContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdrawParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(pdrawParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdrawParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(pdrawParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdrawParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(pdrawParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdrawParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(pdrawParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link pdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(pdrawParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link pdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(pdrawParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPow}
	 * labeled alternative in {@link pdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprPow(pdrawParser.ExprPowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPow}
	 * labeled alternative in {@link pdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprPow(pdrawParser.ExprPowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link pdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprParent(pdrawParser.ExprParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link pdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprParent(pdrawParser.ExprParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFloat}
	 * labeled alternative in {@link pdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprFloat(pdrawParser.ExprFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFloat}
	 * labeled alternative in {@link pdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprFloat(pdrawParser.ExprFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link pdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprInteger(pdrawParser.ExprIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link pdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprInteger(pdrawParser.ExprIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link pdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprId(pdrawParser.ExprIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link pdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprId(pdrawParser.ExprIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMultDivMod}
	 * labeled alternative in {@link pdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprMultDivMod(pdrawParser.ExprMultDivModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMultDivMod}
	 * labeled alternative in {@link pdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprMultDivMod(pdrawParser.ExprMultDivModContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdrawParser#execute}.
	 * @param ctx the parse tree
	 */
	void enterExecute(pdrawParser.ExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdrawParser#execute}.
	 * @param ctx the parse tree
	 */
	void exitExecute(pdrawParser.ExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdrawParser#tuple}.
	 * @param ctx the parse tree
	 */
	void enterTuple(pdrawParser.TupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdrawParser#tuple}.
	 * @param ctx the parse tree
	 */
	void exitTuple(pdrawParser.TupleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Degree}
	 * labeled alternative in {@link pdrawParser#angle}.
	 * @param ctx the parse tree
	 */
	void enterDegree(pdrawParser.DegreeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Degree}
	 * labeled alternative in {@link pdrawParser#angle}.
	 * @param ctx the parse tree
	 */
	void exitDegree(pdrawParser.DegreeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Radian}
	 * labeled alternative in {@link pdrawParser#angle}.
	 * @param ctx the parse tree
	 */
	void enterRadian(pdrawParser.RadianContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Radian}
	 * labeled alternative in {@link pdrawParser#angle}.
	 * @param ctx the parse tree
	 */
	void exitRadian(pdrawParser.RadianContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forward}
	 * labeled alternative in {@link pdrawParser#moveAction}.
	 * @param ctx the parse tree
	 */
	void enterForward(pdrawParser.ForwardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forward}
	 * labeled alternative in {@link pdrawParser#moveAction}.
	 * @param ctx the parse tree
	 */
	void exitForward(pdrawParser.ForwardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code backward}
	 * labeled alternative in {@link pdrawParser#moveAction}.
	 * @param ctx the parse tree
	 */
	void enterBackward(pdrawParser.BackwardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code backward}
	 * labeled alternative in {@link pdrawParser#moveAction}.
	 * @param ctx the parse tree
	 */
	void exitBackward(pdrawParser.BackwardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code left}
	 * labeled alternative in {@link pdrawParser#moveAction}.
	 * @param ctx the parse tree
	 */
	void enterLeft(pdrawParser.LeftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code left}
	 * labeled alternative in {@link pdrawParser#moveAction}.
	 * @param ctx the parse tree
	 */
	void exitLeft(pdrawParser.LeftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code right}
	 * labeled alternative in {@link pdrawParser#moveAction}.
	 * @param ctx the parse tree
	 */
	void enterRight(pdrawParser.RightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code right}
	 * labeled alternative in {@link pdrawParser#moveAction}.
	 * @param ctx the parse tree
	 */
	void exitRight(pdrawParser.RightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code down}
	 * labeled alternative in {@link pdrawParser#penAction}.
	 * @param ctx the parse tree
	 */
	void enterDown(pdrawParser.DownContext ctx);
	/**
	 * Exit a parse tree produced by the {@code down}
	 * labeled alternative in {@link pdrawParser#penAction}.
	 * @param ctx the parse tree
	 */
	void exitDown(pdrawParser.DownContext ctx);
	/**
	 * Enter a parse tree produced by the {@code up}
	 * labeled alternative in {@link pdrawParser#penAction}.
	 * @param ctx the parse tree
	 */
	void enterUp(pdrawParser.UpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code up}
	 * labeled alternative in {@link pdrawParser#penAction}.
	 * @param ctx the parse tree
	 */
	void exitUp(pdrawParser.UpContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdrawParser#typeCast}.
	 * @param ctx the parse tree
	 */
	void enterTypeCast(pdrawParser.TypeCastContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdrawParser#typeCast}.
	 * @param ctx the parse tree
	 */
	void exitTypeCast(pdrawParser.TypeCastContext ctx);
}