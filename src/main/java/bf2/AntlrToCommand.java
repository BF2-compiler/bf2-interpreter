package bf2;

import antlr.bf2BaseVisitor;
import antlr.bf2Parser;

public class AntlrToCommand extends bf2BaseVisitor<Command>{

    @Override
    public Command visitCommandLoop(bf2Parser.CommandLoopContext ctx) {
        AntlrToLoop antlrToLoop = new AntlrToLoop();
        return antlrToLoop.visit(ctx.getChild(0));
    }

    @Override
    public Command visitCommandIfStatement(bf2Parser.CommandIfStatementContext ctx) {
        AntlrToIfStatement antlrToIfStatement = new AntlrToIfStatement();
        return antlrToIfStatement.visit(ctx.getChild(0));
    }

    @Override
    public Command visitCommandFuncCall(bf2Parser.CommandFuncCallContext ctx) {
        String funcName = ctx.getChild(0).getText();

        return new Function(funcName);
    }

    @Override
    public Command visitCommandDirectionalMove(bf2Parser.CommandDirectionalMoveContext ctx){
        AntlrToDirectionalMove directionalMove = new AntlrToDirectionalMove();
        return directionalMove.visit(ctx.getChild(0));
    }

    @Override
    public Command visitCommandExpression(bf2Parser.CommandExpressionContext ctx) {
        return super.visitCommandExpression(ctx);
    }

    @Override
    public Command visitCommandAssign(bf2Parser.CommandAssignContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public Command visitAssign(bf2Parser.AssignContext ctx) {
        AntlrToVarGetter varGetter = new AntlrToVarGetter();
        return varGetter.visit(ctx.getChild(1));
    }




}
