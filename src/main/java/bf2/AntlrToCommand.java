package bf2;

import antlr.bf2BaseVisitor;
import antlr.bf2Parser;

public class AntlrToCommand extends bf2BaseVisitor<Command>{

    @Override
    public Command visitCommandLoop(bf2Parser.CommandLoopContext ctx) {
        return super.visitCommandLoop(ctx);
    }

    @Override
    public Command visitCommandIfStatement(bf2Parser.CommandIfStatementContext ctx) {
        return super.visitCommandIfStatement(ctx);
    }

    @Override
    public Command visitCommandFuncCall(bf2Parser.CommandFuncCallContext ctx) {
        return super.visitCommandFuncCall(ctx);
    }

    @Override
    public Command visitCommandDirectionalMove(bf2Parser.CommandDirectionalMoveContext ctx) {
        return super.visitCommandDirectionalMove(ctx);
    }

    @Override
    public Command visitCommandExpression(bf2Parser.CommandExpressionContext ctx) {
        return super.visitCommandExpression(ctx);
    }

    @Override
    public Command visitAssignVariable(bf2Parser.AssignVariableContext ctx) {
        return visit(ctx.getChild(1));
    }



}
