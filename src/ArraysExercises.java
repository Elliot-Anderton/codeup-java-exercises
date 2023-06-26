import java.util.Arrays;

public class ArraysExercises {

    public static String[] addperson(String[] person, String newperson ) {
        String personArray[];
        personArray = new String[person.length + 1];
        System.arraycopy(person, 0, personArray, 0, person.length);
        personArray[person.length] = newperson;
        return personArray;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        String[] person;
        person = new String[3];
        person[0] = "bob";
        person[1] = "billy";
        person[2] = "jane";

        for (String name : person) {
            System.out.println(name);
        }


    }
}
