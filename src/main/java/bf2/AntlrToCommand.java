package bf2;

import antlr.bf2BaseVisitor;
import antlr.bf2Parser;

public class AntlrToCommand extends bf2BaseVisitor<Command>{

    @Override
    public Command visitCommandLoop(bf2Parser.CommandLoopContext ctx) {
        System.out.println("visitCommandLoop");
        return super.visitCommandLoop(ctx);
    }

    @Override
    public Command visitCommandIfStatement(bf2Parser.CommandIfStatementContext ctx) {
        System.out.println("visitCommandIfStatement");
        return super.visitCommandIfStatement(ctx);
    }

    @Override
    public Command visitCommandFuncCall(bf2Parser.CommandFuncCallContext ctx) {
        System.out.println("visitCommandFuncCall");
        return super.visitCommandFuncCall(ctx);
    }

    @Override
    public Command visitCommandDirectionalMove(bf2Parser.CommandDirectionalMoveContext ctx) {
        System.out.println("visitCommandDirectionalMove");
        return super.visitCommandDirectionalMove(ctx);
    }

    @Override
    public Command visitCommandExpression(bf2Parser.CommandExpressionContext ctx) {
        System.out.println("visitCommandExpression");
        return super.visitCommandExpression(ctx);
    }

    @Override
    public Command visitCommandAssign(bf2Parser.CommandAssignContext ctx) {
        System.out.println("visitCommandAssign");
        return visit(ctx.getChild(0));
    }

    @Override
    public Command visitAssignVariable(bf2Parser.AssignVariableContext ctx) {
        System.out.println("visitAssignVariable");
        return visit(ctx.getChild(1));
    }




}
