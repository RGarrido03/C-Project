// Generated from Elements.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ElementsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ElementsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ElementsParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ElementsParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link ElementsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddSub(ElementsParser.ExprAddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPow}
	 * labeled alternative in {@link ElementsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPow(ElementsParser.ExprPowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link ElementsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprString(ElementsParser.ExprStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprCast}
	 * labeled alternative in {@link ElementsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCast(ElementsParser.ExprCastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link ElementsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParent(ElementsParser.ExprParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link ElementsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprUnary(ElementsParser.ExprUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprFloat}
	 * labeled alternative in {@link ElementsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFloat(ElementsParser.ExprFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprStdIn}
	 * labeled alternative in {@link ElementsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStdIn(ElementsParser.ExprStdInContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link ElementsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInteger(ElementsParser.ExprIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link ElementsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprId(ElementsParser.ExprIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprVariable}
	 * labeled alternative in {@link ElementsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprVariable(ElementsParser.ExprVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMultDivMod}
	 * labeled alternative in {@link ElementsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultDivMod(ElementsParser.ExprMultDivModContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElementsParser#execute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute(ElementsParser.ExecuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElementsParser#stdin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStdin(ElementsParser.StdinContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElementsParser#tuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple(ElementsParser.TupleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Degree}
	 * labeled alternative in {@link ElementsParser#angle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDegree(ElementsParser.DegreeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Radian}
	 * labeled alternative in {@link ElementsParser#angle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRadian(ElementsParser.RadianContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forward}
	 * labeled alternative in {@link ElementsParser#moveAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForward(ElementsParser.ForwardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code backward}
	 * labeled alternative in {@link ElementsParser#moveAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackward(ElementsParser.BackwardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code left}
	 * labeled alternative in {@link ElementsParser#moveAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft(ElementsParser.LeftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code right}
	 * labeled alternative in {@link ElementsParser#moveAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight(ElementsParser.RightContext ctx);
	/**
	 * Visit a parse tree produced by the {@code down}
	 * labeled alternative in {@link ElementsParser#penAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDown(ElementsParser.DownContext ctx);
	/**
	 * Visit a parse tree produced by the {@code up}
	 * labeled alternative in {@link ElementsParser#penAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUp(ElementsParser.UpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElementsParser#typeCast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCast(ElementsParser.TypeCastContext ctx);
}