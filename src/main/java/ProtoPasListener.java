// Generated from .\ProtoPas.g4 by ANTLR 4.9

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProtoPasParser}.
 */
public interface ProtoPasListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link ProtoPasParser#program}.
     *
     * @param ctx the parse tree
     */
    void enterProgram(ProtoPasParser.ProgramContext ctx);

    /**
     * Exit a parse tree produced by {@link ProtoPasParser#program}.
     *
     * @param ctx the parse tree
     */
    void exitProgram(ProtoPasParser.ProgramContext ctx);

    /**
     * Enter a parse tree produced by {@link ProtoPasParser#body}.
     *
     * @param ctx the parse tree
     */
    void enterBody(ProtoPasParser.BodyContext ctx);

    /**
     * Exit a parse tree produced by {@link ProtoPasParser#body}.
     *
     * @param ctx the parse tree
     */
    void exitBody(ProtoPasParser.BodyContext ctx);

    /**
     * Enter a parse tree produced by {@link ProtoPasParser#stmts}.
     *
     * @param ctx the parse tree
     */
    void enterStmts(ProtoPasParser.StmtsContext ctx);

    /**
     * Exit a parse tree produced by {@link ProtoPasParser#stmts}.
     *
     * @param ctx the parse tree
     */
    void exitStmts(ProtoPasParser.StmtsContext ctx);

    /**
     * Enter a parse tree produced by {@link ProtoPasParser#stmt}.
     *
     * @param ctx the parse tree
     */
    void enterStmt(ProtoPasParser.StmtContext ctx);

    /**
     * Exit a parse tree produced by {@link ProtoPasParser#stmt}.
     *
     * @param ctx the parse tree
     */
    void exitStmt(ProtoPasParser.StmtContext ctx);

    /**
     * Enter a parse tree produced by {@link ProtoPasParser#inline_var}.
     *
     * @param ctx the parse tree
     */
    void enterInline_var(ProtoPasParser.Inline_varContext ctx);

    /**
     * Exit a parse tree produced by {@link ProtoPasParser#inline_var}.
     *
     * @param ctx the parse tree
     */
    void exitInline_var(ProtoPasParser.Inline_varContext ctx);

    /**
     * Enter a parse tree produced by {@link ProtoPasParser#inline_type}.
     *
     * @param ctx the parse tree
     */
    void enterInline_type(ProtoPasParser.Inline_typeContext ctx);

    /**
     * Exit a parse tree produced by {@link ProtoPasParser#inline_type}.
     *
     * @param ctx the parse tree
     */
    void exitInline_type(ProtoPasParser.Inline_typeContext ctx);

    /**
     * Enter a parse tree produced by {@link ProtoPasParser#inline_assign}.
     *
     * @param ctx the parse tree
     */
    void enterInline_assign(ProtoPasParser.Inline_assignContext ctx);

    /**
     * Exit a parse tree produced by {@link ProtoPasParser#inline_assign}.
     *
     * @param ctx the parse tree
     */
    void exitInline_assign(ProtoPasParser.Inline_assignContext ctx);

    /**
     * Enter a parse tree produced by {@link ProtoPasParser#vars}.
     *
     * @param ctx the parse tree
     */
    void enterVars(ProtoPasParser.VarsContext ctx);

    /**
     * Exit a parse tree produced by {@link ProtoPasParser#vars}.
     *
     * @param ctx the parse tree
     */
    void exitVars(ProtoPasParser.VarsContext ctx);

    /**
     * Enter a parse tree produced by {@link ProtoPasParser#var}.
     *
     * @param ctx the parse tree
     */
    void enterVar(ProtoPasParser.VarContext ctx);

    /**
     * Exit a parse tree produced by {@link ProtoPasParser#var}.
     *
     * @param ctx the parse tree
     */
    void exitVar(ProtoPasParser.VarContext ctx);

    /**
     * Enter a parse tree produced by {@link ProtoPasParser#assign}.
     *
     * @param ctx the parse tree
     */
    void enterAssign(ProtoPasParser.AssignContext ctx);

    /**
     * Exit a parse tree produced by {@link ProtoPasParser#assign}.
     *
     * @param ctx the parse tree
     */
    void exitAssign(ProtoPasParser.AssignContext ctx);

    /**
     * Enter a parse tree produced by {@link ProtoPasParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterExpr(ProtoPasParser.ExprContext ctx);

    /**
     * Exit a parse tree produced by {@link ProtoPasParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitExpr(ProtoPasParser.ExprContext ctx);
}