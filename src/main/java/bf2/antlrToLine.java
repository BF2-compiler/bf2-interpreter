package bf2;

import antlr.bf2BaseVisitor;
import antlr.bf2Parser;

public class antlrToLine extends bf2BaseVisitor<Line>{
    @Override
    public Line visitLine(bf2Parser.LineContext ctx) {
        return super.visitLine(ctx);
    }
}
