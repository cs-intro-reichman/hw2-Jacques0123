public class TestRandom {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        
        
        int greaterOccurences = 0;
        int lessOccurences = 0;

        
        for (int i = 0; i < N; i++) {
            double randomValue = Math.random();
            if (randomValue > 0.5) {
                greaterOccurences++;
            } else {
                lessOccurences++;
            }
        }

        
        System.out.println("> 0.5: " + greaterOccurences + " times");
        System.out.println("<= 0.5: " + lessOccurences + " times");

        
        if (lessOccurences == 0) {
            System.out.println("Ratio: Cannot compute (division by zero).");
        } else {
            double ratio = (double) greaterOccurences / lessOccurences;
            System.out.println("Ratio: " + ratio);
        }
    }
}
