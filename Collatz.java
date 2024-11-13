// Demonstrates the Collatz conjecture.
public class Collatz {

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        String mode = args[1];
        boolean verbose = mode.equals("v");

        for (int seed = 1; seed <= N; seed++) {
            int current = seed;
            int steps = 0;

            if (verbose) {
                System.out.print(current); // Start the sequence with the seed
            }

            while (current != 1) {
                if (current % 2 == 0) {
                    current /= 2;
                } else {
                    current = 3 * current + 1;
                }
                steps++;
                if (verbose) {
                    System.out.print(" " + current); // Print each step
                }
            }

            steps += 3; // Add 3 for the implicit "4 2 1" cycle
            if (verbose) {
                System.out.println(" (" + steps + ")"); // Print the steps in parentheses
            }
        }

        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
    }
}
