package ua.org.oa.violetta.HomeWork2;

public class Group {
    private String groupName;
    private Student[] students;
    private int CERTAIN_MARK = 4;
    public double avrRating;

    public Group(String groupName, Student[] students) {
        setGroupName(groupName);
        setStudents(students);
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }


    public double calculateAverageRatingOfGroup() {

        double sum = 0;
        double avrRating;
        int counter = 1;
        for (int i = 0; i < students.length; i++) {
            sum += students[i].getRating();
            counter += 1;

        }
        avrRating = sum / counter;
        return avrRating;
    }
    public void printStudentsAccordingToCertainMark() {
        System.out.println("Student have rating less or equal to " + CERTAIN_MARK);
        for (int i = 0; i < students.length; i++) {
            if (students[i].getRating() <= CERTAIN_MARK) {
                students[i].printStudent();
                System.out.println();
            }
        }
        System.out.println("Students have rating higher than " + CERTAIN_MARK);
        for (int i = 0; i < students.length; i++) {
            if (students[i].getRating() > CERTAIN_MARK) {
                students[i].printStudent();
                System.out.println();
            }
        }
    }
    public void printStudentsAccordingToAverageRating() {
        System.out.println("Student have rating less than " + avrRating);
        for (int i = 0; i < students.length; i++) {
            if (students[i].getRating() < avrRating) {
                students[i].printStudent();
                System.out.println();
            }
        }
        System.out.println("Students have rating higher than " + avrRating);
        for (int i = 0; i < students.length; i++) {
            if (students[i].getRating() > avrRating) {
                students[i].printStudent();
                System.out.println();
            }
        }

    }
    public void printGroupList() {
        System.out.println("Group name - " + getGroupName() + ". Students of group: ");
        for (Student stud : students) {
            stud.printStudent();
            System.out.println();
        }
    }
    public Student[] sortStudents(Student[] students) {
        for (int j = students.length -1; j>=0; j--) {
            for (int i = 0; i < j; i++) {
                if (students[i].getRating() > students[i + 1].getRating()) {
                    Student tmp = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = tmp;

                }
            }
        }
        return students;
    }
}
