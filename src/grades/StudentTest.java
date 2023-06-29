package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("john");
        Student student2 = new Student("john");

        student1.addGrade(89.3);
        student1.addGrade(92.5);

        System.out.println("student1.getGradeAverage() = " + student1.getGradeAverage());

        student2.addGrade(39.8);
        student2.addGrade(52.9);

        System.out.println("student2.getGradeAverage() = " + student2.getGradeAverage());
    }
}
