package bf2;

import GUI.BF2Frame;
import antlr.bf2BaseVisitor;
import antlr.bf2Parser;
import java.util.Objects;
import org.apache.commons.lang3.tuple.Pair;

public class AntlrToLine extends bf2BaseVisitor<Line>{

    public static void evaluateCommand(Command command){
        if (command instanceof IfStatement statement) {
            for (Pair<Block, Boolean> blockBoolean : statement.blocks) {
                if (blockBoolean.getValue()) {
                    for (Command blockCommand : blockBoolean.getKey().commands_)
                        evaluateCommand(blockCommand);
                    break;
                }
            }
        } else if (command instanceof Loop) {
            if (((Loop) command).satisfied_ ) {
                for (Command blockCommand : ((Loop) command).blockOfCommands.commands_)
                {
                    evaluateCommand(blockCommand);
                }
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
        }
    }
    @Override
    public Line visitCommandComment(bf2Parser.CommandCommentContext ctx) {
        Line line = new Line();
        AntlrToCommand commandVisitor = new AntlrToCommand();
        for (int i=0; i < ctx.getChildCount(); i++) {
            Command com = commandVisitor.visit(ctx.getChild(i));
            if (com instanceof Loop && ((Loop) com).satisfied_)
            {
                boolean state = ((Loop) com).satisfied_;
                while (state) {
                    evaluateCommand(com);
                    com = commandVisitor.visit(ctx.getChild(i));
                    state = ((Loop) com).satisfied_;
                }
            } else
            {
                evaluateCommand(com);
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
        AntlrToBlock blockVisitor = new AntlrToBlock();
        Block funcBlock = blockVisitor.visit(ctx.getChild(3));
        String funcName = ctx.getChild(2).getText();
        Functions.addFunction(funcName, funcBlock);
        System.out.println(funcName);
        return super.visitDefinitionOfFunction(ctx);
    }


}
