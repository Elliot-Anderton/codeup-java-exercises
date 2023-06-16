import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int random = getRandom(100, 1);

        int thisGuess;

        do {
            System.out.println("Guess The Number");
            thisGuess = scan.nextInt();

            if (thisGuess < random) {
                System.out.println("Higher");
            } else if (thisGuess > random) {
                System.out.println("Lower");
            } else {
                System.out.println("Good guess");
            }
        } while (thisGuess != random);
    }

    public static int getRandom(int max, int min) {
        return (int)Math.floor(Math.random() * (max - min + 1) + 1);
    }
}
