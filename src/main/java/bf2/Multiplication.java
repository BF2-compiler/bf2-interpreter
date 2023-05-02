package bf2;

public class Multiplication extends Expression {
    int left;
    int right;
    
    public Multiplication(int left, int right) throws RuntimeException {

        if (left < 0 ^ right < 0) {
            StringBuilder s = new StringBuilder("Multiplication produced negative output:\t");
            s.append(left);
            s.append(" * ");
            s.append(right);

            throw new RuntimeException(s.toString(), null);
        }

        this.left = left;
        this.right = right;
    }

    @Override    
    public String toString() {
        return Integer.toString(left) + " * " + Integer.toString(right);
    }
}
