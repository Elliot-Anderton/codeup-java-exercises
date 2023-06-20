package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String userResponse = scanner.next();

        boolean isTrue;

        isTrue = userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("yes");

        return isTrue;
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);

        String userResponse = scanner.next();
        boolean isTrue;

        isTrue = userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("yes");

        return isTrue;
    }

    public int getInt(int min, int max) {
        System.out.printf("Please enter a number between %s and %s %n", min, max);
        int userNum = scanner.nextInt();

        if (userNum < min || userNum > max) {
            userNum = getInt(min, max);
        }

        return userNum;
    }

    public int getInt() {
        System.out.println("Please enter a number");

        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        System.out.printf("Please enter a number between %s and %s %n", min, max);
        double userNum = scanner.nextDouble();

        if (userNum < min || userNum > max) {
            userNum = getDouble(min, max);
        }

        return userNum;
    }

    public double getDouble() {
        System.out.println("Please enter a number");

        return scanner.nextDouble();
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);

        return scanner.nextDouble();
    }
}
