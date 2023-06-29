package grades;

import util.Input;

import java.util.HashMap;
import java.util.Map;


public class GradesApplication {

    public static HashMap<String, Student> students = new HashMap<>();

    public static void runCLI(){
        System.out.print("Here is a list of our students \n|  ");

        for (String student : students.keySet()) {
            System.out.print(student + "  |  ");
        }

        System.out.println();

        CLI2();
    }

    public static void CLI2() {
        Input inp = new Input();
        String check = inp.getString("Which Student would you like information on?");

        if (students.containsKey(check)) {
            System.out.println("  Name: " +
                    students.get(check).getName() +
                    " - github username: " +
                    check +
                    "\n Current average: " +
                    students.get(check).getGradeAverage());
        } else {
            System.out.println(check + " doesn't even go here!");
        }

        boolean cont = inp.yesNo("Would you like to check another Student?");

        if (cont) {
            CLI2();
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("john");
        Student student2 = new Student("jim");
        Student student3 = new Student("becky");

        student1.addGrade(40.3);
        student1.addGrade(96.4);
        student1.addGrade(57.9);

        student2.addGrade(30.4);
        student2.addGrade(64.9);
        student2.addGrade(97.5);

        student3.addGrade(4.3);
        student3.addGrade(46.9);
        student3.addGrade(79.5);

        students.put("johngit", student1);
        students.put("jimgit", student2);
        students.put("beckygit", student3);

        System.out.println("Welcome!");

        runCLI();
    }
}
