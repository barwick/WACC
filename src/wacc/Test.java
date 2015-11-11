package wacc;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

//import antlr package
import wacc.antlr.*;
import wacc.semantics.MyVisitor;


public class Test {
	public static void main(String[] args) throws Exception {
		//create a charStream that reads from stdin
		ANTLRInputStream input = new ANTLRInputStream(System.in);
		
		//create a lexer that feeds off of input charStream
		WACCLexer lexer = new WACCLexer(input);
		
		//create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		//create a parser that feeds off a tokens buffer
		WACCParser parser = new WACCParser(tokens);
		
		ParseTree tree = parser.program(); //begin parsing at prog rule
		
		MyVisitor visitor = new MyVisitor();
		visitor.visit(tree);
		//System.out.println(tree.toStringTree(parser)); //print LISP-style
	}
}
