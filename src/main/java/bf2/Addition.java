package bf2;

public class Addition extends Command {
    Block left;
    Block right;

    public Addition(Block left, Block right) throws Exception {
        StringBuilder s = new StringBuilder("Addition produced negative output:\t");
        // Ex. -9 + 5
        if (left.getValueFromCommands() < 0) {
            if (left.getValueFromCommands() * -1 > right.getValueFromCommands()) {
                s.append(left.getValueFromCommands());
                s.append(" + ");
                s.append(right.getValueFromCommands());

                throw new Exception(s.toString(), null);
            }
        }
        // Ex. 5 + -9
        if (right.getValueFromCommands() < 0) {
            if (left.getValueFromCommands() < right.getValueFromCommands() * -1) {
                s.append(left.getValueFromCommands());
                s.append(" + ");
                s.append(right.getValueFromCommands());

                throw new Exception(s.toString(), null);
            }
        }
        // Ex. -6 + (-7)
        if (left.getValueFromCommands() < 0 && right.getValueFromCommands() < 0) {
            s.append(left.getValueFromCommands());
            s.append(" + ");
            s.append(right.getValueFromCommands());

            throw new Exception(s.toString(), null);
        }

        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return left.toString() + " + " + right.toString();
    }
}
