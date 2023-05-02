package listener;

import antlr.bf2BaseListener;
import antlr.bf2Parser;
import bf2.Board;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import Exceptions.*;

public class AntlrListener extends bf2BaseListener{
    @Override
    public void enterProgram(bf2Parser.ProgramContext ctx) {
        int sizeX = Integer.parseInt(ctx.getChild(0).getText());
        int sizeY = Integer.parseInt(ctx.getChild(2).getText());

        if (sizeX == 0 || sizeY == 0) {
            throw new InvalidBoardSizeException("Board size cannot be 0. Line: " +
                    ctx.start.getLine() + " at: " +
                    ctx.start.getCharPositionInLine());
        }

        ListenerBoard.setInitialBoard(sizeX, sizeY);
    }

    @Override
    public void exitProgram(bf2Parser.ProgramContext ctx) {
    }

    @Override
    public void enterCommandComment(bf2Parser.CommandCommentContext ctx) {
    }

    @Override
    public void exitCommandComment(bf2Parser.CommandCommentContext ctx) {
    }

    @Override
    public void enterComment(bf2Parser.CommentContext ctx) {
        super.enterComment(ctx);
    }

    @Override
    public void exitComment(bf2Parser.CommentContext ctx) {
        super.exitComment(ctx);
    }

    @Override
    public void enterDefinitionOfFunction(bf2Parser.DefinitionOfFunctionContext ctx) {
    }

    @Override
    public void exitDefinitionOfFunction(bf2Parser.DefinitionOfFunctionContext ctx) {
        super.exitDefinitionOfFunction(ctx);
    }

    @Override
    public void enterCommandLoop(bf2Parser.CommandLoopContext ctx) {
        super.enterCommandLoop(ctx);
    }

    @Override
    public void exitCommandLoop(bf2Parser.CommandLoopContext ctx) {
        super.exitCommandLoop(ctx);
    }

    @Override
    public void enterCommandIfStatement(bf2Parser.CommandIfStatementContext ctx) {
        super.enterCommandIfStatement(ctx);
    }

    @Override
    public void exitCommandIfStatement(bf2Parser.CommandIfStatementContext ctx) {
        super.exitCommandIfStatement(ctx);
    }

    @Override
    public void enterCommandFuncCall(bf2Parser.CommandFuncCallContext ctx) {
        super.enterCommandFuncCall(ctx);
    }

    @Override
    public void exitCommandFuncCall(bf2Parser.CommandFuncCallContext ctx) {
        super.exitCommandFuncCall(ctx);
    }

    @Override
    public void enterCommandDirectionalMove(bf2Parser.CommandDirectionalMoveContext ctx) {
    }

    @Override
    public void exitCommandDirectionalMove(bf2Parser.CommandDirectionalMoveContext ctx) {
        super.exitCommandDirectionalMove(ctx);
    }

    @Override
    public void enterCommandExpression(bf2Parser.CommandExpressionContext ctx) {
        super.enterCommandExpression(ctx);
    }

    @Override
    public void exitCommandExpression(bf2Parser.CommandExpressionContext ctx) {
        super.exitCommandExpression(ctx);
    }

    @Override
    public void enterCommandAssign(bf2Parser.CommandAssignContext ctx) {
        super.enterCommandAssign(ctx);
    }

    @Override
    public void exitCommandAssign(bf2Parser.CommandAssignContext ctx) {
        super.exitCommandAssign(ctx);
    }

    @Override
    public void enterFuncDef(bf2Parser.FuncDefContext ctx) {
        String functionName =  ctx.getChild(2).getText();
        if (!FunctionNamesTable.tryAddFunctionName(functionName)){
            int position = ctx.start.getCharPositionInLine() + 1;
            throw new RedefinitionOfFunctionException("Redefinition of " + functionName + " function. " +
                    "Line: " + ctx.start.getLine() + " at: " + position);
        }
    }

    @Override
    public void exitFuncDef(bf2Parser.FuncDefContext ctx) {
    }

    @Override
    public void enterFuncCall(bf2Parser.FuncCallContext ctx) {
        super.enterFuncCall(ctx);
    }

    @Override
    public void exitFuncCall(bf2Parser.FuncCallContext ctx) {
        super.exitFuncCall(ctx);
    }

    @Override
    public void enterDoLoop(bf2Parser.DoLoopContext ctx) {
        super.enterDoLoop(ctx);
    }

    @Override
    public void exitDoLoop(bf2Parser.DoLoopContext ctx) {
        super.exitDoLoop(ctx);
    }

    @Override
    public void enterConditionalLoop(bf2Parser.ConditionalLoopContext ctx) {
        super.enterConditionalLoop(ctx);
    }

    @Override
    public void exitConditionalLoop(bf2Parser.ConditionalLoopContext ctx) {
        super.exitConditionalLoop(ctx);
    }

    @Override
    public void enterBlock(bf2Parser.BlockContext ctx) {
    }

    @Override
    public void exitBlock(bf2Parser.BlockContext ctx) {
    }

    @Override
    public void enterIfStatement(bf2Parser.IfStatementContext ctx) {
        super.enterIfStatement(ctx);
    }

    @Override
    public void exitIfStatement(bf2Parser.IfStatementContext ctx) {
        super.exitIfStatement(ctx);
    }

    @Override
    public void enterParenthesisBool(bf2Parser.ParenthesisBoolContext ctx) {
        super.enterParenthesisBool(ctx);
    }

    @Override
    public void exitParenthesisBool(bf2Parser.ParenthesisBoolContext ctx) {
        super.exitParenthesisBool(ctx);
    }

    @Override
    public void enterVariableBool(bf2Parser.VariableBoolContext ctx) {
        super.enterVariableBool(ctx);
    }

    @Override
    public void exitVariableBool(bf2Parser.VariableBoolContext ctx) {
        super.exitVariableBool(ctx);
    }

    @Override
    public void enterVariableOperatorVariable(bf2Parser.VariableOperatorVariableContext ctx) {
        super.enterVariableOperatorVariable(ctx);
    }

    @Override
    public void exitVariableOperatorVariable(bf2Parser.VariableOperatorVariableContext ctx) {
        super.exitVariableOperatorVariable(ctx);
    }

//    @Override
//    public void enterBoolOperatorBool(bf2Parser.BoolOperatorBoolContext ctx) {
//        super.enterBoolOperatorBool(ctx);
//    }

//    @Override
//    public void exitBoolOperatorBool(bf2Parser.BoolOperatorBoolContext ctx) {
//
//        super.exitBoolOperatorBool(ctx);
//    }

    @Override
    public void enterAssign(bf2Parser.AssignContext ctx) {
        super.enterAssign(ctx);
    }

    @Override
    public void exitAssign(bf2Parser.AssignContext ctx) {
        super.exitAssign(ctx);
    }

    @Override
    public void enterNumberGet(bf2Parser.NumberGetContext ctx) {
        super.enterNumberGet(ctx);
    }

    @Override
    public void exitNumberGet(bf2Parser.NumberGetContext ctx) {
        super.exitNumberGet(ctx);
    }

    @Override
    public void enterBlockGet(bf2Parser.BlockGetContext ctx) {
        ListenerBoard.savePointerPosition();
    }

    @Override
    public void exitBlockGet(bf2Parser.BlockGetContext ctx) {
        ListenerBoard.loadLastPointerPosition();
    }

    @Override
    public void enterFuncBlock(bf2Parser.FuncBlockContext ctx) {
        ListenerBoard.allowPointersChange = false;
    }

    @Override
    public void exitFuncBlock(bf2Parser.FuncBlockContext ctx) {
        ListenerBoard.allowPointersChange = true;
    }

    @Override
    public void enterGet(bf2Parser.GetContext ctx) {
        super.enterGet(ctx);
    }

    @Override
    public void exitGet(bf2Parser.GetContext ctx) {
        super.exitGet(ctx);
    }

//    @Override
//    public void enterSubstraction(bf2Parser.SubstractionContext ctx) {
//        super.enterSubstraction(ctx);
//    }
//
//    @Override
//    public void exitSubstraction(bf2Parser.SubstractionContext ctx) {
//        super.exitSubstraction(ctx);
//    }
//
//    @Override
//    public void enterAddition(bf2Parser.AdditionContext ctx) {
//        super.enterAddition(ctx);
//    }
//
//    @Override
//    public void exitAddition(bf2Parser.AdditionContext ctx) {
//        super.exitAddition(ctx);
//    }
//
//    @Override
//    public void enterMultiplication(bf2Parser.MultiplicationContext ctx) {
//        super.enterMultiplication(ctx);
//    }
//
//    @Override
//    public void exitMultiplication(bf2Parser.MultiplicationContext ctx) {
//        super.exitMultiplication(ctx);
//    }

    @Override
    public void enterParenthesisExpression(bf2Parser.ParenthesisExpressionContext ctx) {
        super.enterParenthesisExpression(ctx);
    }

    @Override
    public void exitParenthesisExpression(bf2Parser.ParenthesisExpressionContext ctx) {
        super.exitParenthesisExpression(ctx);
    }

    @Override
    public void enterVariableExpression(bf2Parser.VariableExpressionContext ctx) {
        super.enterVariableExpression(ctx);
    }

    @Override
    public void exitVariableExpression(bf2Parser.VariableExpressionContext ctx) {
        super.exitVariableExpression(ctx);
    }

    @Override
    public void enterMultiplicationDivision(bf2Parser.MultiplicationDivisionContext ctx) {
        if (Integer.parseInt(ctx.getChild(2).getText()) == 0){
            int position = ctx.stop.getCharPositionInLine() - 1;
            throw new NullDivisionException("Division by 0. Line: " +
                    ctx.start.getLine() + " at: " + position);
        }
    }

    @Override
    public void enterComparisonLess(bf2Parser.ComparisonLessContext ctx) {
        super.enterComparisonLess(ctx);
    }

    @Override
    public void exitComparisonLess(bf2Parser.ComparisonLessContext ctx) {
        super.exitComparisonLess(ctx);
    }

    @Override
    public void enterComparisonGreater(bf2Parser.ComparisonGreaterContext ctx) {
        super.enterComparisonGreater(ctx);
    }

    @Override
    public void exitComparisonGreater(bf2Parser.ComparisonGreaterContext ctx) {
        super.exitComparisonGreater(ctx);
    }

    @Override
    public void enterComparisonLessEqual(bf2Parser.ComparisonLessEqualContext ctx) {
        super.enterComparisonLessEqual(ctx);
    }

    @Override
    public void exitComparisonLessEqual(bf2Parser.ComparisonLessEqualContext ctx) {
        super.exitComparisonLessEqual(ctx);
    }

    @Override
    public void enterComparisonGreaterEqual(bf2Parser.ComparisonGreaterEqualContext ctx) {
        super.enterComparisonGreaterEqual(ctx);
    }

    @Override
    public void exitComparisonGreaterEqual(bf2Parser.ComparisonGreaterEqualContext ctx) {
        super.exitComparisonGreaterEqual(ctx);
    }

    @Override
    public void enterComparisonEqual(bf2Parser.ComparisonEqualContext ctx) {
        super.enterComparisonEqual(ctx);
    }

    @Override
    public void exitComparisonEqual(bf2Parser.ComparisonEqualContext ctx) {
        super.exitComparisonEqual(ctx);
    }

    @Override
    public void enterComparisonNotEqual(bf2Parser.ComparisonNotEqualContext ctx) {
        super.enterComparisonNotEqual(ctx);
    }

    @Override
    public void exitComparisonNotEqual(bf2Parser.ComparisonNotEqualContext ctx) {
        super.exitComparisonNotEqual(ctx);
    }

    @Override
    public void enterMoveLeft(bf2Parser.MoveLeftContext ctx) {
        if (ListenerBoard.pointerX <= 0 && ListenerBoard.allowPointersChange){
            int position = ctx.start.getCharPositionInLine() + 1;
            throw new PointerOutOfBoardException("Line: " +
                    ctx.start.getLine() + " at: " + position);
        }
    }

    @Override
    public void exitMoveLeft(bf2Parser.MoveLeftContext ctx) {
        ListenerBoard.updatePointerX(-1);
    }

    @Override
    public void enterMoveRight(bf2Parser.MoveRightContext ctx) {
        if (ListenerBoard.pointerX >= ListenerBoard.SIZE_X - 1 && ListenerBoard.allowPointersChange){
            int position = ctx.start.getCharPositionInLine() + 1;
            throw new PointerOutOfBoardException("Line: " +
                    ctx.start.getLine() + " at: " + position);
        }
    }

    @Override
    public void exitMoveRight(bf2Parser.MoveRightContext ctx) {
        ListenerBoard.updatePointerX(1);
    }

    @Override
    public void enterMoveUp(bf2Parser.MoveUpContext ctx) {
        if (ListenerBoard.pointerY <= 0 && ListenerBoard.allowPointersChange){
            int position = ctx.start.getCharPositionInLine() + 1;
            throw new PointerOutOfBoardException("Line: " +
                    ctx.start.getLine() + " at: " + position);
        }
    }

    @Override
    public void exitMoveUp(bf2Parser.MoveUpContext ctx) {
        ListenerBoard.updatePointerY(-1);
    }

    @Override
    public void enterMoveDown(bf2Parser.MoveDownContext ctx) {
        if (ListenerBoard.pointerY >= ListenerBoard.SIZE_Y - 1 && ListenerBoard.allowPointersChange){
            int position = ctx.start.getCharPositionInLine() + 1;
            throw new PointerOutOfBoardException("Line: " +
                    ctx.start.getLine() + " at: " + position);
        }
    }

    @Override
    public void exitMoveDown(bf2Parser.MoveDownContext ctx) {
        ListenerBoard.updatePointerY(1);
    }

    @Override
    public void enterLowerBoard(bf2Parser.LowerBoardContext ctx) {
        super.enterLowerBoard(ctx);
    }

    @Override
    public void exitLowerBoard(bf2Parser.LowerBoardContext ctx) {
        super.exitLowerBoard(ctx);
    }

    @Override
    public void enterUpperBoard(bf2Parser.UpperBoardContext ctx) {
        super.enterUpperBoard(ctx);
    }

    @Override
    public void exitUpperBoard(bf2Parser.UpperBoardContext ctx) {
        super.exitUpperBoard(ctx);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
    }
}
