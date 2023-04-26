package bf2;

import antlr.bf2BaseVisitor;
import antlr.bf2Parser;

import java.util.Objects;


public class AntlrToExpression extends bf2BaseVisitor<Expression> {

    @Override
    public Expression visitAdditionSubstraction(bf2Parser.AdditionSubstractionContext ctx) {
        AntlrToExpression x = new AntlrToExpression();

        Number l = (Number) x.visit(ctx.getChild(0));
        Number r = (Number) x.visit(ctx.getChild(2));

        String character = ctx.getChild(1).getText();
        if (Objects.equals(character, "+")){
            return new Number(l.value_ + r.value_);
        }
        else if (Objects.equals(character, "-")){
            return new Number(l.value_ - r.value_);
        }
        else throw new RuntimeException("Invalid operator");
    }

    @Override
    public Expression visitMultiplicationDivision(bf2Parser.MultiplicationDivisionContext ctx) {
        AntlrToExpression x = new AntlrToExpression();

        Number l = (Number) x.visit(ctx.getChild(0));
        Number r = (Number) x.visit(ctx.getChild(2));

        String character = ctx.getChild(1).getText();
        if (Objects.equals(character, "*")){
            return new Number(l.value_ * r.value_);
        }
        else if (Objects.equals(character, "/")){
            if (r.value_ == 0) throw new RuntimeException("Division by 0");
            return new Number(l.value_ / r.value_);
        }
        else throw new RuntimeException("Invalid operator");
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
