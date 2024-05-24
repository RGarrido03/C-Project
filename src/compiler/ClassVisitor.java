// Generated from Class.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ClassParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ClassVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code CreateCanvas}
	 * labeled alternative in {@link ClassParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateCanvas(ClassParser.CreateCanvasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CreatePen}
	 * labeled alternative in {@link ClassParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatePen(ClassParser.CreatePenContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassParser#classProps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassProps(ClassParser.ClassPropsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(ClassParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ClassParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link ClassParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddSub(ClassParser.ExprAddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPow}
	 * labeled alternative in {@link ClassParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPow(ClassParser.ExprPowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link ClassParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprString(ClassParser.ExprStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprCast}
	 * labeled alternative in {@link ClassParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCast(ClassParser.ExprCastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link ClassParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParent(ClassParser.ExprParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link ClassParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprUnary(ClassParser.ExprUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprFloat}
	 * labeled alternative in {@link ClassParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFloat(ClassParser.ExprFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprStdIn}
	 * labeled alternative in {@link ClassParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStdIn(ClassParser.ExprStdInContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link ClassParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInteger(ClassParser.ExprIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprBool}
	 * labeled alternative in {@link ClassParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBool(ClassParser.ExprBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprVariable}
	 * labeled alternative in {@link ClassParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprVariable(ClassParser.ExprVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMultDivMod}
	 * labeled alternative in {@link ClassParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultDivMod(ClassParser.ExprMultDivModContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassParser#execute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute(ClassParser.ExecuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassParser#stdin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStdin(ClassParser.StdinContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassParser#tuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple(ClassParser.TupleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Degree}
	 * labeled alternative in {@link ClassParser#angle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDegree(ClassParser.DegreeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Radian}
	 * labeled alternative in {@link ClassParser#angle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRadian(ClassParser.RadianContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forward}
	 * labeled alternative in {@link ClassParser#moveAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForward(ClassParser.ForwardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code backward}
	 * labeled alternative in {@link ClassParser#moveAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackward(ClassParser.BackwardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code left}
	 * labeled alternative in {@link ClassParser#moveAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft(ClassParser.LeftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code right}
	 * labeled alternative in {@link ClassParser#moveAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight(ClassParser.RightContext ctx);
	/**
	 * Visit a parse tree produced by the {@code down}
	 * labeled alternative in {@link ClassParser#penAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDown(ClassParser.DownContext ctx);
	/**
	 * Visit a parse tree produced by the {@code up}
	 * labeled alternative in {@link ClassParser#penAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUp(ClassParser.UpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassParser#typeCast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCast(ClassParser.TypeCastContext ctx);
}