package bf2;

import GUI.BF2Frame;
import antlr.bf2BaseVisitor;
import antlr.bf2Parser;

import java.util.Objects;

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
        if (Objects.equals(funcName, "READ_AS_STRING")) {
            BF2Frame frame = new BF2Frame();
            frame.print_as_string();
            frame.pack();
            frame.setVisible(true);
            return null;
        } else if (Objects.equals(funcName, "READ_AS_INT")) {
            BF2Frame frame = new BF2Frame();
            frame.print_as_int();
            frame.pack();
            frame.setVisible(true);
            return null;
        } else if (Objects.equals(funcName, "READ_AS_COLORS")) {
            BF2Frame frame = new BF2Frame();
            frame.print_as_colors();
            frame.pack();
            frame.setVisible(true);
            return null;
        } else {
            return Functions.getBlockFromFunction(funcName);
        }
    }

    @Override
    public Command visitCommandDirectionalMove(bf2Parser.CommandDirectionalMoveContext ctx){
        AntlrToDirectionalMove directionalMove = new AntlrToDirectionalMove();
        return directionalMove.visit(ctx.getChild(0));
    }

    @Override
    public Command visitCommandExpression(bf2Parser.CommandExpressionContext ctx) {
        AntlrToExpression x = new AntlrToExpression();

        return x.visit(ctx.getChild(0));
    }

    @Override
    public Command visitCommandAssign(bf2Parser.CommandAssignContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public Command visitAssign(bf2Parser.AssignContext ctx) {
        AntlrToExpression expressionVisitor = new AntlrToExpression();
        return expressionVisitor.visit(ctx.getChild(1));
    }

}
