package bf2;

import antlr.bf2BaseVisitor;
import antlr.bf2Parser;


public class AntlrToExpression extends bf2BaseVisitor<Expression> {
    @Override
    public Expression visitSubstraction(bf2Parser.SubstractionContext ctx) {
        AntlrToExpression x = new AntlrToExpression();

        Number l = (Number) x.visit(ctx.getChild(0));
        Number r = (Number) x.visit(ctx.getChild(2));

        return new Number(l.value_ - r.value_);
    }

    @Override
    public Expression visitAddition(bf2Parser.AdditionContext ctx) {
        AntlrToExpression x = new AntlrToExpression();

        Number l = (Number) x.visit(ctx.getChild(0));
        Number r = (Number) x.visit(ctx.getChild(2));

        return new Number(l.value_ + r.value_);
    }

    @Override
    public Expression visitMultiplication(bf2Parser.MultiplicationContext ctx) {
        AntlrToExpression x = new AntlrToExpression();

        Number l = (Number) x.visit(ctx.getChild(0));
        Number r = (Number) x.visit(ctx.getChild(2));

        return new Number(l.value_ * r.value_);
    }

    @Override
    public Expression visitParenthesisExpression(bf2Parser.ParenthesisExpressionContext ctx) {
        AntlrToExpression expressionVisitor = new AntlrToExpression();

        return expressionVisitor.visit(ctx.getChild(1));
    }

    @Override
    public Expression visitVariableExpression(bf2Parser.VariableExpressionContext ctx) {
        AntlrToExpression varGetterVisitor = new AntlrToExpression();
        return varGetterVisitor.visit(ctx.getChild(0));
    }

    @Override
    public Expression visitDivision(bf2Parser.DivisionContext ctx) {
        AntlrToExpression x = new AntlrToExpression();

        Number l = (Number) x.visit(ctx.getChild(0));
        Number r = (Number) x.visit(ctx.getChild(2));

        if (r.value_ == 0) {
            throw new RuntimeException("Division by 0. Line: " +
                    ctx.start.getLine() + " at: " +
                    ctx.start.getCharPositionInLine());
        }

        return new Number(l.value_ / r.value_);
    }

    @Override
    public Expression visitNumberGet(bf2Parser.NumberGetContext ctx) {
        String numText = ctx.getChild(0).getText();
        int number = Integer.parseInt(numText);
        return new Number(number);
    }

    @Override
    public Expression visitBlockGet(bf2Parser.BlockGetContext ctx) {
        AntlrToBlock visitBlock = new AntlrToBlock();
        Block block = visitBlock.visit(ctx.getChild(0));
        block.isBlockGet_ = true;
        return block;
    }

    @Override
    public Expression visitGet(bf2Parser.GetContext ctx) {
        int number = Board.getCurrentValue();
        return new Number(number);
    }
}
