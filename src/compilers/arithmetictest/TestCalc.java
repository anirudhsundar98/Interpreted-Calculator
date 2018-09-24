package compilers.arithmetictest;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
//import org.omg.CORBA.INTERNAL;

import java.util.HashMap;

public class TestCalc {
    public static void main(String[] args) throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        ArithmeticTestLexer lexer = new ArithmeticTestLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ArithmeticTestParser parser = new ArithmeticTestParser(tokens);
        ParseTree tree = parser.prog();

//        System.out.println(tree.toStringTree(parser));

        CalcVisitor calc = new CalcVisitor();
        calc.visit(tree);

        HashMap<Integer, Integer> m = new HashMap<>();
        m.keySet();
    }
}
