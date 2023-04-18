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

        return super.visitVariableOperatorVariable(ctx);
    }

    @Override
    public BoolStatement visitBoolOperatorBool(bf2Parser.BoolOperatorBoolContext ctx) {
        return super.visitBoolOperatorBool(ctx);
    }
}