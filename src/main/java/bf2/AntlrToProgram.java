package bf2;

import antlr.bf2BaseVisitor;
import antlr.bf2Parser;
import GUI.BF2Frame;

import java.util.Objects;

public class AntlrToProgram extends bf2BaseVisitor<Program>{

    @Override
    public Program visitProgram(bf2Parser.ProgramContext ctx) {
        int sizeX = Integer.parseInt(ctx.getChild(0).getText());
        int sizeY = Integer.parseInt(ctx.getChild(2).getText());

        Board.setInitialBoard(sizeX, sizeY);

        Program prog  = new Program();

        AntlrToLine lineVisitor = new AntlrToLine();

        for (int i=0; i < ctx.getChildCount(); i++)
        {
            if (i == ctx.getChildCount() - 1)
            {
                /* last line of the start symbol prog is EOF */
            }
            else {
                Line l = lineVisitor.visit(ctx.getChild(i));
                prog.addLine(l);
                if (l != null) {
                    for (Command com : l.commandList) {
                        if (com instanceof Number tempNum) {
                            Board.updateBoard(tempNum.value_);
                        } else if (com instanceof DirectionalMove) {
                            Board.updatePointerX(((DirectionalMove) com).changeX_);
                            Board.updatePointerY(((DirectionalMove) com).changeY_);
                        } else if (com instanceof Function f){
                            if (Objects.equals(f.name_, "READ_AS_STRING")){
                                BF2Frame frame = new BF2Frame();
                                frame.print_as_string();
                                frame.pack();
                                frame.setVisible(true);
                            }
                            else if (Objects.equals(f.name_, "READ_AS_INT")){
                                BF2Frame frame = new BF2Frame();
                                frame.print_as_int();
                                frame.pack();
                                frame.setVisible(true);
                            } else if (Objects.equals(f.name_, "READ_AS_COLORS")){
                                BF2Frame frame = new BF2Frame();
                                frame.print_as_colors();
                                frame.pack();
                                frame.setVisible(true);
                            }
                        }
                    }
                }
            }
        }
        return super.visitProgram(ctx);
    }
}
