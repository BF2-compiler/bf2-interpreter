package bf2;

import antlr.bf2BaseVisitor;
import antlr.bf2Parser;

public class antlrToVarGetter extends bf2BaseVisitor<VarGetter>{
    @Override
    public VarGetter visitNumberGet(bf2Parser.NumberGetContext ctx) {
        String numText = ctx.getChild(0).getText();
        int number = Integer.parseInt(numText);

        return new Number(number);
    }

    @Override
    public VarGetter visitBlockGet(bf2Parser.BlockGetContext ctx) {
        return super.visitBlockGet(ctx);
    }

    @Override
    public VarGetter visitGet(bf2Parser.GetContext ctx) {
        return super.visitGet(ctx);
    }
}
