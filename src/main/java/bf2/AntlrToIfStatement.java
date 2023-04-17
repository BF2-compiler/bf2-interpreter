package bf2;

import antlr.bf2BaseVisitor;
import antlr.bf2Parser;

public class AntlrToIfStatement extends bf2BaseVisitor<IfStatement>{
    @Override
    public IfStatement visitIfStatement(bf2Parser.IfStatementContext ctx) {
        System.out.println("Antlr To If Statement");
        AntlrToBoolStatement boolStatement = new AntlrToBoolStatement();
        AntlrToBlock commandBlock = new AntlrToBlock();

        System.out.println(ctx.getChild(0).getText());
        System.out.println(ctx.getChild(1).getText());
        System.out.println(ctx.getChild(2).getText());
        System.out.println(ctx.getChild(3).getText());
        System.out.println(ctx.getChild(4).getText());

        BoolStatement statement = boolStatement.visit(ctx.getChild(2));
        System.out.println(statement.satisfied);
        return new IfStatement(statement.satisfied, commandBlock.visit(ctx.getChild(4)));
    }
}
