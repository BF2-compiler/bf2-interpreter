package bf2;

import antlr.bf2BaseVisitor;
import antlr.bf2Parser;

public class AntlrToIfStatement extends bf2BaseVisitor<IfStatement>{
    @Override
    public IfStatement visitIfStatement(bf2Parser.IfStatementContext ctx) {
        AntlrToBoolStatement boolStatementVisitor = new AntlrToBoolStatement();
        AntlrToBlock commandBlockVisitor = new AntlrToBlock();
        IfStatement returnIfStatement = new IfStatement();

        for (int i = 0; i < ctx.getChildCount(); i++) {
            String instruction = ctx.getChild(i).getText();
            switch (instruction) {
                case "if", "elif" -> {
                    BoolStatement statement = boolStatementVisitor.visit(ctx.getChild(i + 2));
                    Block blockIf = commandBlockVisitor.visit(ctx.getChild(i + 4));
                    returnIfStatement.addBlock(blockIf, statement.satisfied);
                }
                case "else" -> {
                    Block blockElse = commandBlockVisitor.visit(ctx.getChild(i + 1));
                    returnIfStatement.addBlock(blockElse, true);
                }
            }
        }
        return returnIfStatement;
    }
}
