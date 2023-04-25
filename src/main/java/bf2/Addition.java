package bf2;

public class Addition extends Command {
    Block left;
    Block right;

    public Addition(Block left, Block right) throws Exception {
        // Ex. -9 + 5
        if (left.getValueFromCommands() < 0) {
            if (left.getValueFromCommands() * -1 > right.getValueFromCommands()) {
                throw new Exception("", null);
            }
        }
        // Ex. 5 + -9
        if (right.getValueFromCommands() < 0) {
            if (left.getValueFromCommands() < right.getValueFromCommands() * -1) {
                throw new Exception("null", null);
            }
        }
        
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return left.toString() + " + " + right.toString();
    }
}
