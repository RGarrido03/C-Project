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
	 * Enter a parse tree produced by {@link ipdrawParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ipdrawParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ipdrawParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ipdrawParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ipdrawParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ipdrawParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ipdrawParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ipdrawParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ipdrawParser#elseIfBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseIfBlock(ipdrawParser.ElseIfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ipdrawParser#elseIfBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseIfBlock(ipdrawParser.ElseIfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ipdrawParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(ipdrawParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ipdrawParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(ipdrawParser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ipdrawParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(ipdrawParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ipdrawParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(ipdrawParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ipdrawParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(ipdrawParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ipdrawParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(ipdrawParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ipdrawParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(ipdrawParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ipdrawParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(ipdrawParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionNot}
	 * labeled alternative in {@link ipdrawParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterConditionNot(ipdrawParser.ConditionNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionNot}
	 * labeled alternative in {@link ipdrawParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitConditionNot(ipdrawParser.ConditionNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionEquals}
	 * labeled alternative in {@link ipdrawParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterConditionEquals(ipdrawParser.ConditionEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionEquals}
	 * labeled alternative in {@link ipdrawParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitConditionEquals(ipdrawParser.ConditionEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionNotEquals}
	 * labeled alternative in {@link ipdrawParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterConditionNotEquals(ipdrawParser.ConditionNotEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionNotEquals}
	 * labeled alternative in {@link ipdrawParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitConditionNotEquals(ipdrawParser.ConditionNotEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionLessThan}
	 * labeled alternative in {@link ipdrawParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterConditionLessThan(ipdrawParser.ConditionLessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionLessThan}
	 * labeled alternative in {@link ipdrawParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitConditionLessThan(ipdrawParser.ConditionLessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionGreaterThan}
	 * labeled alternative in {@link ipdrawParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterConditionGreaterThan(ipdrawParser.ConditionGreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionGreaterThan}
	 * labeled alternative in {@link ipdrawParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitConditionGreaterThan(ipdrawParser.ConditionGreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionLessEqual}
	 * labeled alternative in {@link ipdrawParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterConditionLessEqual(ipdrawParser.ConditionLessEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionLessEqual}
	 * labeled alternative in {@link ipdrawParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitConditionLessEqual(ipdrawParser.ConditionLessEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionGreaterEqual}
	 * labeled alternative in {@link ipdrawParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterConditionGreaterEqual(ipdrawParser.ConditionGreaterEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionGreaterEqual}
	 * labeled alternative in {@link ipdrawParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitConditionGreaterEqual(ipdrawParser.ConditionGreaterEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionAnd}
	 * labeled alternative in {@link ipdrawParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterConditionAnd(ipdrawParser.ConditionAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionAnd}
	 * labeled alternative in {@link ipdrawParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitConditionAnd(ipdrawParser.ConditionAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionOr}
	 * labeled alternative in {@link ipdrawParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterConditionOr(ipdrawParser.ConditionOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionOr}
	 * labeled alternative in {@link ipdrawParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitConditionOr(ipdrawParser.ConditionOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionParentheses}
	 * labeled alternative in {@link ipdrawParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterConditionParentheses(ipdrawParser.ConditionParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionParentheses}
	 * labeled alternative in {@link ipdrawParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitConditionParentheses(ipdrawParser.ConditionParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstructionMoveAction}
	 * labeled alternative in {@link ipdrawParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstructionMoveAction(ipdrawParser.InstructionMoveActionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstructionMoveAction}
	 * labeled alternative in {@link ipdrawParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstructionMoveAction(ipdrawParser.InstructionMoveActionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstructionWriteAction}
	 * labeled alternative in {@link ipdrawParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstructionWriteAction(ipdrawParser.InstructionWriteActionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstructionWriteAction}
	 * labeled alternative in {@link ipdrawParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstructionWriteAction(ipdrawParser.InstructionWriteActionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstructionRotateAction}
	 * labeled alternative in {@link ipdrawParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstructionRotateAction(ipdrawParser.InstructionRotateActionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstructionRotateAction}
	 * labeled alternative in {@link ipdrawParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstructionRotateAction(ipdrawParser.InstructionRotateActionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstructionPenAction}
	 * labeled alternative in {@link ipdrawParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstructionPenAction(ipdrawParser.InstructionPenActionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstructionPenAction}
	 * labeled alternative in {@link ipdrawParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstructionPenAction(ipdrawParser.InstructionPenActionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstructionArrowProps}
	 * labeled alternative in {@link ipdrawParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstructionArrowProps(ipdrawParser.InstructionArrowPropsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstructionArrowProps}
	 * labeled alternative in {@link ipdrawParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstructionArrowProps(ipdrawParser.InstructionArrowPropsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentVar}
	 * labeled alternative in {@link ipdrawParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentVar(ipdrawParser.AssignmentVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentVar}
	 * labeled alternative in {@link ipdrawParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentVar(ipdrawParser.AssignmentVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReAssignmentVar}
	 * labeled alternative in {@link ipdrawParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterReAssignmentVar(ipdrawParser.ReAssignmentVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReAssignmentVar}
	 * labeled alternative in {@link ipdrawParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitReAssignmentVar(ipdrawParser.ReAssignmentVarContext ctx);
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
	 * Enter a parse tree produced by {@link ipdrawParser#pause}.
	 * @param ctx the parse tree
	 */
	void enterPause(ipdrawParser.PauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ipdrawParser#pause}.
	 * @param ctx the parse tree
	 */
	void exitPause(ipdrawParser.PauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stdout}
	 * labeled alternative in {@link ipdrawParser#print}.
	 * @param ctx the parse tree
	 */
	void enterStdout(ipdrawParser.StdoutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stdout}
	 * labeled alternative in {@link ipdrawParser#print}.
	 * @param ctx the parse tree
	 */
	void exitStdout(ipdrawParser.StdoutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stderr}
	 * labeled alternative in {@link ipdrawParser#print}.
	 * @param ctx the parse tree
	 */
	void enterStderr(ipdrawParser.StderrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stderr}
	 * labeled alternative in {@link ipdrawParser#print}.
	 * @param ctx the parse tree
	 */
	void exitStderr(ipdrawParser.StderrContext ctx);
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
	 * Enter a parse tree produced by {@link ipdrawParser#incdec}.
	 * @param ctx the parse tree
	 */
	void enterIncdec(ipdrawParser.IncdecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ipdrawParser#incdec}.
	 * @param ctx the parse tree
	 */
	void exitIncdec(ipdrawParser.IncdecContext ctx);
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
	 * Enter a parse tree produced by the {@code ExprIncDec}
	 * labeled alternative in {@link ipdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprIncDec(ipdrawParser.ExprIncDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprIncDec}
	 * labeled alternative in {@link ipdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprIncDec(ipdrawParser.ExprIncDecContext ctx);
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
	 * Enter a parse tree produced by {@link ipdrawParser#rotateAction}.
	 * @param ctx the parse tree
	 */
	void enterRotateAction(ipdrawParser.RotateActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ipdrawParser#rotateAction}.
	 * @param ctx the parse tree
	 */
	void exitRotateAction(ipdrawParser.RotateActionContext ctx);
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
	 * Enter a parse tree produced by {@link ipdrawParser#penAction}.
	 * @param ctx the parse tree
	 */
	void enterPenAction(ipdrawParser.PenActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ipdrawParser#penAction}.
	 * @param ctx the parse tree
	 */
	void exitPenAction(ipdrawParser.PenActionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrowColor}
	 * labeled alternative in {@link ipdrawParser#arrowProps}.
	 * @param ctx the parse tree
	 */
	void enterArrowColor(ipdrawParser.ArrowColorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrowColor}
	 * labeled alternative in {@link ipdrawParser#arrowProps}.
	 * @param ctx the parse tree
	 */
	void exitArrowColor(ipdrawParser.ArrowColorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrowPosition}
	 * labeled alternative in {@link ipdrawParser#arrowProps}.
	 * @param ctx the parse tree
	 */
	void enterArrowPosition(ipdrawParser.ArrowPositionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrowPosition}
	 * labeled alternative in {@link ipdrawParser#arrowProps}.
	 * @param ctx the parse tree
	 */
	void exitArrowPosition(ipdrawParser.ArrowPositionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrowOrientation}
	 * labeled alternative in {@link ipdrawParser#arrowProps}.
	 * @param ctx the parse tree
	 */
	void enterArrowOrientation(ipdrawParser.ArrowOrientationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrowOrientation}
	 * labeled alternative in {@link ipdrawParser#arrowProps}.
	 * @param ctx the parse tree
	 */
	void exitArrowOrientation(ipdrawParser.ArrowOrientationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrowThickness}
	 * labeled alternative in {@link ipdrawParser#arrowProps}.
	 * @param ctx the parse tree
	 */
	void enterArrowThickness(ipdrawParser.ArrowThicknessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrowThickness}
	 * labeled alternative in {@link ipdrawParser#arrowProps}.
	 * @param ctx the parse tree
	 */
	void exitArrowThickness(ipdrawParser.ArrowThicknessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrowPressure}
	 * labeled alternative in {@link ipdrawParser#arrowProps}.
	 * @param ctx the parse tree
	 */
	void enterArrowPressure(ipdrawParser.ArrowPressureContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrowPressure}
	 * labeled alternative in {@link ipdrawParser#arrowProps}.
	 * @param ctx the parse tree
	 */
	void exitArrowPressure(ipdrawParser.ArrowPressureContext ctx);
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