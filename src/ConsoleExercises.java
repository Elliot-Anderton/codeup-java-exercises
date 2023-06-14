import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %s %n", pi);

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

//        System.out.println("Enter an int: ");
//        int userInt = scanner.nextInt();
//        System.out.println(userInt);

//        System.out.println("Enter three words: ");
//        String firstWord = scanner.next();
//        String secondWord = scanner.next();
//        String thirdWord = scanner.next();
//
//        System.out.printf("You entered: %n %s, %n %s, %n %s %n", firstWord, secondWord, thirdWord);

//        System.out.println("Enter a sentence: ");
//
//        String firstSentence = scanner.nextLine();
//
//        System.out.printf("Your sentence was: %n %s", firstSentence);

        System.out.println("Enter length, width and height: ");
        float length = scanner.nextFloat();
        float width = scanner.nextFloat();
        float height = scanner.nextFloat();

        System.out.printf("The perimeter is: %s %n", (length * 2) + (width * 2));
        System.out.printf("The area is: %s %n", length * width);
        System.out.printf("The volume is: %s %n", length * width * height);
    }
}
