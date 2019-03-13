
import java.util.List;
import java.util.Set;
import java.util.HashSet;

class Puzzle {

    // ==================== Fields ====================
    // Side length of the puzzle (e.g. 4)
    private int dimension;

    // Maps location to the cage that owns the location
    private Cage[][] cageMap;
    private Square[][] puzzle;
    private Set<Cage> cages;

    // ==================== Constructors ====================
    // cageSquareLocations is {{x1, y1}, {x2, y2}, ...}
    public Puzzle(
        int dimension,
        int[][][] cageSquareLocations,
        List<Integer> cageTargets,
        List<Operation> cageOperations
    ) {
        this.dimension = dimension;
        cageMap = new Cage[dimension][dimension];
        puzzle = new Square[dimension][dimension];
        cages = new HashSet<Cage>();

        // Build list of cages
        for (int cage = 0; cage < cageSquareLocations.length; cage++) {

            // Create new cage
            Cage newCage = new Cage(cageTargets.get(cage), cageOperations.get(cage));

            // All squares for this particular cage
            for (int sq = 0; sq < cageSquareLocations[cage].length; sq++) {
                int row = cageSquareLocations[cage][sq][0];
                int col = cageSquareLocations[cage][sq][1];

                Square newSquare = new Square(row, col);
                puzzle[row][col] = newSquare;

                newCage.addSquare(newSquare);
            }

            // Add new cage to list of cages
            cages.add(newCage);
        }
    }

    // ==================== Utilities ====================
    public void setValue(int row, int col, int newValue) {
        puzzle[row][col].setValue(newValue);
    }

    public void clearValue(int row, int col) {
        puzzle[row][col].clearValue();
    }

    // returns false if there exist violations, true otherwise
    public boolean isValid() {
        // Check rows/cols
        for (int r = 0; r < dimension; r++) {
            for (int c = 0; c < dimension; c++) {
                int currVal = puzzle[r][c].getValue();

                // If any value is not unique in its row AND column
                if (!isUniqueInRowAndCol(r, c, currVal)) {
                    return false;
                }
            }
        }

        // Check cages
        for (Cage c : cages) {

            // If any cage is not satisfied
            if (!c.isValid()) {
                return false;
            }
        }

        return true;
    }

    public boolean isUniqueInRowAndCol(int row, int col, int value) {
        return isUniqueInRow(row, value) && isUniqueInCol(col, value);
    }

    public boolean isUniqueInRow(int row, int value) {
        int occurrences = 0;
        for (int c = 0; c < dimension; c++) {
            int currentValue = puzzle[row][c].getValue();
            if (currentValue == value) {
                occurrences += 1;
            }
        }

        return (occurrences == 1);
    }

    public boolean isUniqueInCol(int col, int value) {
        int occurrences = 0;
        for (int r = 0; r < dimension; r++) {
            int currentValue = puzzle[r][col].getValue();
            if (currentValue == value) {
                occurrences += 1;
            }
        }

        return (occurrences == 1);
    }
}
