package bf2;


import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import java.util.ArrayList;


public class IfStatement extends Command{
    public ArrayList<Pair<Block, Boolean>> blocks;

    public IfStatement(){
        blocks = new ArrayList<>();
    }

    public void addBlock(Block block, boolean isSatisfied){
        blocks.add(new ImmutablePair<>(block, isSatisfied));
    }

}
