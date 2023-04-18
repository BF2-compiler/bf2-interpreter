package bf2;

import java.util.ArrayList;
import java.util.List;

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
}
