package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String userResponse = scanner.next();

        return userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("yes");
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);

        String userResponse = scanner.next();

        return userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        System.out.printf("Please enter an integer between %s and %s %n", min, max);
        int userNum = scanner.nextInt();

        if (userNum < min || userNum > max) {
            userNum = getInt(min, max);
        }

        return userNum;
    }

    public int getInt() {
        return scanner.nextInt();
    }

    public int getInt(String prompt) {
        System.out.println(prompt);

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
        return scanner.nextDouble();
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);

        return scanner.nextDouble();
    }
}
