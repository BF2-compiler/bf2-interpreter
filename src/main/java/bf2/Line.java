package bf2;

import java.util.ArrayList;
import java.util.List;

public class Line {
    List<Command> commandList;
    public Line(){
        commandList = new ArrayList<Command>();
    }
    public void addCommand(Command command){
        commandList.add(command);
    }
}
