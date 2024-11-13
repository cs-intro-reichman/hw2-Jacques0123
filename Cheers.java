
public class Cheers {

    public static void main(String[] args) {
        String cheer = args[0];
        int times = Integer.parseInt(args[1]);

        cheer = cheer.toUpperCase();

        String vowels = "AEFHILMNORSX";

        for (int i = 0; i < cheer.length(); i++) {
            char letter = cheer.charAt(i);

            if (vowels.indexOf(letter) != -1) {
                System.out.println("Give me an " + letter + ": " + letter + "!");
            } else {
                System.out.println("Give me a " + letter + ": " + letter + "!");
            }
        }

        System.out.println("What does that spell?");

        for (int i = 0; i < times; i++) {
            System.out.println(cheer + "!!!");
        }
    }
}
