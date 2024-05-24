// Generated from pdraw.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link pdrawParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface pdrawVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link pdrawParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(pdrawParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link pdrawParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(pdrawParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InstructionMoveAction}
	 * labeled alternative in {@link pdrawParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructionMoveAction(pdrawParser.InstructionMoveActionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InstructionPenAction}
	 * labeled alternative in {@link pdrawParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructionPenAction(pdrawParser.InstructionPenActionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentVar}
	 * labeled alternative in {@link pdrawParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentVar(pdrawParser.AssignmentVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentPen}
	 * labeled alternative in {@link pdrawParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentPen(pdrawParser.AssignmentPenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReAssignmentVar}
	 * labeled alternative in {@link pdrawParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReAssignmentVar(pdrawParser.ReAssignmentVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link pdrawParser#cast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast(pdrawParser.CastContext ctx);
	/**
	 * Visit a parse tree produced by {@link pdrawParser#pause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPause(pdrawParser.PauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stdout}
	 * labeled alternative in {@link pdrawParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStdout(pdrawParser.StdoutContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stderr}
	 * labeled alternative in {@link pdrawParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStderr(pdrawParser.StderrContext ctx);
	/**
	 * Visit a parse tree produced by {@link pdrawParser#execute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute(pdrawParser.ExecuteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CreateCanvas}
	 * labeled alternative in {@link pdrawParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateCanvas(pdrawParser.CreateCanvasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CreatePen}
	 * labeled alternative in {@link pdrawParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatePen(pdrawParser.CreatePenContext ctx);
	/**
	 * Visit a parse tree produced by {@link pdrawParser#classProps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassProps(pdrawParser.ClassPropsContext ctx);
	/**
	 * Visit a parse tree produced by {@link pdrawParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(pdrawParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link pdrawParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(pdrawParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link pdrawParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprString(pdrawParser.ExprStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link pdrawParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParent(pdrawParser.ExprParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprFloat}
	 * labeled alternative in {@link pdrawParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFloat(pdrawParser.ExprFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMultDivMod}
	 * labeled alternative in {@link pdrawParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultDivMod(pdrawParser.ExprMultDivModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link pdrawParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddSub(pdrawParser.ExprAddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPow}
	 * labeled alternative in {@link pdrawParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPow(pdrawParser.ExprPowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprCast}
	 * labeled alternative in {@link pdrawParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCast(pdrawParser.ExprCastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link pdrawParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprUnary(pdrawParser.ExprUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprStdIn}
	 * labeled alternative in {@link pdrawParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStdIn(pdrawParser.ExprStdInContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link pdrawParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInteger(pdrawParser.ExprIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link pdrawParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprId(pdrawParser.ExprIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprBool}
	 * labeled alternative in {@link pdrawParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBool(pdrawParser.ExprBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprVariable}
	 * labeled alternative in {@link pdrawParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprVariable(pdrawParser.ExprVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link pdrawParser#stdin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStdin(pdrawParser.StdinContext ctx);
	/**
	 * Visit a parse tree produced by {@link pdrawParser#tuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple(pdrawParser.TupleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Degree}
	 * labeled alternative in {@link pdrawParser#angle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDegree(pdrawParser.DegreeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Radian}
	 * labeled alternative in {@link pdrawParser#angle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRadian(pdrawParser.RadianContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forward}
	 * labeled alternative in {@link pdrawParser#moveAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForward(pdrawParser.ForwardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code backward}
	 * labeled alternative in {@link pdrawParser#moveAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackward(pdrawParser.BackwardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code left}
	 * labeled alternative in {@link pdrawParser#moveAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft(pdrawParser.LeftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code right}
	 * labeled alternative in {@link pdrawParser#moveAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight(pdrawParser.RightContext ctx);
	/**
	 * Visit a parse tree produced by the {@code down}
	 * labeled alternative in {@link pdrawParser#penAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDown(pdrawParser.DownContext ctx);
	/**
	 * Visit a parse tree produced by the {@code up}
	 * labeled alternative in {@link pdrawParser#penAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUp(pdrawParser.UpContext ctx);
	/**
	 * Visit a parse tree produced by {@link pdrawParser#typeCast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCast(pdrawParser.TypeCastContext ctx);
}