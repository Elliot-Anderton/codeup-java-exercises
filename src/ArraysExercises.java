import java.util.Arrays;

public class ArraysExercises {

    private static Person[] addperson(Person[] person, Person newperson ) {
        Person[] personArray = Arrays.copyOf(person,  person.length + 1);
        personArray[person.length] = newperson;
        return personArray;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] person;
        person = new Person[3];
        person[0] = new Person("bob");
        person[1] = new Person("billy");
        person[2] = new Person("jane");

        for (Person name : person) {
            System.out.println(name.getName());
        }

        person = addperson(person, new Person("jim"));

        for (Person name : person) {
            System.out.println(name.getName());
        }
    }
}
