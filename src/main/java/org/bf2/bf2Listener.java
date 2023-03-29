package org.bf2;

// Generated from bf2.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link bf2Parser}.
 */
public interface bf2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link bf2Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(bf2Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link bf2Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(bf2Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link bf2Parser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(bf2Parser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link bf2Parser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(bf2Parser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link bf2Parser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(bf2Parser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link bf2Parser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(bf2Parser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link bf2Parser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(bf2Parser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link bf2Parser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(bf2Parser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link bf2Parser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(bf2Parser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link bf2Parser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(bf2Parser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link bf2Parser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(bf2Parser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link bf2Parser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(bf2Parser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link bf2Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(bf2Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link bf2Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(bf2Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link bf2Parser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(bf2Parser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link bf2Parser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(bf2Parser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link bf2Parser#boolStatement}.
	 * @param ctx the parse tree
	 */
	void enterBoolStatement(bf2Parser.BoolStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link bf2Parser#boolStatement}.
	 * @param ctx the parse tree
	 */
	void exitBoolStatement(bf2Parser.BoolStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link bf2Parser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(bf2Parser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link bf2Parser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(bf2Parser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link bf2Parser#varGetter}.
	 * @param ctx the parse tree
	 */
	void enterVarGetter(bf2Parser.VarGetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link bf2Parser#varGetter}.
	 * @param ctx the parse tree
	 */
	void exitVarGetter(bf2Parser.VarGetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link bf2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(bf2Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link bf2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(bf2Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link bf2Parser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyingExpression(bf2Parser.MultiplyingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link bf2Parser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyingExpression(bf2Parser.MultiplyingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link bf2Parser#signExpression}.
	 * @param ctx the parse tree
	 */
	void enterSignExpression(bf2Parser.SignExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link bf2Parser#signExpression}.
	 * @param ctx the parse tree
	 */
	void exitSignExpression(bf2Parser.SignExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link bf2Parser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(bf2Parser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link bf2Parser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(bf2Parser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link bf2Parser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(bf2Parser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link bf2Parser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(bf2Parser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link bf2Parser#directionalMove}.
	 * @param ctx the parse tree
	 */
	void enterDirectionalMove(bf2Parser.DirectionalMoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link bf2Parser#directionalMove}.
	 * @param ctx the parse tree
	 */
	void exitDirectionalMove(bf2Parser.DirectionalMoveContext ctx);
}