package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input () {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public String getString(String prompt) {
        System.out.println(prompt);

        return scanner.nextLine();
    }

    public boolean yesNo() {
        String userResponse = scanner.next();

        return userResponse.equalsIgnoreCase("y") ||
                userResponse.equalsIgnoreCase("yes");
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);

        String userResponse = scanner.next();

        return userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {

        System.out.printf("Please enter an integer between %s and %s %n", min, max);

        int userNum = getInt();

        if (userNum < min || userNum > max) {
            userNum = getInt(min, max);
        }

        return userNum;
    }

    public int getInt() {
        int userNum = 0;

        try {
            userNum = Integer.valueOf(getString());
        } catch (NumberFormatException e) {
            System.out.println("Not a valid Integer");
            userNum = getInt();
        }

        return userNum;
    }

    public int getInt(String prompt) {
        System.out.println(prompt);

        return getInt();
    }

    public double getDouble(double min, double max) {
        System.out.printf("Please enter a number between %s and %s %n", min, max);

        double userNum = getDouble();

        if (userNum < min || userNum > max) {
            userNum = getDouble(min, max);
        }

        return userNum;
    }

    public double getDouble() {
        double userNum = 0;

        try {
            userNum = Double.valueOf(getString());
        } catch (NumberFormatException e) {
            System.out.println("Not a valid Double");
            userNum = getDouble();
        }

        return userNum;
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);

        return getDouble();
    }
}
