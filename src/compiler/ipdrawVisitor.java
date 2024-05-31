// Generated from ipdraw.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ipdrawParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ipdrawVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ipdrawParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(ipdrawParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link ipdrawParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(ipdrawParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ipdrawParser#moveAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveAction(ipdrawParser.MoveActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ipdrawParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ipdrawParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link ipdrawParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddSub(ipdrawParser.ExprAddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPow}
	 * labeled alternative in {@link ipdrawParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPow(ipdrawParser.ExprPowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link ipdrawParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprString(ipdrawParser.ExprStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprCast}
	 * labeled alternative in {@link ipdrawParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCast(ipdrawParser.ExprCastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link ipdrawParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParent(ipdrawParser.ExprParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link ipdrawParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprUnary(ipdrawParser.ExprUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprFloat}
	 * labeled alternative in {@link ipdrawParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFloat(ipdrawParser.ExprFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprStdIn}
	 * labeled alternative in {@link ipdrawParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStdIn(ipdrawParser.ExprStdInContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link ipdrawParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInteger(ipdrawParser.ExprIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprBool}
	 * labeled alternative in {@link ipdrawParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBool(ipdrawParser.ExprBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprVariable}
	 * labeled alternative in {@link ipdrawParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprVariable(ipdrawParser.ExprVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMultDivMod}
	 * labeled alternative in {@link ipdrawParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultDivMod(ipdrawParser.ExprMultDivModContext ctx);
	/**
	 * Visit a parse tree produced by {@link ipdrawParser#stdin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStdin(ipdrawParser.StdinContext ctx);
	/**
	 * Visit a parse tree produced by {@link ipdrawParser#tuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple(ipdrawParser.TupleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Degree}
	 * labeled alternative in {@link ipdrawParser#angle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDegree(ipdrawParser.DegreeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Radian}
	 * labeled alternative in {@link ipdrawParser#angle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRadian(ipdrawParser.RadianContext ctx);
	/**
	 * Visit a parse tree produced by the {@code down}
	 * labeled alternative in {@link ipdrawParser#penAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDown(ipdrawParser.DownContext ctx);
	/**
	 * Visit a parse tree produced by the {@code up}
	 * labeled alternative in {@link ipdrawParser#penAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUp(ipdrawParser.UpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ipdrawParser#typeCast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCast(ipdrawParser.TypeCastContext ctx);
}