
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
    }

    private void initializeCageMap(int[][][] cageSquareLocations) {
        
    }

    // ==================== Utilities ====================


}
