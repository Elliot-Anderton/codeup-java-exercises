import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {

        int random = getRandom(100, 1);

        System.out.println(random);

        checker(random);
    }

    public static void checker(int random) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Guess The Number");
        int guess = scan.nextInt();

        if (guess < random) {
            System.out.println("Higher");
            checker(random);
        } else if (guess > random) {
            System.out.println("Lower");
            checker(random);
        } else {
            System.out.println("Good guess");
        }
    }

    public static int getRandom(int max, int min) {
        return (int) Math.floor(Math.random() * (max - min + 1) + 1);
    }
}
