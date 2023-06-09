package bf2;

import antlr.bf2BaseVisitor;
import antlr.bf2Parser;

public class AntlrToBoolStatement extends bf2BaseVisitor<BoolStatement> {
    @Override
    public BoolStatement visitParenthesisBool(bf2Parser.ParenthesisBoolContext ctx) {
        AntlrToBoolStatement antlrToBoolStatementVisitor = new AntlrToBoolStatement();
        return antlrToBoolStatementVisitor.visit(ctx.getChild(1));
    }

    @Override
    public BoolStatement visitVariableBool(bf2Parser.VariableBoolContext ctx) {
        AntlrToExpression expressionVisitor = new AntlrToExpression();
        Number num = (Number) expressionVisitor.visit(ctx.getChild(0));
        return new BoolStatement(num);
    }

    @Override
    public BoolStatement visitVariableOperatorVariable(bf2Parser.VariableOperatorVariableContext ctx) {
        AntlrToExpression expressionVisitor = new AntlrToExpression();
        Expression left = expressionVisitor.visit(ctx.getChild(0));
        Expression right = expressionVisitor.visit(ctx.getChild(2));

        int leftValue, rightValue;

        if (left instanceof Block) leftValue = ((Block) left).getValueFromCommands();
        else leftValue = ((Number) left).value_;

        if (right instanceof Block) rightValue = ((Block) right).getValueFromCommands();
        else rightValue = ((Number) right).value_;


        AntlrToComparisonOperator comparisonOperatorVisitor = new AntlrToComparisonOperator();
        ComparisonOperator operator = comparisonOperatorVisitor.visit(ctx.getChild(1));
        BoolStatement returnStatement = new BoolStatement();
        switch (operator) {
            case LESS -> returnStatement.satisfied = leftValue < rightValue;
            case GREATER -> returnStatement.satisfied = leftValue > rightValue;
            case LESS_EQUAL -> returnStatement.satisfied = leftValue <= rightValue;
            case GREATER_EQUAL -> returnStatement.satisfied = leftValue >= rightValue;
            case EQUAL -> returnStatement.satisfied = leftValue == rightValue;
            case NOT_EQUAL -> returnStatement.satisfied = leftValue != rightValue;
        }

        return returnStatement;
    }

    @Override
    public BoolStatement visitBoolOperatorBool(bf2Parser.BoolOperatorBoolContext ctx) {
        AntlrToBoolStatement antlrToBoolStatementVisitor = new AntlrToBoolStatement();
        AntlrToLogicalOperator antlrToLogicalOperatorVisitor = new AntlrToLogicalOperator();

        BoolStatement left = antlrToBoolStatementVisitor.visit(ctx.getChild(0));
        BoolStatement right = antlrToBoolStatementVisitor.visit(ctx.getChild(2));

        BoolStatement returnStatement = new BoolStatement();

        LogicalOperator operator = antlrToLogicalOperatorVisitor.visit(ctx.getChild(1));

        switch (operator){
            case AND -> returnStatement.satisfied = left.satisfied && right.satisfied;
            case OR -> returnStatement.satisfied = left.satisfied || right.satisfied;
        }

        return returnStatement;
    }

    @Override
    public BoolStatement visitNotOperator(bf2Parser.NotOperatorContext ctx) {
        AntlrToBoolStatement antlrToBoolStatementVisitor = new AntlrToBoolStatement();
        BoolStatement returnStatement = new BoolStatement();
        returnStatement.satisfied =  !(antlrToBoolStatementVisitor.visit(ctx.getChild(1)).satisfied);
        return returnStatement;
    }
}
