package bf2;

import antlr.bf2BaseVisitor;
import antlr.bf2Parser;
import GUI.BF2Frame;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AntlrToProgram extends bf2BaseVisitor<Program>{

    public List<String> semanticErrors = new ArrayList<>();
    public Board board = new Board();

    @Override
    public Program visitProgram(bf2Parser.ProgramContext ctx) {
        int sizeX = Integer.parseInt(ctx.getChild(0).getText());
        int sizeY = Integer.parseInt(ctx.getChild(2).getText());
        board.setInitialBoard(sizeX, sizeY);

        Program program  = new Program();

        AntlrToLine lineVisitor = new AntlrToLine();

        for (int i=0; i < ctx.getChildCount(); i++)
        {
            if (i == ctx.getChildCount() - 1)
            {
                /* last line of the start symbol program is EOF */
            }
            else {
                Line l = lineVisitor.visit(ctx.getChild(i));
//                prog.addLine(l);
            }
        }
        return super.visitProgram(ctx);
    }
}
