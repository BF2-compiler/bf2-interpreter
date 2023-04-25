package bf2;


public class Division extends Command {
    Block left;
    Block right;

    public Division(Block left, Block right) throws Exception {

        if (right.getValueFromCommands() == 0) {
            StringBuilder s = new StringBuilder("Division by 0 occured:\t");
            s.append(left.getValueFromCommands());
            s.append(" / ");
            s.append(right.getValueFromCommands());

            throw new Exception(s.toString(), null);
        }
        
        this.left = left;
        this.right = right;
    }

    @Override 
    public String toString() {
        return this.left.toString() + " / " + this.right.toString();
    }
}
