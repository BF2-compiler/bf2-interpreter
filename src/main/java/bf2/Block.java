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
        Cell[][] boardCopy = Board.mainBoard;
        int pointerXCopy = Board.pointerX;
        int pointerYCopy = Board.pointerY;
        for (Command com : commands_){
            if (com instanceof Number tempNum) {
                boardCopy[pointerYCopy][pointerXCopy] = new Cell(tempNum.value_);
            } else if (com instanceof DirectionalMove) {
                pointerXCopy += ((DirectionalMove) com).changeX_;
                pointerYCopy += ((DirectionalMove) com).changeY_;
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

        return boardCopy[pointerYCopy][pointerXCopy].getValue_();
    }
}
