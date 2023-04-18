package bf2;

import antlr.bf2BaseVisitor;
import antlr.bf2Parser;

public class AntlrToComparisonOperator extends bf2BaseVisitor<ComparisonOperator>{
    @Override
    public ComparisonOperator visitComparisonLess(bf2Parser.ComparisonLessContext ctx) {
        return ComparisonOperator.LESS;
    }

    @Override
    public ComparisonOperator visitComparisonGreater(bf2Parser.ComparisonGreaterContext ctx) {
        return ComparisonOperator.GREATER;
    }

    @Override
    public ComparisonOperator visitComparisonLessEqual(bf2Parser.ComparisonLessEqualContext ctx) {
        return ComparisonOperator.LESS_EQUAL;
    }

    @Override
    public ComparisonOperator visitComparisonGreaterEqual(bf2Parser.ComparisonGreaterEqualContext ctx) {
        return ComparisonOperator.GREATER_EQUAL;
    }

    @Override
    public ComparisonOperator visitComparisonEqual(bf2Parser.ComparisonEqualContext ctx) {
        return ComparisonOperator.EQUAL;
    }

    @Override
    public ComparisonOperator visitComparisonNotEqual(bf2Parser.ComparisonNotEqualContext ctx) {
        return ComparisonOperator.NOT_EQUAL;
    }
}
