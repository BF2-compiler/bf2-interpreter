package bf2;

public class BoolStatement{
    public boolean satisfied;
    public BoolStatement(Number variable){
        if (variable instanceof Number){
            satisfied = (((Number) variable).value_ != 0);
        }
        else
            satisfied = false;
    }
}
