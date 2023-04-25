package bf2;

import antlr.bf2BaseVisitor;
import antlr.bf2Parser;

import java.beans.Expression;


public class AntlrToExpression extends bf2BaseVisitor<Expression> {
    @Override
    public Expression visitSubstraction(bf2Parser.SubstractionContext ctx) {
        AntlrToVarGetter x = new AntlrToVarGetter();

        VarGetter l = x.visit(ctx.getChild(0).getChild(0));
        
        var r = x.visit(ctx.getChild(2));

        
    }

    @Override
    public Expression visitAddition(bf2Parser.AdditionContext ctx) {
        AntlrToExpression x = new AntlrToExpression();

        return x.visitAddition(ctx);
    }

    @Override
    public Expression visitMultiplication(bf2Parser.MultiplicationContext ctx) {
        AntlrToExpression x = new AntlrToExpression();

        var l = x.visit(ctx.getChild(0));
        var r = x.visit(ctx.getChild(2));

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
        AntlrToExpression x = new AntlrToExpression();

        var r = x.visit(ctx.getChild(0));
        var l = x.visit(ctx.getChild(2));

        return new Expression(ctx, x, "visitDivision");
    }
}
