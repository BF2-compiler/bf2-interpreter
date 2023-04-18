package bf2;

import antlr.bf2BaseVisitor;
import antlr.bf2Parser;
import GUI.BF2Frame;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AntlrToProgram extends bf2BaseVisitor<Program>{

    public List<String> semanticErrors = new ArrayList<>();

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
//                            try{
                                Board.updatePointerX(((DirectionalMove) com).changeX_);
                                Board.updatePointerY(((DirectionalMove) com).changeY_);
//                            } catch (Exception e)
//                            {
//                                List<Line> tempList= prog.lines;
//                                while (tempList.remove(null));
//                                int line = tempList.indexOf(l) + 2;
//                                int index = l.commandList.indexOf(com);
//                                semanticErrors.add(" Getting out of range in line: "
//                                        + line + " by command: " + ctx.getChild(i).getText());
//                            }
//
                        } else if (com instanceof Function f){
                            if (Objects.equals(f.name_, "READ_AS_STRING")){
                                BF2Frame frame = new BF2Frame();
                                //frame.print_as_string(Board.mainBoard);
                                frame.pack();
                                frame.setVisible(true);
                            }
                            else if (Objects.equals(f.name_, "READ_AS_INT")){
                                BF2Frame frame = new BF2Frame();
                                //frame.print_as_int(mainBoard);
                                frame.pack();
                                frame.setVisible(true);
                            } else if (Objects.equals(f.name_, "READ_AS_COLORS")){
                                BF2Frame frame = new BF2Frame();
                                //frame.print_as_colors(mainBoard);
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
