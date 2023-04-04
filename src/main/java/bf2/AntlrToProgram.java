package bf2;

import antlr.bf2BaseVisitor;
import antlr.bf2Parser;

public class AntlrToProgram extends bf2BaseVisitor<Program>{

    private final int SIZE = 8;
    public int[][] mainBoard = new int[SIZE][SIZE];
    public int pointerX = 0, pointerY = 0;

    /*
        String numText = ctx.getChild(1).getText();
        mainBoard[pointerX][pointerY] = Integer.parseInt(numText);

        System.out.println(Integer.parseInt(numText));
     */

    @Override
    public Program visitProgram(bf2Parser.ProgramContext ctx) {
        Program prog  = new Program();

        AntlrToLine lineVisitor = new AntlrToLine();

        for( int i=0; i < ctx.getChildCount(); i++)
        {
            if ( i == ctx.getChildCount() -1 )
            {
                /* last line of the start symbol prog is EOF */
            }
            else {
                Line l = lineVisitor.visit(ctx.getChild(i));
                prog.addLine(l);
                if (l != null) {
                    for (Command com : l.commandList) {
                        if (com instanceof Number tempNum) {
                            mainBoard[pointerY][pointerX] = tempNum.value_;
                        } else if (com instanceof DirectionalMove) {
                            pointerX += ((DirectionalMove) com).changeX_;
                            pointerY += ((DirectionalMove) com).changeY_;
                        }
                    }
                }
            }
        }
        return super.visitProgram(ctx);
    }
}
