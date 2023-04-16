package bf2;

import antlr.bf2BaseVisitor;
import antlr.bf2Parser;

public class AntlrToProgram extends bf2BaseVisitor<Program>{
    private int SIZE_X = 0, SIZE_Y = 0;
    public int[][] mainBoard;
    public int pointerX = 0, pointerY = 0;

    @Override
    public Program visitProgram(bf2Parser.ProgramContext ctx) {
        SIZE_X = Integer.parseInt(ctx.getChild(0).getText());
        SIZE_Y = Integer.parseInt(ctx.getChild(2).getText());

        mainBoard = new int[SIZE_X][SIZE_Y];

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
