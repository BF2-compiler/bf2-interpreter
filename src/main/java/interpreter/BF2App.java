package interpreter;

import antlr.bf2Parser;
import antlr.bf2Lexer;
import bf2.AntlrToProgram;
import bf2.Program;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class BF2App {
    public static void main(String[] args) {
        if(args.length != 1)
        {
            System.err.println("Usage: file name");
        }
        else {
            String fileName = args[0];
            bf2Parser parser = getParser(fileName);

            // tell ANTLR to build a parse tree
            //parse from the start symbol 'prog'

            ParseTree antlrAST = parser.prog();

            // Create a visitor for converting the parse tree into lines expressions objcets
            AntlrToProgram progVisitor = new AntlrToProgram();
            Program prog = progVisitor.visit(antlrAST);

            // HERE WE NEED TO USE TABLE FROM PROG...





        }
    }

    private static bf2Parser getParser(String fileName)
    {
        bf2Parser parser = null;

        try {
            CharStream input = CharStreams.fromFileName(fileName);
            bf2Lexer lexer = new bf2Lexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new bf2Parser(tokens);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        return parser;
    }

}
