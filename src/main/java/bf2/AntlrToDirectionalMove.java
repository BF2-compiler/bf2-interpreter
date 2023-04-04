package bf2;

import antlr.bf2Parser;
import antlr.bf2BaseVisitor;

public class AntlrToDirectionalMove extends bf2BaseVisitor<DirectionalMove> {
    @Override
    public DirectionalMove visitMoveLeft(bf2Parser.MoveLeftContext ctx) {
        return new DirectionalMove(-1, 0);
    }

    @Override
    public DirectionalMove visitMoveRight(bf2Parser.MoveRightContext ctx) {
        return new DirectionalMove(1, 0);
    }

    @Override
    public DirectionalMove visitMoveUp(bf2Parser.MoveUpContext ctx) {
        return new DirectionalMove(0, -1);
    }

    @Override
    public DirectionalMove visitMoveDown(bf2Parser.MoveDownContext ctx) {
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
