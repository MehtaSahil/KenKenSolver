
import java.util.Set;
import java.util.HashSet;

class Square {

    // ==================== Fields ====================
    // Set of legal options remaining for this square
    private Set<Integer> legalOptions;
    private int value = 0;

    // Row and column are ZERO-INDEXED
    private int row;
    private int col;

    // ==================== Constructors ====================
    public Square(int row, int col) {
        legalOptions = new HashSet<Integer>();
    }

    // ==================== Getters and Setters ====================
    public Set<Integer> getLegalOptions() {
        return legalOptions;
    }

    public void setValue(int newValue) {
        value = newValue;
    }

    public void clearValue() {
        value = 0;
    }

    public boolean isEmpty() {
        return value == 0;
    }

    public int getValue() {
        return value;
    }

    // ==================== Utilities ====================
    public void addLegalOption(int optionToAdd) {
        legalOptions.add(optionToAdd);
    }

    public void removeLegalOption(int optionToRemove) {
        legalOptions.remove(optionToRemove);
    }

}
