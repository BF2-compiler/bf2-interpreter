package bf2;

import java.util.ArrayList;
import java.util.List;

public class Block {
    public List<Command> commands_ = new ArrayList<>();
    public Block(){
        commands_ = new ArrayList<>();
    }
    public void addCommand(Command command){
        commands_.add(command);
    }
}
