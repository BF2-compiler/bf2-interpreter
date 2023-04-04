package bf2;

import antlr.bf2BaseVisitor;
import antlr.bf2Parser;

import java.beans.Expression;


public class AntlrToExpression extends bf2BaseVisitor<Expression> {
    @Override
    public Expression visitSubstraction(bf2Parser.SubstractionContext ctx) {
        return super.visitSubstraction(ctx);
    }

    @Override
    public Expression visitAddition(bf2Parser.AdditionContext ctx) {
        return super.visitAddition(ctx);
    }

    @Override
    public Expression visitMultiplication(bf2Parser.MultiplicationContext ctx) {
        return super.visitMultiplication(ctx);
    }

    @Override
    public Expression visitParenthesisExpression(bf2Parser.ParenthesisExpressionContext ctx) {
        return super.visitParenthesisExpression(ctx);
    }

    @Override
    public Expression visitVariableExpression(bf2Parser.VariableExpressionContext ctx) {
        return super.visitVariableExpression(ctx);
    }

    @Override
    public Expression visitDivision(bf2Parser.DivisionContext ctx) {
        return super.visitDivision(ctx);
    }
}
