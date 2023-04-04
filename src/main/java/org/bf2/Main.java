package org.bf2;

import java.io.FileInputStream;
import java.io.InputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {

    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if(args.length > 0) {
            inputFile = args[0];
        }
        InputStream is = System.in;
        if(inputFile != null) {
            is = new FileInputStream(inputFile);
        }
        CharStream input = CharStreams.fromStream(is);
        bf2Lexer lexer = new bf2Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        bf2Parser parser = new bf2Parser(tokens);

        ParseTree tree = parser.prog();
        ParseTreeWalker walker = new ParseTreeWalker();
        ExtractInterfaceListener extractor = new ExtractInterfaceListener(parser);
        walker.walk(extractor, tree);
    }

}