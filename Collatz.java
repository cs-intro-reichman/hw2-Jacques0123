// Demonstrates the Collatz conjecture.
public class Collatz {

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        String mode = args[1];
        boolean verbose = mode.equals("v");

        for (int seed = 1; seed <= N; seed++) {
            int current = seed;
            int steps = 1;
            StringBuilder sequence = new StringBuilder();
            sequence.append(seed);

            if (seed == 1) {
                sequence.append(" 4 2 1");
                steps = 4;
            } else {
                while (current != 1) {
                    if (current % 2 == 0) {
                        current /= 2;
                    } else {
                        current = 3 * current + 1;
                    }
                    sequence.append(" ").append(current);
                    steps++;
                }
            }

            if (verbose) {
                System.out.println(sequence + " (" + steps + ")");
            }
        }

        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
    }
}
