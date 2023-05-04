package bf2;

import java.util.HashMap;
import java.util.Map;

public class Functions extends Command{
    static Map<String, Block> funcMap_ = new HashMap<>();
    public static void addFunction(String name, Block block){
        funcMap_.put(name, block);
    }
    public static Block getBlockFromFunction(String functionName){
        return funcMap_.get(functionName);
    }
}
