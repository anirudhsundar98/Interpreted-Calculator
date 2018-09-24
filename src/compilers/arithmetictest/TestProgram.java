package compilers.arithmetictest;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class TestProgram {

    public static void main(String[] args) throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        ArithmeticTestLexer lexer = new ArithmeticTestLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ArithmeticTestParser parser = new ArithmeticTestParser(tokens);
        ParseTree tree = parser.prog();
        System.out.println(tree.toStringTree(parser));
    }
}
