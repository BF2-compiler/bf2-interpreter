// Generated from bf2.g4 by ANTLR 4.12.0
package org.bf2;
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
	 * Visit a parse tree produced by {@link bf2Parser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(bf2Parser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link bf2Parser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(bf2Parser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link bf2Parser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(bf2Parser.CommandContext ctx);
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
	 * Visit a parse tree produced by {@link bf2Parser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(bf2Parser.LoopContext ctx);
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
	 * Visit a parse tree produced by {@link bf2Parser#boolStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolStatement(bf2Parser.BoolStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link bf2Parser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(bf2Parser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link bf2Parser#varGetter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarGetter(bf2Parser.VarGetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link bf2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(bf2Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link bf2Parser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(bf2Parser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link bf2Parser#logicalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperator(bf2Parser.LogicalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link bf2Parser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(bf2Parser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link bf2Parser#directionalMove}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectionalMove(bf2Parser.DirectionalMoveContext ctx);
}