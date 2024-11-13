// Computes an approximation of PI.
public class CalcPi {

    public static void main(String[] args) {
        int decimalFigures = Integer.parseInt(args[0]);
        double piApproximation = 0.0;

        // Compute PI using the Leibniz series
        for (int i = 0; i < decimalFigures; i++) {
            if (i % 2 == 0) {
                piApproximation += 1.0 / (2 * i + 1);
            } else {
                piApproximation -= 1.0 / (2 * i + 1);
            }
        }

        piApproximation *= 4;

        // Explicit rounding to 15 decimal places to avoid floating-point issues
        piApproximation = Math.round(piApproximation * 1e16) / 1e16;

        // Labels
        String realPiLabel = "pi according to Java:";
        String approxPiLabel = "pi, approximated:";

        // Compute padding for alignment
        int padding = realPiLabel.length() - approxPiLabel.length();
        String spaces = " ".repeat(Math.max(0, padding));

        // Print results with exact formatting
        System.out.printf("%s %.15f%n", realPiLabel, Math.PI);
        System.out.printf("%s%s %.15f%n", approxPiLabel, spaces, piApproximation);
    }
}
