package listener;

import java.util.ArrayList;

public class FunctionNamesTable {
    public static ArrayList<String> functionNames;
    public FunctionNamesTable(){
        functionNames = new ArrayList<String>();
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
