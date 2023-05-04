package listener;

import java.util.ArrayList;
import java.util.List;

public class FunctionNamesTable {
    public static ArrayList<String> functionNames = new ArrayList<>(
            List.of("READ_AS_INT",
                    "READ_AS_STRING",
                    "READ_AS_COLORS"));
    public FunctionNamesTable(){
        functionNames = new ArrayList<>();
        functionNames.add("READ_AS_INT");
        functionNames.add("READ_AS_STRING");
        functionNames.add("READ_AS_COLORS");
    }
    public static boolean tryAddFunctionName(String name){
        if (functionNames.contains(name)){
            return false;
        }
        else{
            functionNames.add(name);
            return true;
        }
    }
}
