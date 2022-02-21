// Generated from .\ProtoPas.g4 by ANTLR 4.9

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ProtoPasParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface ProtoPasVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link ProtoPasParser#program}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitProgram(ProtoPasParser.ProgramContext ctx);

    /**
     * Visit a parse tree produced by {@link ProtoPasParser#body}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBody(ProtoPasParser.BodyContext ctx);

    /**
     * Visit a parse tree produced by {@link ProtoPasParser#stmts}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStmts(ProtoPasParser.StmtsContext ctx);

    /**
     * Visit a parse tree produced by {@link ProtoPasParser#stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStmt(ProtoPasParser.StmtContext ctx);

    /**
     * Visit a parse tree produced by {@link ProtoPasParser#inline_var}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInline_var(ProtoPasParser.Inline_varContext ctx);

    /**
     * Visit a parse tree produced by {@link ProtoPasParser#inline_type}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInline_type(ProtoPasParser.Inline_typeContext ctx);

    /**
     * Visit a parse tree produced by {@link ProtoPasParser#inline_assign}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInline_assign(ProtoPasParser.Inline_assignContext ctx);

    /**
     * Visit a parse tree produced by {@link ProtoPasParser#vars}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVars(ProtoPasParser.VarsContext ctx);

    /**
     * Visit a parse tree produced by {@link ProtoPasParser#var}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVar(ProtoPasParser.VarContext ctx);

    /**
     * Visit a parse tree produced by {@link ProtoPasParser#assign}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAssign(ProtoPasParser.AssignContext ctx);

    /**
     * Visit a parse tree produced by {@link ProtoPasParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExpr(ProtoPasParser.ExprContext ctx);
}