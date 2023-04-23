package bf2;

import GUI.BF2Frame;
import antlr.bf2BaseVisitor;
import antlr.bf2Parser;
import java.util.Objects;
import org.apache.commons.lang3.tuple.Pair;

public class AntlrToLine extends bf2BaseVisitor<Line>{
    @Override
    public Line visitCommandComment(bf2Parser.CommandCommentContext ctx) {
        Line line = new Line();
        AntlrToCommand commandVisitor = new AntlrToCommand();
        for (int i=0; i < ctx.getChildCount(); i++) {
            Command com = commandVisitor.visit(ctx.getChild(i));

            // Adding commands from ifStatement block to command list of a given line
            if (com instanceof IfStatement statement) {
                for (Pair<Block, Boolean> blockBoolean : statement.blocks) {
                    if (blockBoolean.getValue()){
                        for (Command blockCommand : blockBoolean.getKey().commands_)
                            line.addCommand(blockCommand);
                        break;
                    }
                }
            } else
                line.addCommand(com);
        }

        for (Command com : line.commandList) {
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
