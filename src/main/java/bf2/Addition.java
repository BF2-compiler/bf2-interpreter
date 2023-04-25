package bf2;


public class Addition extends Expression {
    int left;
    int right;

    public Addition(int left, int right) throws RuntimeException {
        StringBuilder s = new StringBuilder("Addition produced negative output:\t");
        // Ex. -9 + 5
        if (left < 0) {
            if (left * -1 > right) {
                s.append(left);
                s.append(" + ");
                s.append(right);

                throw new RuntimeException(s.toString(), null);
            }
        }
        // Ex. 5 + -9
        if (right < 0) {
            if (left < right * -1) {
                s.append(left);
                s.append(" + ");
                s.append(right);

                throw new RuntimeException(s.toString(), null);
            }
        }
        // Ex. -6 + (-7)
        if (left < 0 && right < 0) {
            s.append(left);
            s.append(" + ");
            s.append(right);

            throw new RuntimeException(s.toString(), null);
        }

        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return Integer.toString(left) + " + " + Integer.toString(right);
    }
}
