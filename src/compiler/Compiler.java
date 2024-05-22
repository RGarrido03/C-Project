import org.stringtemplate.v4.ST;

@SuppressWarnings("CheckReturnValue")
public class Compiler extends pdrawBaseVisitor<ST> {

    @Override
    public ST visitMain(pdrawParser.MainContext ctx) {
        ST res = null;
        return visitChildren(ctx);
        //return res;
    }

    @Override
    public ST visitStatement(pdrawParser.StatementContext ctx) {
        ST res = null;
        return visitChildren(ctx);
        //return res;
    }

    @Override
    public ST visitInstructionMoveAction(
            pdrawParser.InstructionMoveActionContext ctx
    ) {
        ST res = null;
        return visitChildren(ctx);
        //return res;
    }

    @Override
    public ST visitInstructionPenAction(
            pdrawParser.InstructionPenActionContext ctx
    ) {
        ST res = null;
        return visitChildren(ctx);
        //return res;
    }

    @Override
    public ST visitAssignmentVar(pdrawParser.AssignmentVarContext ctx) {
        ST res = null;
        return visitChildren(ctx);
        //return res;
    }

    @Override
    public ST visitAssignmentPen(pdrawParser.AssignmentPenContext ctx) {
        ST res = null;
        return visitChildren(ctx);
        //return res;
    }

    @Override
    public ST visitReAssignmentVar(pdrawParser.ReAssignmentVarContext ctx) {
        ST res = null;
        return visitChildren(ctx);
        //return res;
    }

    @Override
    public ST visitCast(pdrawParser.CastContext ctx) {
        ST res = null;
        return visitChildren(ctx);
        //return res;
    }

    @Override
    public ST visitPause(pdrawParser.PauseContext ctx) {
        ST res = null;
        return visitChildren(ctx);
        //return res;
    }

    @Override
    public ST visitStdout(pdrawParser.StdoutContext ctx) {
        ST res = null;
        return visitChildren(ctx);
        //return res;
    }

    @Override
    public ST visitStderr(pdrawParser.StderrContext ctx) {
        ST res = null;
        return visitChildren(ctx);
        //return res;
    }

    @Override
    public ST visitExecute(pdrawParser.ExecuteContext ctx) {
        ST res = null;
        return visitChildren(ctx);
        //return res;
    }

    @Override
    public ST visitCreateCanvas(pdrawParser.CreateCanvasContext ctx) {
        ST res = null;
        return visitChildren(ctx);
        //return res;
    }

    @Override
    public ST visitCreatePen(pdrawParser.CreatePenContext ctx) {
        ST res = null;
        return visitChildren(ctx);
        //return res;
    }

    @Override
    public ST visitClassProps(pdrawParser.ClassPropsContext ctx) {
        ST res = null;
        return visitChildren(ctx);
        //return res;
    }

    @Override
    public ST visitObject(pdrawParser.ObjectContext ctx) {
        ST res = null;
        return visitChildren(ctx);
        //return res;
    }

    @Override
    public ST visitVariable(pdrawParser.VariableContext ctx) {
        ST res = null;
        return visitChildren(ctx);
        //return res;
    }

    @Override
    public ST visitExprAddSub(pdrawParser.ExprAddSubContext ctx) {
        ST res = null;
        return visitChildren(ctx);
        //return res;
    }

    @Override
    public ST visitExprPow(pdrawParser.ExprPowContext ctx) {
        ST res = null;
        return visitChildren(ctx);
        //return res;
    }

    @Override
    public ST visitExprCast(pdrawParser.ExprCastContext ctx) {
        ST res = null;
        return visitChildren(ctx);
        //return res;
    }

    @Override
    public ST visitExprParent(pdrawParser.ExprParentContext ctx) {
        ST res = null;
        return visitChildren(ctx);
        //return res;
    }

    @Override
    public ST visitExprUnary(pdrawParser.ExprUnaryContext ctx) {
        ST res = null;
        return visitChildren(ctx);
        //return res;
    }

    @Override
    public ST visitExprFloat(pdrawParser.ExprFloatContext ctx) {
        ST res = null;
        return visitChildren(ctx);
        //return res;
    }

    @Override
    public ST visitExprStdIn(pdrawParser.ExprStdInContext ctx) {
        ST res = null;
        return visitChildren(ctx);
        //return res;
    }

    @Override
    public ST visitExprInteger(pdrawParser.ExprIntegerContext ctx) {
        ST res = null;
        return visitChildren(ctx);
        //return res;
    }

    @Override
    public ST visitExprId(pdrawParser.ExprIdContext ctx) {
        ST res = null;
        return visitChildren(ctx);
        //return res;
    }

    @Override
    public ST visitExprMultDivMod(pdrawParser.ExprMultDivModContext ctx) {
        ST res = null;
        return visitChildren(ctx);
        //return res;
    }

    @Override
    public ST visitStdin(pdrawParser.StdinContext ctx) {
        ST res = null;
        return visitChildren(ctx);
        //return res;
    }

    @Override
    public ST visitTuple(pdrawParser.TupleContext ctx) {
        ST res = null;
        return visitChildren(ctx);
        //return res;
    }

    @Override
    public ST visitDegree(pdrawParser.DegreeContext ctx) {
        ST res = null;
        return visitChildren(ctx);
        //return res;
    }

    @Override
    public ST visitRadian(pdrawParser.RadianContext ctx) {
        ST res = null;
        return visitChildren(ctx);
        //return res;
    }

    @Override
    public ST visitForward(pdrawParser.ForwardContext ctx) {
        ST res = null;
        return visitChildren(ctx);
        //return res;
    }

    @Override
    public ST visitBackward(pdrawParser.BackwardContext ctx) {
        ST res = null;
        return visitChildren(ctx);
        //return res;
    }

    @Override
    public ST visitLeft(pdrawParser.LeftContext ctx) {
        ST res = null;
        return visitChildren(ctx);
        //return res;
    }

    @Override
    public ST visitRight(pdrawParser.RightContext ctx) {
        ST res = null;
        return visitChildren(ctx);
        //return res;
    }

    @Override
    public ST visitDown(pdrawParser.DownContext ctx) {
        ST res = null;
        return visitChildren(ctx);
        //return res;
    }

    @Override
    public ST visitUp(pdrawParser.UpContext ctx) {
        ST res = null;
        return visitChildren(ctx);
        //return res;
    }

    @Override
    public ST visitTypeCast(pdrawParser.TypeCastContext ctx) {
        ST res = null;
        return visitChildren(ctx);
        //return res;
    }
}
