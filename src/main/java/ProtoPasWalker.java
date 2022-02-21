import org.antlr.v4.runtime.tree.TerminalNode;

class ProtoWalker extends ProtoPasBaseListener {

    private final StringBuilder sb = new StringBuilder();

    @Override
    public void enterProgram(ProtoPasParser.ProgramContext ctx) {
        sb.append("program ");
        sb.append(ctx.ID().getText());
        sb.append(";");
    }

    @Override
    public void enterVar(ProtoPasParser.VarContext ctx) {
        sb.append("var ");
        sb.append(ctx.ID(0).getText());
        sb.append(":");
        sb.append(ctx.ID(1).getText());
        sb.append(";");
    }

    @Override
    public void enterBody(ProtoPasParser.BodyContext ctx) {
        sb.append("begin ");
    }

    @Override
    public void exitBody(ProtoPasParser.BodyContext ctx) {
        sb.append("end.");
    }

    @Override
    public void enterAssign(ProtoPasParser.AssignContext ctx) {

        sb.append(ctx.ID());
        sb.append(" := ");
    }

    @Override
    public void enterInline_var(ProtoPasParser.Inline_varContext ctx) {
        sb.append("var ");
        sb.append(ctx.ID());
    }

    @Override
    public void enterInline_type(ProtoPasParser.Inline_typeContext ctx) {
        if (ctx.ID() == null)
            return;
        sb.append(" :");
        sb.append(ctx.ID());
    }

    @Override
    public void enterInline_assign(ProtoPasParser.Inline_assignContext ctx) {
        if (ctx.expr() == null)
            return;
        sb.append(" := ");
    }

    @Override
    public void exitAssign(ProtoPasParser.AssignContext ctx) {
        sb.append(";");
    }

    @Override
    public void exitStmt(ProtoPasParser.StmtContext ctx) {
        sb.append(";");
    }

    @Override
    public String toString() {
        return sb.toString();
    }


    @Override
    public void enterExpr(ProtoPasParser.ExprContext ctx) {
        TerminalNode id = ctx.ID();
        TerminalNode num = ctx.NUM();
        if (id != null)
            sb.append(id.getText());
        if (num != null)
            sb.append(num.getText());
    }

}