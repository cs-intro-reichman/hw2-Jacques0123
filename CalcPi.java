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

        
        System.out.printf("%s %.15f%n", realPiLabel, Math.PI); 
        System.out.printf("%s %.15f%n", approxPiLabel, piApproximation); 
    }
}
