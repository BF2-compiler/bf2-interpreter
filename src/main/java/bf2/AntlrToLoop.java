package bf2;

import antlr.bf2BaseVisitor;
import antlr.bf2Parser;

public class AntlrToLoop extends bf2BaseVisitor<Loop> {
    @Override
    public Loop visitDoLoop(bf2Parser.DoLoopContext ctx) {
        AntlrToBlock commandBlock = new AntlrToBlock();
        return new Loop(Integer.parseInt(ctx.getChild(3).getText()),
                commandBlock.visit(ctx.getChild(1)));
    }

    @Override
    public Loop visitConditionalLoop(bf2Parser.ConditionalLoopContext ctx) {
        AntlrToBoolStatement boolStatement = new AntlrToBoolStatement();
        AntlrToBlock commandBlock = new AntlrToBlock();
        BoolStatement statement = boolStatement.visit(ctx.getChild(4));
        return new Loop(statement.satisfied, commandBlock.visit(ctx.getChild(1)));
    }
}
