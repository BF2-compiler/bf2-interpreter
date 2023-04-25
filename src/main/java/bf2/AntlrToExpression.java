package bf2;

import antlr.bf2BaseVisitor;
import antlr.bf2Parser;


public class AntlrToExpression extends bf2BaseVisitor<Expression> {
    @Override
    public Expression visitSubstraction(bf2Parser.SubstractionContext ctx) {
        AntlrToVarGetter x = new AntlrToVarGetter();

        Number l = (Number) x.visit(ctx.getChild(0).getChild(0));
        Number r = (Number) x.visit(ctx.getChild(2).getChild(0));

        return new Subtraction(l.value_, r.value_);
    }

    @Override
    public Expression visitAddition(bf2Parser.AdditionContext ctx) {
        AntlrToVarGetter x = new AntlrToVarGetter();

        Number l = (Number) x.visit(ctx.getChild(0).getChild(0));
        Number r = (Number) x.visit(ctx.getChild(2).getChild(0));

        return new Addition(l.value_, r.value_);
    }

    @Override
    public Expression visitMultiplication(bf2Parser.MultiplicationContext ctx) {
        AntlrToVarGetter x = new AntlrToVarGetter();

        Number l = (Number) x.visit(ctx.getChild(0).getChild(0));
        Number r = (Number) x.visit(ctx.getChild(2).getChild(0));

        return new Multiplication(l.value_, r.value_);
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
        AntlrToVarGetter x = new AntlrToVarGetter();

        Number l = (Number) x.visit(ctx.getChild(0).getChild(0));
        Number r = (Number) x.visit(ctx.getChild(2).getChild(0));

        return new Division(l.value_, r.value_);
    }
}
