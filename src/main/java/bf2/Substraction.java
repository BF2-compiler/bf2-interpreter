package bf2;

public class Substraction extends Command {
    Block left;
    Block right;

    public Substraction(Block left, Block right) throws Exception {
        if (left.getValueFromCommands() < right.getValueFromCommands()) {
            StringBuilder s = new StringBuilder("Substraction produced negative output:\t");
            s.append(left.getValueFromCommands());
            s.append(" - ");
            s.append(right.getValueFromCommands());
            
            throw new Exception(s.toString(), null);
        }

        this.left = left;
        this.right = right;
    }

    public String toString() {
        return this.left.toString() + " - " + this.right.toString();
    }
}
