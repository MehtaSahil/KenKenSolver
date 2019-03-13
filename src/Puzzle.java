
class Puzzle {

    // ==================== Fields ====================
    private int dimension;

    // ==================== Constructors ====================
    // cageSquareLocations is {{x1, y1}, {x2, y2}, ...}
    public Puzzle(
        int dimension,
        List<int[][]> cageSquareLocations,
        List<Integer> cageTargets,
        List<Operation> cageOperations,
    ) {
        this.dimension = dimension;
    }

}
