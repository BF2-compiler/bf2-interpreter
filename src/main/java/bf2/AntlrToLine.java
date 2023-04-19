package bf2;

import GUI.BF2Frame;
import antlr.bf2BaseVisitor;
import antlr.bf2Parser;

import java.util.ArrayList;
import java.util.List;

public class AntlrToLine extends bf2BaseVisitor<Line>{
    @Override
    public Line visitCommandComment(bf2Parser.CommandCommentContext ctx) {
        Line lines = new Line();
        AntlrToCommand commandVisitor = new AntlrToCommand();
        for (int i=0; i < ctx.getChildCount(); i++)
        {
            Command com = commandVisitor.visit(ctx.getChild(i));

            // Adding commands from ifStatement block to command list of a given line
            if (com instanceof IfStatement){
                if (((IfStatement) com).satisfied_){
                    for (Command blockCommand : ((IfStatement) com).blockOfCommands.commands_)
                        lines.addCommand(blockCommand);
                }
            } else
                lines.addCommand(com);
        }
        return lines;
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
