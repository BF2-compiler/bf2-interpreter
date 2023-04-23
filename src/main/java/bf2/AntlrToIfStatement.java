package bf2;

import antlr.bf2BaseVisitor;
import antlr.bf2Parser;

public class AntlrToIfStatement extends bf2BaseVisitor<IfStatement>{
    @Override
    public IfStatement visitIfStatement(bf2Parser.IfStatementContext ctx) {
        AntlrToBoolStatement boolStatement = new AntlrToBoolStatement();
        AntlrToBlock commandBlock = new AntlrToBlock();
        BoolStatement statement = boolStatement.visit(ctx.getChild(2));
        //TODO dorobic elif i else
        return new IfStatement(statement.satisfied, commandBlock.visit(ctx.getChild(4)));
    }
}
