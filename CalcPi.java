// Computes an approximation of PI.
public class CalcPi {

    public static void main(String[] args) {
        int decimalFigures = Integer.parseInt(args[0]);
        double piApproximation = 0.0;

        for (int i = 0; i < decimalFigures; i++) {
            if (i % 2 == 0) {
                piApproximation += 1.0 / (2 * i + 1);
            } else {
                piApproximation -= 1.0 / (2 * i + 1);
            }
        }

        piApproximation *= 4;

        String realPiLabel = "pi according to Java:";
        String approxPiLabel = "pi, approximated:";
        int padding = realPiLabel.length() - approxPiLabel.length();
        String spaces = " ".repeat(Math.max(0, padding));

        System.out.printf("%s %.16f%n", realPiLabel, Math.PI);
        System.out.printf("%s%s %.16f%n", approxPiLabel, spaces, piApproximation);
    }
}
