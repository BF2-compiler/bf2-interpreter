package bf2;

import antlr.bf2BaseVisitor;
import antlr.bf2Parser;

public class antlrToProgram extends bf2BaseVisitor<Program>{
    @Override
    public Program visitProgram(bf2Parser.ProgramContext ctx) {
        return super.visitProgram(ctx);
    }
}
