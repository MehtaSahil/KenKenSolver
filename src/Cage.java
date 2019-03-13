
import java.util.Set;
import java.util.HashSet;

class Cage {

    // ==================== Fields ====================
    private int numSquares;
    private Set<Square> squares;
    private int target;
    private Operation operation;

    // ==================== Constructors ====================
    public Cage(int target, Operation operation) {
        squares = new HashSet<Square>();

        this.target = target;
        this.operation = operation;
    }

    // ==================== Getters and Setters ====================
    public Operation getOperation() {
        return operation;
    }

    // ==================== Utilities ====================
    public void addSquare(Square square) {
        squares.add(square);
    }

    // Returns false if there is a violation, true otherwise
    public boolean isValid() {

        // If the cage isn't full, we don't know if it's a violation yet
        for (Square s : squares) {
            if (s.isEmpty()) {
                return true;
            }
        }

        // Addition and multiplication are commutative
        if (operation == Operation.ADD) {

        } else if (operation == Operation.MULT) {

        }

        return true;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        s.append(target);
        s.append(":");
        s.append(operation);
        s.append("]");

        return s.toString();
    }
}
