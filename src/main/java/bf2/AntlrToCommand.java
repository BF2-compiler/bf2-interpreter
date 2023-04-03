package bf2;

import antlr.bf2BaseVisitor;
import antlr.bf2Parser;

public class AntlrToCommand extends bf2BaseVisitor<Command>{


    @Override
    public Command visitCommand(bf2Parser.CommandContext ctx) {
        return super.visitCommand(ctx);
    }

    @Override
    public Command visitDoLoop(bf2Parser.DoLoopContext ctx) {
        return super.visitDoLoop(ctx);
    }

    @Override
    public Command visitConditionalLoop(bf2Parser.ConditionalLoopContext ctx) {
        return super.visitConditionalLoop(ctx);
    }

    @Override
    public Command visitAssignVariable(bf2Parser.AssignVariableContext ctx) {
        return visit(ctx.getChild(1));
    }

    @Override
    public Command visitAssignNumber(bf2Parser.AssignNumberContext ctx) {
        return super.visitAssignNumber(ctx);
    }

    @Override
    public Command visitMoveLeft(bf2Parser.MoveLeftContext ctx) {
        return new DirectionalMove(-1, 0);
    }

    @Override
    public Command visitMoveRight(bf2Parser.MoveRightContext ctx) {
        return new DirectionalMove(1, 0);
    }

    @Override
    public Command visitMoveUp(bf2Parser.MoveUpContext ctx) {
        return new DirectionalMove(0, -1);
    }

    @Override
    public Command visitMoveDown(bf2Parser.MoveDownContext ctx) {
        return new DirectionalMove(0, 1);
    }

    @Override
    public Command visitLowerBoard(bf2Parser.LowerBoardContext ctx) {
        return super.visitLowerBoard(ctx);
    }

    @Override
    public Command visitUpperBoard(bf2Parser.UpperBoardContext ctx) {
        return super.visitUpperBoard(ctx);
    }
}
