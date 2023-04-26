package bf2;

public class BoolStatement{
    public boolean satisfied;
    public BoolStatement(VarGetter variable){
        if (variable instanceof Number){
            satisfied = (((Number) variable).value_ != 0);
        }
        else if (variable instanceof Block){
            satisfied = ((Block) variable).getValueFromCommands() != 0;
        }
        else
            satisfied = false;
    }
    public BoolStatement(){
        satisfied = false;
    }
}
