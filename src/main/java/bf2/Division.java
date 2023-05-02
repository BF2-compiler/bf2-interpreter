package bf2;


public class Division extends Expression {
    int left;
    int right;

    public Division(int left, int right) throws RuntimeException {

        if (right == 0) {
            StringBuilder s = new StringBuilder("Division by 0 occured:\t");
            s.append(left);
            s.append(" / ");
            s.append(right);

            throw new RuntimeException(s.toString(), null);
        }
        
        this.left = left;
        this.right = right;
    }

    @Override 
    public String toString() {
        return Integer.toString(left) + " / " + Integer.toString(right);
    }
}
