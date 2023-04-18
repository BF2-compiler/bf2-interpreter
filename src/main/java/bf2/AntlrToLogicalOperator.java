package bf2;

import antlr.bf2BaseVisitor;
import antlr.bf2Parser;

public class AntlrToLogicalOperator extends bf2BaseVisitor<LogicalOperator>{
    @Override
    public LogicalOperator visitLogicalAnd(bf2Parser.LogicalAndContext ctx) {
        return LogicalOperator.AND;
    }

    @Override
    public LogicalOperator visitLogicalOr(bf2Parser.LogicalOrContext ctx) {
        return LogicalOperator.OR;
    }
}
