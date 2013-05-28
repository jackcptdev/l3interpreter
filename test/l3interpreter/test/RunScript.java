package l3interpreter.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import l3interpreter.antlr.L3Lexer;
import l3interpreter.antlr.L3Parser;
import l3interpreter.inter.InterpreterImpl;
import l3interpreter.inter.InterpreterParserLexer;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class RunScript {

	public static void main(String[] args) {

		try {
			String file = "etc/proc.script";
			InputStream is = new FileInputStream(new File(file));
			ANTLRInputStream charInput = new ANTLRInputStream(is);
			L3Lexer l1lexer = new L3Lexer(charInput);
			CommonTokenStream tokens = new CommonTokenStream(l1lexer);
			L3Parser l1parser = new L3Parser(tokens);
			ParseTree tree = l1parser.prog();
			InterpreterParserLexer prepare = new InterpreterParserLexer();
			InterpreterImpl itp = new InterpreterImpl(System.out, System.err);
			prepare.visit(tree);
			itp.visit(tree);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
