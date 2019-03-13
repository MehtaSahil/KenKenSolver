
import java.util.Set;
import java.util.HashSet;

class Cage {

    // ==================== Fields ====================
    private int numSquares;
    private Set<Square> containedSquares;
    private int target;
    private Operation op;

    // ==================== Constructors ====================
    public Cage(int target, Operation op) {
        containedSquares = new HashSet<Square>();

        this.target = target;
        this.op = op;
    }

    // ==================== Getters and Setters ====================
    public Operation getOperation() {
        return op;
    }

    // ==================== Utilities ====================
    public void addSquare(int row, int col) {
        containedSquares.add(new Square(row, col));
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        s.append(target);
        s.append(":");
        s.append(op);
        s.append("]");

        return s.toString();
    }
}
