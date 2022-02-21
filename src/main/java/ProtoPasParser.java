// Generated from .\ProtoPas.g4 by ANTLR 4.9

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProtoPasParser extends Parser {
    static {
        RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, NUM = 9,
            ID = 10, WS = 11;
    public static final int
            RULE_program = 0, RULE_body = 1, RULE_stmts = 2, RULE_stmt = 3, RULE_inline_var = 4,
            RULE_inline_type = 5, RULE_inline_assign = 6, RULE_vars = 7, RULE_var = 8,
            RULE_assign = 9, RULE_expr = 10;

    private static String[] makeRuleNames() {
        return new String[]{
                "program", "body", "stmts", "stmt", "inline_var", "inline_type", "inline_assign",
                "vars", "var", "assign", "expr"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'program'", "';'", "'.'", "'begin'", "'end'", "'var'", "':'",
                "':='"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, "NUM", "ID", "WS"
        };
    }

    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;

    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }

    @Override
    public String getGrammarFileName() {
        return "ProtoPas.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public ProtoPasParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class ProgramContext extends ParserRuleContext {
        public TerminalNode ID() {
            return getToken(ProtoPasParser.ID, 0);
        }

        public VarsContext vars() {
            return getRuleContext(VarsContext.class, 0);
        }

        public BodyContext body() {
            return getRuleContext(BodyContext.class, 0);
        }

        public ProgramContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_program;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ProtoPasListener) ((ProtoPasListener) listener).enterProgram(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ProtoPasListener) ((ProtoPasListener) listener).exitProgram(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ProtoPasVisitor) return ((ProtoPasVisitor<? extends T>) visitor).visitProgram(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ProgramContext program() throws RecognitionException {
        ProgramContext _localctx = new ProgramContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_program);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(22);
                match(T__0);
                setState(23);
                match(ID);
                setState(24);
                match(T__1);
                setState(25);
                vars();
                setState(26);
                body();
                setState(27);
                match(T__2);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class BodyContext extends ParserRuleContext {
        public StmtsContext stmts() {
            return getRuleContext(StmtsContext.class, 0);
        }

        public BodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_body;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ProtoPasListener) ((ProtoPasListener) listener).enterBody(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ProtoPasListener) ((ProtoPasListener) listener).exitBody(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ProtoPasVisitor) return ((ProtoPasVisitor<? extends T>) visitor).visitBody(this);
            else return visitor.visitChildren(this);
        }
    }

    public final BodyContext body() throws RecognitionException {
        BodyContext _localctx = new BodyContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_body);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(29);
                match(T__3);
                setState(30);
                stmts();
                setState(31);
                match(T__4);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class StmtsContext extends ParserRuleContext {
        public StmtContext stmt() {
            return getRuleContext(StmtContext.class, 0);
        }

        public StmtsContext stmts() {
            return getRuleContext(StmtsContext.class, 0);
        }

        public StmtsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_stmts;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ProtoPasListener) ((ProtoPasListener) listener).enterStmts(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ProtoPasListener) ((ProtoPasListener) listener).exitStmts(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ProtoPasVisitor) return ((ProtoPasVisitor<? extends T>) visitor).visitStmts(this);
            else return visitor.visitChildren(this);
        }
    }

    public final StmtsContext stmts() throws RecognitionException {
        StmtsContext _localctx = new StmtsContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_stmts);
        try {
            setState(38);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 0, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(33);
                    stmt();
                    setState(34);
                    match(T__1);
                    setState(35);
                    stmts();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(37);
                    stmt();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class StmtContext extends ParserRuleContext {
        public AssignContext assign() {
            return getRuleContext(AssignContext.class, 0);
        }

        public Inline_varContext inline_var() {
            return getRuleContext(Inline_varContext.class, 0);
        }

        public StmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ProtoPasListener) ((ProtoPasListener) listener).enterStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ProtoPasListener) ((ProtoPasListener) listener).exitStmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ProtoPasVisitor) return ((ProtoPasVisitor<? extends T>) visitor).visitStmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public final StmtContext stmt() throws RecognitionException {
        StmtContext _localctx = new StmtContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_stmt);
        try {
            setState(44);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(40);
                    assign();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(41);
                    if (!(Delphi.supportsInlineVar))
                        throw new FailedPredicateException(this, "Delphi.supportsInlineVar");
                    setState(42);
                    inline_var();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Inline_varContext extends ParserRuleContext {
        public TerminalNode ID() {
            return getToken(ProtoPasParser.ID, 0);
        }

        public Inline_typeContext inline_type() {
            return getRuleContext(Inline_typeContext.class, 0);
        }

        public Inline_assignContext inline_assign() {
            return getRuleContext(Inline_assignContext.class, 0);
        }

        public Inline_varContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_inline_var;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ProtoPasListener) ((ProtoPasListener) listener).enterInline_var(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ProtoPasListener) ((ProtoPasListener) listener).exitInline_var(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ProtoPasVisitor)
                return ((ProtoPasVisitor<? extends T>) visitor).visitInline_var(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Inline_varContext inline_var() throws RecognitionException {
        Inline_varContext _localctx = new Inline_varContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_inline_var);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(46);
                match(T__5);
                setState(47);
                match(ID);
                setState(48);
                inline_type();
                setState(49);
                inline_assign();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Inline_typeContext extends ParserRuleContext {
        public TerminalNode ID() {
            return getToken(ProtoPasParser.ID, 0);
        }

        public Inline_typeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_inline_type;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ProtoPasListener) ((ProtoPasListener) listener).enterInline_type(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ProtoPasListener) ((ProtoPasListener) listener).exitInline_type(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ProtoPasVisitor)
                return ((ProtoPasVisitor<? extends T>) visitor).visitInline_type(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Inline_typeContext inline_type() throws RecognitionException {
        Inline_typeContext _localctx = new Inline_typeContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_inline_type);
        try {
            setState(54);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__6:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(51);
                    match(T__6);
                    setState(52);
                    match(ID);
                }
                break;
                case T__1:
                case T__4:
                case T__7:
                    enterOuterAlt(_localctx, 2);
                {
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Inline_assignContext extends ParserRuleContext {
        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public Inline_assignContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_inline_assign;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ProtoPasListener) ((ProtoPasListener) listener).enterInline_assign(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ProtoPasListener) ((ProtoPasListener) listener).exitInline_assign(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ProtoPasVisitor)
                return ((ProtoPasVisitor<? extends T>) visitor).visitInline_assign(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Inline_assignContext inline_assign() throws RecognitionException {
        Inline_assignContext _localctx = new Inline_assignContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_inline_assign);
        try {
            setState(59);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__7:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(56);
                    match(T__7);
                    setState(57);
                    expr();
                }
                break;
                case T__1:
                case T__4:
                    enterOuterAlt(_localctx, 2);
                {
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class VarsContext extends ParserRuleContext {
        public List<VarContext> var() {
            return getRuleContexts(VarContext.class);
        }

        public VarContext var(int i) {
            return getRuleContext(VarContext.class, i);
        }

        public VarsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_vars;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ProtoPasListener) ((ProtoPasListener) listener).enterVars(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ProtoPasListener) ((ProtoPasListener) listener).exitVars(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ProtoPasVisitor) return ((ProtoPasVisitor<? extends T>) visitor).visitVars(this);
            else return visitor.visitChildren(this);
        }
    }

    public final VarsContext vars() throws RecognitionException {
        VarsContext _localctx = new VarsContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_vars);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(67);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__5) {
                    {
                        setState(61);
                        match(T__5);
                        setState(63);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        do {
                            {
                                {
                                    setState(62);
                                    var();
                                }
                            }
                            setState(65);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        } while (_la == ID);
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class VarContext extends ParserRuleContext {
        public List<TerminalNode> ID() {
            return getTokens(ProtoPasParser.ID);
        }

        public TerminalNode ID(int i) {
            return getToken(ProtoPasParser.ID, i);
        }

        public VarContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_var;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ProtoPasListener) ((ProtoPasListener) listener).enterVar(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ProtoPasListener) ((ProtoPasListener) listener).exitVar(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ProtoPasVisitor) return ((ProtoPasVisitor<? extends T>) visitor).visitVar(this);
            else return visitor.visitChildren(this);
        }
    }

    public final VarContext var() throws RecognitionException {
        VarContext _localctx = new VarContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_var);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(69);
                match(ID);
                setState(70);
                match(T__6);
                setState(71);
                match(ID);
                setState(72);
                match(T__1);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AssignContext extends ParserRuleContext {
        public TerminalNode ID() {
            return getToken(ProtoPasParser.ID, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public AssignContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_assign;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ProtoPasListener) ((ProtoPasListener) listener).enterAssign(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ProtoPasListener) ((ProtoPasListener) listener).exitAssign(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ProtoPasVisitor) return ((ProtoPasVisitor<? extends T>) visitor).visitAssign(this);
            else return visitor.visitChildren(this);
        }
    }

    public final AssignContext assign() throws RecognitionException {
        AssignContext _localctx = new AssignContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_assign);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(74);
                match(ID);
                setState(75);
                match(T__7);
                setState(76);
                expr();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ExprContext extends ParserRuleContext {
        public TerminalNode ID() {
            return getToken(ProtoPasParser.ID, 0);
        }

        public TerminalNode NUM() {
            return getToken(ProtoPasParser.NUM, 0);
        }

        public ExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ProtoPasListener) ((ProtoPasListener) listener).enterExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ProtoPasListener) ((ProtoPasListener) listener).exitExpr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ProtoPasVisitor) return ((ProtoPasVisitor<? extends T>) visitor).visitExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ExprContext expr() throws RecognitionException {
        ExprContext _localctx = new ExprContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_expr);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(78);
                _la = _input.LA(1);
                if (!(_la == NUM || _la == ID)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 3:
                return stmt_sempred((StmtContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean stmt_sempred(StmtContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return Delphi.supportsInlineVar;
        }
        return true;
    }

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\rS\4\2\t\2\4\3\t" +
                    "\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4" +
                    "\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4" +
                    "\5\4)\n\4\3\5\3\5\3\5\3\5\5\5/\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7" +
                    "9\n\7\3\b\3\b\3\b\5\b>\n\b\3\t\3\t\6\tB\n\t\r\t\16\tC\5\tF\n\t\3\n\3\n" +
                    "\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22" +
                    "\24\26\2\3\3\2\13\f\2N\2\30\3\2\2\2\4\37\3\2\2\2\6(\3\2\2\2\b.\3\2\2\2" +
                    "\n\60\3\2\2\2\f8\3\2\2\2\16=\3\2\2\2\20E\3\2\2\2\22G\3\2\2\2\24L\3\2\2" +
                    "\2\26P\3\2\2\2\30\31\7\3\2\2\31\32\7\f\2\2\32\33\7\4\2\2\33\34\5\20\t" +
                    "\2\34\35\5\4\3\2\35\36\7\5\2\2\36\3\3\2\2\2\37 \7\6\2\2 !\5\6\4\2!\"\7" +
                    "\7\2\2\"\5\3\2\2\2#$\5\b\5\2$%\7\4\2\2%&\5\6\4\2&)\3\2\2\2\')\5\b\5\2" +
                    "(#\3\2\2\2(\'\3\2\2\2)\7\3\2\2\2*/\5\24\13\2+,\6\5\2\2,/\5\n\6\2-/\3\2" +
                    "\2\2.*\3\2\2\2.+\3\2\2\2.-\3\2\2\2/\t\3\2\2\2\60\61\7\b\2\2\61\62\7\f" +
                    "\2\2\62\63\5\f\7\2\63\64\5\16\b\2\64\13\3\2\2\2\65\66\7\t\2\2\669\7\f" +
                    "\2\2\679\3\2\2\28\65\3\2\2\28\67\3\2\2\29\r\3\2\2\2:;\7\n\2\2;>\5\26\f" +
                    "\2<>\3\2\2\2=:\3\2\2\2=<\3\2\2\2>\17\3\2\2\2?A\7\b\2\2@B\5\22\n\2A@\3" +
                    "\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2E?\3\2\2\2EF\3\2\2\2F\21" +
                    "\3\2\2\2GH\7\f\2\2HI\7\t\2\2IJ\7\f\2\2JK\7\4\2\2K\23\3\2\2\2LM\7\f\2\2" +
                    "MN\7\n\2\2NO\5\26\f\2O\25\3\2\2\2PQ\t\2\2\2Q\27\3\2\2\2\b(.8=CE";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}