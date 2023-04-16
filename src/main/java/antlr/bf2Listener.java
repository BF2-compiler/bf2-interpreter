// Generated from bf2.g4 by ANTLR 4.12.0
package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link bf2Parser}.
 */
public interface bf2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Program}
	 * labeled alternative in {@link bf2Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgram(bf2Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link bf2Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgram(bf2Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CommandComment}
	 * labeled alternative in {@link bf2Parser#line}.
	 * @param ctx the parse tree
	 */
	void enterCommandComment(bf2Parser.CommandCommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CommandComment}
	 * labeled alternative in {@link bf2Parser#line}.
	 * @param ctx the parse tree
	 */
	void exitCommandComment(bf2Parser.CommandCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Comment}
	 * labeled alternative in {@link bf2Parser#line}.
	 * @param ctx the parse tree
	 */
	void enterComment(bf2Parser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Comment}
	 * labeled alternative in {@link bf2Parser#line}.
	 * @param ctx the parse tree
	 */
	void exitComment(bf2Parser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DefinitionOfFunction}
	 * labeled alternative in {@link bf2Parser#line}.
	 * @param ctx the parse tree
	 */
	void enterDefinitionOfFunction(bf2Parser.DefinitionOfFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DefinitionOfFunction}
	 * labeled alternative in {@link bf2Parser#line}.
	 * @param ctx the parse tree
	 */
	void exitDefinitionOfFunction(bf2Parser.DefinitionOfFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CommandLoop}
	 * labeled alternative in {@link bf2Parser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommandLoop(bf2Parser.CommandLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CommandLoop}
	 * labeled alternative in {@link bf2Parser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommandLoop(bf2Parser.CommandLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CommandIfStatement}
	 * labeled alternative in {@link bf2Parser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommandIfStatement(bf2Parser.CommandIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CommandIfStatement}
	 * labeled alternative in {@link bf2Parser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommandIfStatement(bf2Parser.CommandIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CommandFuncCall}
	 * labeled alternative in {@link bf2Parser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommandFuncCall(bf2Parser.CommandFuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CommandFuncCall}
	 * labeled alternative in {@link bf2Parser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommandFuncCall(bf2Parser.CommandFuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CommandDirectionalMove}
	 * labeled alternative in {@link bf2Parser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommandDirectionalMove(bf2Parser.CommandDirectionalMoveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CommandDirectionalMove}
	 * labeled alternative in {@link bf2Parser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommandDirectionalMove(bf2Parser.CommandDirectionalMoveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CommandExpression}
	 * labeled alternative in {@link bf2Parser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommandExpression(bf2Parser.CommandExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CommandExpression}
	 * labeled alternative in {@link bf2Parser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommandExpression(bf2Parser.CommandExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CommandAssign}
	 * labeled alternative in {@link bf2Parser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommandAssign(bf2Parser.CommandAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CommandAssign}
	 * labeled alternative in {@link bf2Parser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommandAssign(bf2Parser.CommandAssignContext ctx);
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
	 * Enter a parse tree produced by the {@code DoLoop}
	 * labeled alternative in {@link bf2Parser#loop}.
	 * @param ctx the parse tree
	 */
	void enterDoLoop(bf2Parser.DoLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoLoop}
	 * labeled alternative in {@link bf2Parser#loop}.
	 * @param ctx the parse tree
	 */
	void exitDoLoop(bf2Parser.DoLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionalLoop}
	 * labeled alternative in {@link bf2Parser#loop}.
	 * @param ctx the parse tree
	 */
	void enterConditionalLoop(bf2Parser.ConditionalLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionalLoop}
	 * labeled alternative in {@link bf2Parser#loop}.
	 * @param ctx the parse tree
	 */
	void exitConditionalLoop(bf2Parser.ConditionalLoopContext ctx);
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
	 * Enter a parse tree produced by the {@code ParenthesisBool}
	 * labeled alternative in {@link bf2Parser#boolStatement}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisBool(bf2Parser.ParenthesisBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesisBool}
	 * labeled alternative in {@link bf2Parser#boolStatement}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisBool(bf2Parser.ParenthesisBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableBool}
	 * labeled alternative in {@link bf2Parser#boolStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableBool(bf2Parser.VariableBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableBool}
	 * labeled alternative in {@link bf2Parser#boolStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableBool(bf2Parser.VariableBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableOperatorVariable}
	 * labeled alternative in {@link bf2Parser#boolStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableOperatorVariable(bf2Parser.VariableOperatorVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableOperatorVariable}
	 * labeled alternative in {@link bf2Parser#boolStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableOperatorVariable(bf2Parser.VariableOperatorVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolOperatorBool}
	 * labeled alternative in {@link bf2Parser#boolStatement}.
	 * @param ctx the parse tree
	 */
	void enterBoolOperatorBool(bf2Parser.BoolOperatorBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolOperatorBool}
	 * labeled alternative in {@link bf2Parser#boolStatement}.
	 * @param ctx the parse tree
	 */
	void exitBoolOperatorBool(bf2Parser.BoolOperatorBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignVariable}
	 * labeled alternative in {@link bf2Parser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssignVariable(bf2Parser.AssignVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignVariable}
	 * labeled alternative in {@link bf2Parser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssignVariable(bf2Parser.AssignVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberGet}
	 * labeled alternative in {@link bf2Parser#varGetter}.
	 * @param ctx the parse tree
	 */
	void enterNumberGet(bf2Parser.NumberGetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberGet}
	 * labeled alternative in {@link bf2Parser#varGetter}.
	 * @param ctx the parse tree
	 */
	void exitNumberGet(bf2Parser.NumberGetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockGet}
	 * labeled alternative in {@link bf2Parser#varGetter}.
	 * @param ctx the parse tree
	 */
	void enterBlockGet(bf2Parser.BlockGetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockGet}
	 * labeled alternative in {@link bf2Parser#varGetter}.
	 * @param ctx the parse tree
	 */
	void exitBlockGet(bf2Parser.BlockGetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Get}
	 * labeled alternative in {@link bf2Parser#varGetter}.
	 * @param ctx the parse tree
	 */
	void enterGet(bf2Parser.GetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Get}
	 * labeled alternative in {@link bf2Parser#varGetter}.
	 * @param ctx the parse tree
	 */
	void exitGet(bf2Parser.GetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Substraction}
	 * labeled alternative in {@link bf2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubstraction(bf2Parser.SubstractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Substraction}
	 * labeled alternative in {@link bf2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubstraction(bf2Parser.SubstractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link bf2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddition(bf2Parser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link bf2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddition(bf2Parser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link bf2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(bf2Parser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link bf2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(bf2Parser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesisExpression}
	 * labeled alternative in {@link bf2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpression(bf2Parser.ParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesisExpression}
	 * labeled alternative in {@link bf2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpression(bf2Parser.ParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableExpression}
	 * labeled alternative in {@link bf2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpression(bf2Parser.VariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableExpression}
	 * labeled alternative in {@link bf2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpression(bf2Parser.VariableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Division}
	 * labeled alternative in {@link bf2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivision(bf2Parser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link bf2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivision(bf2Parser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalAnd}
	 * labeled alternative in {@link bf2Parser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAnd(bf2Parser.LogicalAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalAnd}
	 * labeled alternative in {@link bf2Parser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAnd(bf2Parser.LogicalAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalOr}
	 * labeled alternative in {@link bf2Parser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOr(bf2Parser.LogicalOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalOr}
	 * labeled alternative in {@link bf2Parser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOr(bf2Parser.LogicalOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonLess}
	 * labeled alternative in {@link bf2Parser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonLess(bf2Parser.ComparisonLessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonLess}
	 * labeled alternative in {@link bf2Parser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonLess(bf2Parser.ComparisonLessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonGreater}
	 * labeled alternative in {@link bf2Parser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonGreater(bf2Parser.ComparisonGreaterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonGreater}
	 * labeled alternative in {@link bf2Parser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonGreater(bf2Parser.ComparisonGreaterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonLessEqual}
	 * labeled alternative in {@link bf2Parser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonLessEqual(bf2Parser.ComparisonLessEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonLessEqual}
	 * labeled alternative in {@link bf2Parser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonLessEqual(bf2Parser.ComparisonLessEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonGreaterEqual}
	 * labeled alternative in {@link bf2Parser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonGreaterEqual(bf2Parser.ComparisonGreaterEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonGreaterEqual}
	 * labeled alternative in {@link bf2Parser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonGreaterEqual(bf2Parser.ComparisonGreaterEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonEqual}
	 * labeled alternative in {@link bf2Parser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonEqual(bf2Parser.ComparisonEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonEqual}
	 * labeled alternative in {@link bf2Parser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonEqual(bf2Parser.ComparisonEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonNotEqual}
	 * labeled alternative in {@link bf2Parser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonNotEqual(bf2Parser.ComparisonNotEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonNotEqual}
	 * labeled alternative in {@link bf2Parser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonNotEqual(bf2Parser.ComparisonNotEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MoveLeft}
	 * labeled alternative in {@link bf2Parser#directionalMove}.
	 * @param ctx the parse tree
	 */
	void enterMoveLeft(bf2Parser.MoveLeftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MoveLeft}
	 * labeled alternative in {@link bf2Parser#directionalMove}.
	 * @param ctx the parse tree
	 */
	void exitMoveLeft(bf2Parser.MoveLeftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MoveRight}
	 * labeled alternative in {@link bf2Parser#directionalMove}.
	 * @param ctx the parse tree
	 */
	void enterMoveRight(bf2Parser.MoveRightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MoveRight}
	 * labeled alternative in {@link bf2Parser#directionalMove}.
	 * @param ctx the parse tree
	 */
	void exitMoveRight(bf2Parser.MoveRightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MoveUp}
	 * labeled alternative in {@link bf2Parser#directionalMove}.
	 * @param ctx the parse tree
	 */
	void enterMoveUp(bf2Parser.MoveUpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MoveUp}
	 * labeled alternative in {@link bf2Parser#directionalMove}.
	 * @param ctx the parse tree
	 */
	void exitMoveUp(bf2Parser.MoveUpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MoveDown}
	 * labeled alternative in {@link bf2Parser#directionalMove}.
	 * @param ctx the parse tree
	 */
	void enterMoveDown(bf2Parser.MoveDownContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MoveDown}
	 * labeled alternative in {@link bf2Parser#directionalMove}.
	 * @param ctx the parse tree
	 */
	void exitMoveDown(bf2Parser.MoveDownContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LowerBoard}
	 * labeled alternative in {@link bf2Parser#directionalMove}.
	 * @param ctx the parse tree
	 */
	void enterLowerBoard(bf2Parser.LowerBoardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LowerBoard}
	 * labeled alternative in {@link bf2Parser#directionalMove}.
	 * @param ctx the parse tree
	 */
	void exitLowerBoard(bf2Parser.LowerBoardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UpperBoard}
	 * labeled alternative in {@link bf2Parser#directionalMove}.
	 * @param ctx the parse tree
	 */
	void enterUpperBoard(bf2Parser.UpperBoardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UpperBoard}
	 * labeled alternative in {@link bf2Parser#directionalMove}.
	 * @param ctx the parse tree
	 */
	void exitUpperBoard(bf2Parser.UpperBoardContext ctx);
}