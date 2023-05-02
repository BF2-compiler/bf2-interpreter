package bf2;

public class Subtraction extends Expression {
    int left;
    int right;

    public Subtraction(int left, int right) throws RuntimeException {
        if (left < right) {
            StringBuilder s = new StringBuilder("Substraction produced negative output:\t");
            s.append(left);
            s.append(" - ");
            s.append(right);

            throw new RuntimeException(s.toString(), null);
        }

        this.left = left;
        this.right = right;
    }

    public String toString() {
        return Integer.toString(left) + " - " + Integer.toString(right);
    }
}
