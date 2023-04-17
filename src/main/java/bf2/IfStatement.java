package bf2;

public class IfStatement extends Command{
    public boolean satisfied_;
    public Block commands;

    public IfStatement(boolean is_satisfied, Block commandList){
        satisfied_ = is_satisfied;
        commands = commandList;
    }
}
