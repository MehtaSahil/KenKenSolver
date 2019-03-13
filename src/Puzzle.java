
import java.util.List;
import java.util.ArrayList;

class Puzzle {

    // ==================== Fields ====================
    // Side length of the puzzle (e.g. 4)
    private int dimension;

    // Maps location to the cage that owns the location
    private Cage[][] cageMap;
    private Square[][] puzzle;
    private List<Cage> cages;

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
        cages = new ArrayList<Cage>();

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

}
