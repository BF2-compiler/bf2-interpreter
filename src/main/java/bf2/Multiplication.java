package bf2;

public class Multiplication extends Command {
    Block left;
    Block right;
    
    public Multiplication(Block left, Block right) throws Exception {

        if (left.getValueFromCommands() < 0 ^ right.getValueFromCommands() < 0) {
            StringBuilder s = new StringBuilder("Multiplication produced negative output:\t");
            s.append(left.getValueFromCommands());
            s.append(" * ");
            s.append(right.getValueFromCommands());

            throw new Exception(s.toString(), null);
        }

        this.left = left;
        this.right = right;
    }

    @Override    
    public String toString() {
        return this.left.toString() + " * " + this.right.toString();
    }
}
