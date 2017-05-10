package ua.org.oa.violetta.HomeWork4;
import java.util.ArrayList;


public class UnivetsityUtilTest {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Vasya", 20, "A", 5,4,4,5,4));
        students.add(new Student("Kolya", 19, "B", 3,3,4,4,4));
        students.add(new Student("Vova", 20, "A", 4,4,5,5,4));
        students.add(new Student("Vova", 20, "A", 4,4,5,4,4));
        students.add(new Student("Vova", 20, "A", 4,4,5,5,4));
        students.add(new Student("Vova", 20, "A", 4,4,3,5,4));
        students.add(new Student("Andrey", 20, "A", 4,3,4,4,4));
        students.add(new Student("Evgen", 20, "B", 3,3,4,3,4));
        students.add(new Student("Pasha", 20, "A", 5,5,3,4,4));
        students.add(new Student("Lena", 21, "B", 4,3,5,5,4));
        students.add(new Student("Yulya", 20, "A", 5,5,5,5,4));

        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Ivan Petrovich", 36,"assistant", "Math"));
        teachers.add(new Teacher("Petr Ivanovich", 80, "professor", "Economy"));
        teachers.add(new Teacher("Alla Petrovna", 38, "docent", "Literature"));
        teachers.add(new Teacher("Ignat Ivanovich",53, "docent", "philosophy"));
        teachers.add(new Teacher("James Miller", 40, "docent", "English"));

        Dean dean = new Dean("Ivan Ivanovich", 63,"professor",
                "Engineering Electrophysics", "Physics and Technology");

        System.out.println("There is a list of the students from group 'A'");
        ArrayList<Student> A = Student.getStudentOfOneGroup(students,"A");
        for(Student student : A)
            System.out.println(student);

        System.out.println();

        System.out.println("There is a list of the students from group 'B'");
        ArrayList<Student> B = Student.getStudentOfOneGroup(students,"B");
        for(Student student : B) {
            System.out.println(student);
        }
        System.out.println();

        System.out.println("There are students that have rating from 4 to 5");
        ArrayList<Student> goodMark = Student.getStudentsAccordingTheRating(students, 4,5);
        for(Student student : goodMark){
            System.out.println(student);
        }

        System.out.println();

        System.out.println("There is a list of docents");
        ArrayList<Teacher> docent = Teacher.getDocents(teachers);
        for(Teacher teacher : docent) {
            System.out.println(teacher);
        }

        System.out.println();

        System.out.println(dean);
    }
}
