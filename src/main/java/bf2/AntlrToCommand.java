package bf2;

import antlr.bf2BaseVisitor;
import antlr.bf2Parser;

public class AntlrToCommand extends bf2BaseVisitor<Command>{

    private final int SIZE = 8;
    private int[][] mainBoard = new int[SIZE][SIZE];
    public int pointerX, pointerY;

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

        String numText = ctx.getChild(1).getText();
        mainBoard[pointerX][pointerY] = Integer.parseInt(numText);

        System.out.println(Integer.parseInt(numText));
        return super.visitAssignVariable(ctx);
    }

    @Override
    public Command visitAssignNumber(bf2Parser.AssignNumberContext ctx) {
        return super.visitAssignNumber(ctx);
    }

    @Override
    public Command visitMoveLeft(bf2Parser.MoveLeftContext ctx) {
        pointerX--;

        return super.visitMoveLeft(ctx);
    }

    @Override
    public Command visitMoveRight(bf2Parser.MoveRightContext ctx) {
        pointerX++;

        return super.visitMoveRight(ctx);
    }

    @Override
    public Command visitMoveUp(bf2Parser.MoveUpContext ctx) {
        pointerY--;
        return super.visitMoveUp(ctx);
    }

    @Override
    public Command visitMoveDown(bf2Parser.MoveDownContext ctx) {
        pointerY++;
        return super.visitMoveDown(ctx);
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
