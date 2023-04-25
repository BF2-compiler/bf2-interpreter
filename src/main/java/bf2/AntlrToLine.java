package bf2;

import GUI.BF2Frame;
import antlr.bf2BaseVisitor;
import antlr.bf2Parser;

import java.util.*;

public class AntlrToLine extends bf2BaseVisitor<Line>{
    @Override
    public Line visitCommandComment(bf2Parser.CommandCommentContext ctx) {
        Line line = new Line();
        AntlrToCommand commandVisitor = new AntlrToCommand();
        for (int i=0; i < ctx.getChildCount(); i++) {
            Command com = commandVisitor.visit(ctx.getChild(i));

            // Adding commands from ifStatement block to command list of a given line

            line.addCommand(com);
        }

        List<Command> tempList = line.commandList;
        ListIterator<Command> commandListIterator = tempList.listIterator();
        while ( commandListIterator.hasNext() ) {
            System.out.println(line.commandList);
            Command com = commandListIterator.next();
            if (com instanceof Number tempNum) {
                Board.updateBoard(tempNum.value_);
            } else if (com instanceof DirectionalMove) {
                Board.updatePointerX(((DirectionalMove) com).changeX_);
                Board.updatePointerY(((DirectionalMove) com).changeY_);
            } else if (com instanceof Loop) {
//                if (((Loop) com).satisfied_ ) {
//                    for (Command blockCommand : ((Loop) com).blockOfCommands.commands_)
//                    {
//                        commandListIterator.add(blockCommand);
//                        commandListIterator.previous();
//                    }
////                    commandListIterator.add(com);
////                    commandListIterator.previous();
//                }
                if (((Loop) com).range_ != 0) {
                    for ( int id=0; id<((Loop) com).range_; id++)
                    {
                        int numberOfIterations = 0;
                        for (Command blockCommand : ((Loop) com).blockOfCommands.commands_)
                        {
                            commandListIterator.add(blockCommand);
                            numberOfIterations += 1;
                        }
                        for ( int j=0; j<numberOfIterations; j++)
                        {
                            commandListIterator.previous();
                        }

                    }
                }
            } else if (com instanceof IfStatement) {
                if (((IfStatement) com).satisfied_) {
                    System.out.println(((IfStatement) com).satisfied_);
                    System.out.println();
                    System.out.println("JEEEEEEJ");
                    System.out.println();
                    int numberOfIterations = 0;
                    for (Command blockCommand : ((IfStatement) com).blockOfCommands.commands_)
                    {
                        commandListIterator.add(blockCommand);
                        numberOfIterations += 1;
                    }
                    for ( int j=0; j<numberOfIterations; j++)
                    {
                        commandListIterator.previous();
                    }
                }
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

        return line;
    }

    @Override
    public Line visitComment(bf2Parser.CommentContext ctx) {

        return super.visitComment(ctx);
    }

    @Override
    public Line visitDefinitionOfFunction(bf2Parser.DefinitionOfFunctionContext ctx) {
        return super.visitDefinitionOfFunction(ctx);
    }


}
