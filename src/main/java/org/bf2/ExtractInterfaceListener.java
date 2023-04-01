package org.bf2;


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.bf2.bf2Parser.*;

public class ExtractInterfaceListener implements bf2Listener { // na poczatku bylo extends

    bf2Parser parser;

    public ExtractInterfaceListener(bf2Parser parser) {
        this.parser = parser;
    }

//    @Override
//    public void enterNormalClassDeclaration(NormalClassDeclarationContext ctx) {
//        System.out.println("interface I" + ctx.Identifier() + " {");
//    }
//
//    @Override
//    public void exitNormalClassDeclaration(NormalClassDeclarationContext ctx) {
//        System.out.println("}");
//    }
//
//    @Override
//    public void enterMethodDeclaration(MethodDeclarationContext ctx) {
//    }
//
//    private boolean firstParam = false;
//    private boolean insideMethod = false;
//
//
//    @Override
//    public void enterMethodHeader(MethodHeaderContext ctx) {
//        TokenStream tokens = parser.getTokenStream();
//        String type = "void";
//        if (ctx.result() != null) {
//            type = ctx.result().getText();
//        }
//        String args = "";
//        if (ctx.methodDeclarator().formalParameterList() != null) {
//            args = ctx.methodDeclarator().formalParameterList().getText();
//        }
//        // System.out.println("\t" + type + " " + ctx.methodDeclarator().Identifier() +
//        // "(" + args + ");");
//        System.out.print("\t" + type + " " + ctx.methodDeclarator().Identifier() + "(");
//        insideMethod = true;
//        firstParam = true;
//    }
//
//    @Override
//    public void exitMethodHeader(MethodHeaderContext ctx) {
//        System.out.println(");");
//        insideMethod = false;
//    }
//
//    @Override
//    public void enterFormalParameter(FormalParameterContext ctx) {
//        if(!insideMethod) {
//            return;
//        }
//
//        if (!firstParam) {
//            System.out.print(", ");
//        }
//        System.out.print(ctx.unannType().getText() + " " + ctx.variableDeclaratorId().getText() + " ");
//
//        //if (firstParam) {
//        firstParam = false;
//        //}
//    }

    @Override
    public void enterProg(ProgContext ctx) {

    }

    @Override
    public void exitProg(ProgContext ctx) {

    }

    @Override
    public void enterLine(LineContext ctx) {

    }

    @Override
    public void exitLine(LineContext ctx) {

    }

    @Override
    public void enterCommand(CommandContext ctx) {

    }

    @Override
    public void exitCommand(CommandContext ctx) {

    }

    @Override
    public void enterFuncDef(FuncDefContext ctx) {

    }

    @Override
    public void exitFuncDef(FuncDefContext ctx) {

    }

    @Override
    public void enterFuncCall(FuncCallContext ctx) {

    }

    @Override
    public void exitFuncCall(FuncCallContext ctx) {

    }

    @Override
    public void enterLoop(LoopContext ctx) {

    }

    @Override
    public void exitLoop(LoopContext ctx) {

    }

    @Override
    public void enterBlock(BlockContext ctx) {

    }

    @Override
    public void exitBlock(BlockContext ctx) {

    }

    @Override
    public void enterIfStatement(IfStatementContext ctx) {

    }

    @Override
    public void exitIfStatement(IfStatementContext ctx) {

    }

    @Override
    public void enterBoolStatement(BoolStatementContext ctx) {

    }

    @Override
    public void exitBoolStatement(BoolStatementContext ctx) {

    }

    @Override
    public void enterAssign(AssignContext ctx) {

    }

    @Override
    public void exitAssign(AssignContext ctx) {

    }

    @Override
    public void enterVarGetter(VarGetterContext ctx) {

    }

    @Override
    public void exitVarGetter(VarGetterContext ctx) {

    }

    @Override
    public void enterExpression(ExpressionContext ctx) {

    }

    @Override
    public void exitExpression(ExpressionContext ctx) {

    }

    @Override
    public void enterMultiplyingExpression(MultiplyingExpressionContext ctx) {

    }

    @Override
    public void exitMultiplyingExpression(MultiplyingExpressionContext ctx) {

    }

    @Override
    public void enterSignExpression(SignExpressionContext ctx) {

    }

    @Override
    public void exitSignExpression(SignExpressionContext ctx) {

    }

    @Override
    public void enterLogicalOperator(LogicalOperatorContext ctx) {

    }

    @Override
    public void exitLogicalOperator(LogicalOperatorContext ctx) {

    }

    @Override
    public void enterComparisonOperator(ComparisonOperatorContext ctx) {

    }

    @Override
    public void exitComparisonOperator(ComparisonOperatorContext ctx) {

    }

    @Override
    public void enterDirectionalMove(DirectionalMoveContext ctx) {

    }

    @Override
    public void exitDirectionalMove(DirectionalMoveContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
