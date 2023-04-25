package bf2;

public class Loop extends Command{

    public int range_ = 0;
    public boolean satisfied_ = false;
    public Block blockOfCommands;

    public Loop(int range, Block commandList)
    {
        this.range_ = range;
        this.blockOfCommands = commandList;
    }
    public Loop(boolean is_satisfied, Block commandList){
        satisfied_ = is_satisfied;
        blockOfCommands = commandList;
    }
}
