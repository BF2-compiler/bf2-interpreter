package bf2;

import antlr.bf2Parser;
import antlr.bf2BaseVisitor;

public class AntlrToDirectionalMove extends bf2BaseVisitor<DirectionalMove> {
    @Override
    public DirectionalMove visitMoveLeft(bf2Parser.MoveLeftContext ctx) throws Exception {
        if (Board.pointerX == 0)
        {
            throw new Exception("Line: " +
                    ctx.start.getLine() + " at: " +
                    ctx.start.getCharPositionInLine());
        }
        return new DirectionalMove(-1, 0);
    }

    @Override
    public DirectionalMove visitMoveRight(bf2Parser.MoveRightContext ctx) throws Exception {
        if (Board.pointerX == Board.SIZE_X - 1 )
        {
            throw new Exception("Line: " +
                    ctx.start.getLine() + " at: " +
                    ctx.start.getCharPositionInLine());
        }
        return new DirectionalMove(1, 0);
    }

    @Override
    public DirectionalMove visitMoveUp(bf2Parser.MoveUpContext ctx) throws Exception {
        if (Board.pointerY == 0)
        {
            throw new Exception("Line: " +
                    ctx.start.getLine() + " at: " +
                    ctx.start.getCharPositionInLine());
        }
        return new DirectionalMove(0, -1);
    }

    @Override
    public DirectionalMove visitMoveDown(bf2Parser.MoveDownContext ctx) throws Exception {
        if (Board.pointerY == Board.SIZE_Y - 1 )
        {
            throw new Exception("Line: " +
                    ctx.start.getLine() + " at: " +
                    ctx.start.getCharPositionInLine());
        }
        return new DirectionalMove(0, 1);
    }

    @Override
    public DirectionalMove visitLowerBoard(bf2Parser.LowerBoardContext ctx) {
        return super.visitLowerBoard(ctx);
    }

    @Override
    public DirectionalMove visitUpperBoard(bf2Parser.UpperBoardContext ctx) {
        return super.visitUpperBoard(ctx);
    }

}
