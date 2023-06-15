import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.printf("%s ", i++);
//        }

        for (int i = 5; i <= 15; i++) {
            System.out.printf("%s ", i);
        }

        System.out.println();

//        int j = 100;
//        do {
//            System.out.println(j);
//            j -= 5;
//        } while (j >= -10);

        for (int j = 100; j >= -10; j -= 5) {
            System.out.println(j);
        }

//        long k = 2;
//        do{
//            System.out.println(k);
//            k *= k;
//        } while (k < 1000000);

        for (long k = 2; k < 1000000; k *= k) {
            System.out.println(k);
        }

        for (int l = 1; l <= 100; l++) {
            if (l % 3 == 0 && l % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (l % 3 == 0) {
                System.out.println("Fizz");
            } else if (l % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(l);
            }
        }

        Scanner scanner = new Scanner(System.in);




        boolean cont;


        do {
            System.out.println("How long do you want your Table?");

            int input = scanner.nextInt();
            System.out.println("Number|Squared|Cubed");
            System.out.println("------|-------|------");

            for (long m = 1; m <= input; m++) {
                System.out.printf("%s \t  | %s \t  | %s %n", m, (int)Math.pow(m, 2), (int)Math.pow(m, 3));
            }
            System.out.println("Continue? [y/n] ");
            String userInput = scanner.next();
            cont = userInput.equalsIgnoreCase("y");
        } while (cont);


        boolean contGrade;

        do {
            System.out.println("Enter numerical grade: ");
            int numGrade = scanner.nextInt();

            if (numGrade >= 88) {
                System.out.println('A');
            } else if (numGrade >= 80) {
                System.out.println('B');
            } else if (numGrade >= 67) {
                System.out.println('C');
            } else if (numGrade >= 60) {
                System.out.println('D');
            } else {
                System.out.println('F');
            }

            System.out.println("Continue? [y/n] ");
            String userGrade = scanner.next();
            contGrade = userGrade.equalsIgnoreCase("y");

        } while(contGrade);
    }
}
