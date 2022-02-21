import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProtoPasTests {

    private void testParse(String program, boolean supportInline, boolean expectException) {
        testParse(program, supportInline, expectException, "");
    }

    private void testParse(String program, boolean supportInline, boolean expectException, String expect) {
        Delphi.supportsInlineVar = supportInline;
        try {
            CharStream in = CharStreams.fromString(program);
            ProtoPasLexer lexer = new ProtoPasLexer(in);
            lexer.removeErrorListeners();
            lexer.addErrorListener(ThrowingErrorListener.INSTANCE);


            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ProtoPasParser parser = new ProtoPasParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(ThrowingErrorListener.INSTANCE);

            ParseTree tree = parser.program();
            ParseTreeWalker walker = new ParseTreeWalker();
            ProtoWalker listener = new ProtoWalker();
            walker.walk(listener, tree);
            Assertions.assertFalse(expectException);
            Assertions.assertEquals(expect, listener.toString());
        } catch (Exception ex) {
            Assertions.assertTrue(expectException);
        }
    }


    @Test
    public void testBeginEnd() {
        testParse("program abc; begin end.", true, false,
                "program abc;begin ;end.");
    }

    @Test
    public void testVars() {
        testParse("program abc; var a:integer; b:string; begin end.", true, false,
                "program abc;var a:integer;var b:string;begin ;end.");
    }

    @Test
    public void testAssign() {
        testParse("program abc; var a:integer;  begin a:= 10;end.", true, false,
                "program abc;var a:integer;begin a := 10;;;end.");
    }

    @Test
    public void testInlineVar() {
        testParse("program abc;   begin var a:string;end.", true, false,
                "program abc;begin var a :string;;end.");
    }

    @Test
    public void testInlineVarOk() {
        testParse("program abc;   begin var a:= 10;end.", true, false,
                "program abc;begin var a := 10;;end.");
    }

    // This demonstrates the failure condition where the predicate for inline variables is disabled
    @Test
    public void testInlineVarFalse() {
        testParse("program abc;   begin var a:= 10;end.", false, true);
    }

    @Test
    public void testInlineVarEnd() {
        testParse("program abc;   begin var a : string end.", true, false,
                "program abc;begin var a :string;end.");
    }

    @Test
    public void testInlineVarEndNoType() {
        testParse("program abc;   begin var a  end.", true, false,
                "program abc;begin var a;end.");
    }

}
