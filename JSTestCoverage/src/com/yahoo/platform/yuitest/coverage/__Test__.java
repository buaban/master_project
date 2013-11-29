import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        TestNestingFunctionExpressionLexer lex = new TestNestingFunctionExpressionLexer(new ANTLRFileStream("C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        TestNestingFunctionExpressionParser g = new TestNestingFunctionExpressionParser(tokens, 49100, null);
        try {
            g.functionExpression();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}