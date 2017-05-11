package ua.org.oa.violetta.HomeWork2;


import java.io.IOException;

public class StudentUtilTest {



    public static void main(String[] args) throws IOException {


        Student student0 = Student.createStudentConsole();
        Student student1 = new Student("Ira", "A", 25, 5.0);
        Student student2 = new Student("Evgen", 2.7);
        Student student3 = new Student("Pavel", 4.7);
        Student student4 = new Student("Vasya", "A", 4.3);
        Student student5 = new Student("Victor", "B", 3.0);
        Student student6 = new Student("Valya", "B", 40, 3.7);
        Student student7 = new Student("Pavel",  3.2);
        Student student8 = new Student("Vasil", "A", 4.5);
        Student student9 = new Student("Dunya", "B", 12, 3.2);
        //create students array
        Student [] students = {student0, student1, student2, student3, student4, student5,
                student6, student7, student8, student9};
        Group group = new Group("Mathematics", students);
        group.sortStudents(students);
        System.out.println("---Sorted Students----");
        group.printGroupList();
        group.printStudentsAccordingToCertainMark();
        System.out.println("Average rating of " + group.getGroupName() + " group is " + group.calculateAverageRatingOfGroup());
        group.printStudentsAccordingToAverageRating();

    }

}
