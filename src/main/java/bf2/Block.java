package bf2;

import GUI.BF2Frame;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Block extends VarGetter{
    public List<Command> commands_;
    public boolean isBlockGet_;
    public Block(boolean isBlockGet){
        commands_ = new ArrayList<>();
        isBlockGet_ = isBlockGet;
    }
    public void addCommand(Command command){
        commands_.add(command);
    }

    /*
        This method copies the Board object, performs all command actions and return the value
        of the last cell where the pointer was set
    */
    public int getValueFromCommands(){
        Board.saveBoardState();
        for (Command com : commands_) {
            AntlrToLine.evaluateCommand(com);
        }
        int returnValue = Board.getCurrentValue();
        Board.loadBoardState();
        return returnValue;
    }
}
