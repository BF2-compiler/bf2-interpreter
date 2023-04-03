package bf2;

import antlr.bf2BaseVisitor;
import antlr.bf2Parser;

public class AntlrToLine extends bf2BaseVisitor<Line>{
    @Override
    public Line visitCommandComment(bf2Parser.CommandCommentContext ctx) {

        return visit(ctx.getChild(0));
    }

    @Override
    public Line visitComment(bf2Parser.CommentContext ctx) {

        return super.visitComment(ctx);
    }

    @Override
    public Line visitDefinitionOfFunction(bf2Parser.DefinitionOfFunctionContext ctx) {
        return super.visitDefinitionOfFunction(ctx);
    }

    @Override
    public Line visitCommandPrint(bf2Parser.CommandPrintContext ctx) {
        return super.visitCommandPrint(ctx);
    }


}
