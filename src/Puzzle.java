
import java.util.List;

class Puzzle {

    // ==================== Fields ====================
    // Side length of the puzzle (e.g. 4)
    private int dimension;

    // Maps location to the cage that owns the location
    private Cage[][] cageMap;

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

        // Initialize cageMap
        // All given cages
        for (int cage = 0; cage < cageSquareLocations.length; cage++) {

            // Create new cage
            Cage newCage = new Cage(cageTargets.get(cage), cageOperations.get(cage));

            // All squares for this particular cage
            for (int sq = 0; sq < cageSquareLocations[cage].length; sq++) {
                int row = cageSquareLocations[cage][sq][0];
                int col = cageSquareLocations[cage][sq][1];

                newCage.addSquare(row, col);
                cageMap[row][col] = newCage;
            }
        }
    }

    // ==================== Utilities ====================


}
