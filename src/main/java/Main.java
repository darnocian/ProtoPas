import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class Main {

    public static void main(String[] args) {
        Delphi.supportsInlineVar = true;
        try {
            CharStream in = CharStreams.fromString("program abc; begin var x := 10; x:=5 end.");
            ProtoPasLexer lexer = new ProtoPasLexer(in);
            lexer.removeErrorListeners();
            lexer.addErrorListener(ThrowingErrorListener.INSTANCE);


            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ProtoPasParser parser = new ProtoPasParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(ThrowingErrorListener.INSTANCE);

            ParseTree tree = parser.program();
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(new ProtoWalker(), tree);

        } catch (Exception ex) {
            System.err.println("Parsing failed: " + ex.getMessage());
            System.exit(-1);
        }


    }
}
