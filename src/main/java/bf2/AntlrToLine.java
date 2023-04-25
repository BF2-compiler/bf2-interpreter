package bf2;

import GUI.BF2Frame;
import antlr.bf2BaseVisitor;
import antlr.bf2Parser;

import java.util.*;

public class AntlrToLine extends bf2BaseVisitor<Line>{

    public void evaluateCommand(Command command){
        if (command instanceof IfStatement) {
            if (((IfStatement) command).satisfied_) {
                for (Command blockCommand : ((IfStatement) command).blockOfCommands.commands_)
                    evaluateCommand(blockCommand);
            }
        } else if (command instanceof Loop) {
            if (((Loop) command).satisfied_ ) {
                for (Command blockCommand : ((Loop) command).blockOfCommands.commands_)
                {
                    evaluateCommand(blockCommand);
                }
                for (Cell[] ints : Board.mainBoard) {
                    for (Cell int_ : ints) {
                        System.out.print(int_.getValue_() + "\t");
                    }
                System.out.println();
                }
                System.out.println("\n\n");
                evaluateCommand(command);
            }
            if (((Loop) command).range_ != 0) {
                for ( int id=0; id<((Loop) command).range_; id++)
                {
                    for (Command blockCommand : ((Loop) command).blockOfCommands.commands_)
                    {
                        evaluateCommand(blockCommand);
                    }
                }
            }
        } else if (command instanceof Number tempNum) {
            Board.updateBoard(tempNum.value_);
        } else if (command instanceof DirectionalMove) {
            Board.updatePointerX(((DirectionalMove) command).changeX_);
            Board.updatePointerY(((DirectionalMove) command).changeY_);
        } else if (command instanceof Function f) {
            if (Objects.equals(f.name_, "READ_AS_STRING")) {
                BF2Frame frame = new BF2Frame();
                frame.print_as_string();
                frame.pack();
                frame.setVisible(true);
            } else if (Objects.equals(f.name_, "READ_AS_INT")) {
                BF2Frame frame = new BF2Frame();
                frame.print_as_int();
                frame.pack();
                frame.setVisible(true);
            } else if (Objects.equals(f.name_, "READ_AS_COLORS")) {
                BF2Frame frame = new BF2Frame();
                frame.print_as_colors();
                frame.pack();
                frame.setVisible(true);
            }
        }

    }
    @Override
    public Line visitCommandComment(bf2Parser.CommandCommentContext ctx) {
        Line line = new Line();
        AntlrToCommand commandVisitor = new AntlrToCommand();
        for (int i=0; i < ctx.getChildCount(); i++) {
            Command com = commandVisitor.visit(ctx.getChild(i));
            evaluateCommand(com);
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
