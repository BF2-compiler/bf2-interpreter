// Generated from bf2.g4 by ANTLR 4.12.0
package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link bf2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface bf2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link bf2Parser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(bf2Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CommandComment}
	 * labeled alternative in {@link bf2Parser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandComment(bf2Parser.CommandCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Comment}
	 * labeled alternative in {@link bf2Parser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(bf2Parser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DefinitionOfFunction}
	 * labeled alternative in {@link bf2Parser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinitionOfFunction(bf2Parser.DefinitionOfFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CommandLoop}
	 * labeled alternative in {@link bf2Parser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandLoop(bf2Parser.CommandLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CommandIfStatement}
	 * labeled alternative in {@link bf2Parser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandIfStatement(bf2Parser.CommandIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CommandFuncCall}
	 * labeled alternative in {@link bf2Parser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandFuncCall(bf2Parser.CommandFuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CommandDirectionalMove}
	 * labeled alternative in {@link bf2Parser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandDirectionalMove(bf2Parser.CommandDirectionalMoveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CommandExpression}
	 * labeled alternative in {@link bf2Parser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandExpression(bf2Parser.CommandExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CommandAssign}
	 * labeled alternative in {@link bf2Parser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandAssign(bf2Parser.CommandAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link bf2Parser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(bf2Parser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link bf2Parser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(bf2Parser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link bf2Parser#funcBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncBlock(bf2Parser.FuncBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoLoop}
	 * labeled alternative in {@link bf2Parser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoLoop(bf2Parser.DoLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionalLoop}
	 * labeled alternative in {@link bf2Parser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalLoop(bf2Parser.ConditionalLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link bf2Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(bf2Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link bf2Parser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(bf2Parser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesisBool}
	 * labeled alternative in {@link bf2Parser#boolStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisBool(bf2Parser.ParenthesisBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableBool}
	 * labeled alternative in {@link bf2Parser#boolStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableBool(bf2Parser.VariableBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableOperatorVariable}
	 * labeled alternative in {@link bf2Parser#boolStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableOperatorVariable(bf2Parser.VariableOperatorVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolOperatorBool}
	 * labeled alternative in {@link bf2Parser#boolStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolOperatorBool(bf2Parser.BoolOperatorBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link bf2Parser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(bf2Parser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberGet}
	 * labeled alternative in {@link bf2Parser#varGetter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberGet(bf2Parser.NumberGetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockGet}
	 * labeled alternative in {@link bf2Parser#varGetter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockGet(bf2Parser.BlockGetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Get}
	 * labeled alternative in {@link bf2Parser#varGetter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet(bf2Parser.GetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Substraction}
	 * labeled alternative in {@link bf2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstraction(bf2Parser.SubstractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link bf2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(bf2Parser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link bf2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(bf2Parser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesisExpression}
	 * labeled alternative in {@link bf2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisExpression(bf2Parser.ParenthesisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableExpression}
	 * labeled alternative in {@link bf2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpression(bf2Parser.VariableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link bf2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(bf2Parser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalAnd}
	 * labeled alternative in {@link bf2Parser#logicalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAnd(bf2Parser.LogicalAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalOr}
	 * labeled alternative in {@link bf2Parser#logicalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOr(bf2Parser.LogicalOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonLess}
	 * labeled alternative in {@link bf2Parser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonLess(bf2Parser.ComparisonLessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonGreater}
	 * labeled alternative in {@link bf2Parser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonGreater(bf2Parser.ComparisonGreaterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonLessEqual}
	 * labeled alternative in {@link bf2Parser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonLessEqual(bf2Parser.ComparisonLessEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonGreaterEqual}
	 * labeled alternative in {@link bf2Parser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonGreaterEqual(bf2Parser.ComparisonGreaterEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonEqual}
	 * labeled alternative in {@link bf2Parser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonEqual(bf2Parser.ComparisonEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonNotEqual}
	 * labeled alternative in {@link bf2Parser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonNotEqual(bf2Parser.ComparisonNotEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MoveLeft}
	 * labeled alternative in {@link bf2Parser#directionalMove}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveLeft(bf2Parser.MoveLeftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MoveRight}
	 * labeled alternative in {@link bf2Parser#directionalMove}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveRight(bf2Parser.MoveRightContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MoveUp}
	 * labeled alternative in {@link bf2Parser#directionalMove}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveUp(bf2Parser.MoveUpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MoveDown}
	 * labeled alternative in {@link bf2Parser#directionalMove}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveDown(bf2Parser.MoveDownContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LowerBoard}
	 * labeled alternative in {@link bf2Parser#directionalMove}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLowerBoard(bf2Parser.LowerBoardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UpperBoard}
	 * labeled alternative in {@link bf2Parser#directionalMove}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpperBoard(bf2Parser.UpperBoardContext ctx);
}