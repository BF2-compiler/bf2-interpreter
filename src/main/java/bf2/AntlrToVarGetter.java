package bf2;

import antlr.bf2BaseVisitor;
import antlr.bf2Parser;

public class AntlrToVarGetter extends bf2BaseVisitor<VarGetter>{
    @Override
    public VarGetter visitNumberGet(bf2Parser.NumberGetContext ctx) {
        String numText = ctx.getChild(0).getText();
        int number = Integer.parseInt(numText);
        return new Number(number);
    }

    @Override
    public VarGetter visitBlockGet(bf2Parser.BlockGetContext ctx) {
        AntlrToBlock visitBlock = new AntlrToBlock();
        Block block = visitBlock.visit(ctx.getChild(0));
        block.isBlockGet_ = true;
        return block;
    }

    @Override
    public VarGetter visitGet(bf2Parser.GetContext ctx) {
        return super.visitGet(ctx);
    }
}
