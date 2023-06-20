import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(addition(12, 12));
        System.out.println(subtraction(12, 13));
        System.out.println(multiplication(12, 12));
        System.out.println(division(144, 12));

        System.out.println(getInt(1, 10));

        factorial();

        rollDice();
    }

    public static long addition(long n1, long n2) {
        return n1 + n2;
    }

    public static long  subtraction(long n1, long n2) {
        return n1 - n2;
    }

    public static long multiplication(long n1, long n2) {
        return n1 * n2;
    }

    public static long division(long n1, long n2) {
        return n1 / n2;
    }

    public static long getInt(long n1, long n2) {
        System.out.printf("Enter a number between %s and %s%n", n1, n2);

        Scanner scan = new Scanner(System.in);
        long userInput = scan.nextLong();

        if (userInput < n1 || userInput > n2) {
            System.out.printf("%s is out of range%n", userInput);
            userInput = getInt(n1, n2);
        }
        return userInput;
    }

    public static void factorial() {
        Scanner scan = new Scanner(System.in);
        String cont;

        do {
            long userInput = getInt(1, 10);

            long product = 1;

            System.out.printf("%s! =", userInput);

            for (int i = 1; i < userInput; i++) {
                product *= i;
                System.out.printf(" %s x", i);
            }

            System.out.printf(" %s", userInput);
            System.out.printf(" = %s%n", product * userInput);

            System.out.println("Continue? [y/n] ");
            cont = scan.next();
        } while (cont.equals("y"));
    }

    public static void rollDice() {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many sided dice?");
        int sides = scan.nextInt();

        System.out.println("Roll the Dice? [y/n] ");
        String roll = scan.next();

        while (roll.equals("y")) {
            System.out.println("Die 1 is: " + getRandom(sides, 1));
            System.out.println("Die 2 is: " + getRandom(sides, 1));

            System.out.println("Roll again? [y/n] ");
            roll = scan.next();
        }
    }

    public static int getRandom(int max, int min) {
        return (int)Math.floor(Math.random() * (max - min + 1) + 1);
    }
}
