package bf2;

import antlr.bf2BaseVisitor;
import antlr.bf2Parser;

public class AntlrToBoolStatement extends bf2BaseVisitor<BoolStatement> {
    @Override
    public BoolStatement visitParenthesisBool(bf2Parser.ParenthesisBoolContext ctx) {
        return super.visitParenthesisBool(ctx);
    }

    @Override
    public BoolStatement visitVariableBool(bf2Parser.VariableBoolContext ctx) {
        AntlrToVarGetter varGetter = new AntlrToVarGetter();
        VarGetter num = varGetter.visit(ctx.getChild(0));
        return new BoolStatement(num);
    }

    @Override
    public BoolStatement visitVariableOperatorVariable(bf2Parser.VariableOperatorVariableContext ctx) {
        AntlrToVarGetter varGetterVisitor = new AntlrToVarGetter();
        VarGetter left = varGetterVisitor.visit(ctx.getChild(0));
        VarGetter right = varGetterVisitor.visit(ctx.getChild(2));

        int leftValue = 0, rightValue = 0;

        if (left instanceof Block) leftValue = ((Block) left).getValueFromCommands();
        else leftValue = ((Number) left).value_;

        if (right instanceof Block) rightValue = ((Block) right).getValueFromCommands();
        else rightValue = ((Number) right).value_;

        AntlrToComparisonOperator comparisonOperatorVisitor = new AntlrToComparisonOperator();
        ComparisonOperator operator = comparisonOperatorVisitor.visit(ctx.getChild(1));
        BoolStatement returnStatement = new BoolStatement();
        switch (operator){
            case LESS:
                returnStatement.satisfied = leftValue < rightValue;
                break;
            case GREATER:
                returnStatement.satisfied = leftValue > rightValue;
                break;
            case LESS_EQUAL:
                returnStatement.satisfied = leftValue <= rightValue;
                break;
            case GREATER_EQUAL:
                returnStatement.satisfied = leftValue >= rightValue;
                break;
            case EQUAL:
                returnStatement.satisfied = leftValue == rightValue;
                break;
            case NOT_EQUAL:
                returnStatement.satisfied = leftValue != rightValue;
                break;
        }

        return returnStatement;
    }

    @Override
    public BoolStatement visitBoolOperatorBool(bf2Parser.BoolOperatorBoolContext ctx) {
        return super.visitBoolOperatorBool(ctx);
    }
}
