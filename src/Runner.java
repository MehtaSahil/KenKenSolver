import java.util.List;
import java.util.ArrayList;

class main {
    public static void main(String args[]) {
        int[][][] testPuzzle = {
            {{0, 0}, {0, 1}},
            {{0, 2}, {0, 3}},
            {{1, 0}, {1, 1}},
            {{1, 2}, {2, 2}, {3, 2}},
            {{1, 3}},
            {{2, 0}, {2, 1}, {3, 1}},
            {{2, 3}, {3, 3}},
            {{3, 3}}
        };

        List<Integer> testTargets = new ArrayList<Integer>();
        testTargets.add(2);
        testTargets.add(2);
        testTargets.add(3);
        testTargets.add(9);
        testTargets.add(4);
        testTargets.add(9);
        testTargets.add(2);
        testTargets.add(4);

        List<Operation> testOps = new ArrayList<Operation>();
        testOps.add(Operation.SUB);
        testOps.add(Operation.SUB);
        testOps.add(Operation.ADD);
        testOps.add(Operation.ADD);
        testOps.add(null);
        testOps.add(Operation.MULT);
        testOps.add(Operation.DIV);
        testOps.add(null);

        Puzzle p = new Puzzle(4, testPuzzle, testTargets, testOps);

        System.out.println("Finished initializing puzzle.");
    }
}
