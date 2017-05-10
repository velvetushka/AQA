package ua.org.oa.violetta.HomeWork4;

import java.util.ArrayList;

public class Student extends Human {
    private static final int AMOUNT_OF_MARKS = 5;
    private String group;
    private int mark1;
    private int mark2;
    private int mark3;
    private int mark4;
    private int mark5;
    private double rating;



    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getMark1() {
        return mark1;
    }

    public void setMark1(int mark1) {
        this.mark1 = mark1;
    }

    public int getMark2() {
        return mark2;
    }

    public void setMark2(int mark2) {
        this.mark2 = mark2;
    }

    public int getMark3() {
        return mark3;
    }

    public void setMark3(int mark3) {
        this.mark3 = mark3;
    }

    public int getMark4() {
        return mark4;
    }

    public void setMark4(int mark4) {
        this.mark4 = mark4;
    }

    public int getMark5() {
        return mark5;
    }

    public void setMark5(int mark5) {
        this.mark5 = mark5;
    }

    public void setRating() {
        this.rating = rating;
    }

    public double getRating() {
        rating = (double)(getMark1() + getMark2() + getMark3() + getMark4() + getMark5())/AMOUNT_OF_MARKS;
        return rating;

    }
    public Student(String name, int age, String group, int mark1, int mark2, int mark3, int mark4, int mark5) {
        super(name,age);
        this.group = group;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
        this.mark5 = mark5;
        this.rating = getRating();

    }
    public static ArrayList<Student> getStudentOfOneGroup(ArrayList<Student> students, String group) {
        ArrayList<Student> studentsArray = new ArrayList<>();
        for (Student student : students) {
            if (student.getGroup().equals(group)){
                studentsArray.add(student);
            }

        }return studentsArray;
    }
    public  static ArrayList<Student> getStudentsAccordingTheRating(ArrayList<Student> students, double from, double to){
        ArrayList<Student> raitedStudentsArray = new ArrayList<>();
        for (Student student : students) {
            if (student.getRating() >= from && student.getRating() <= to) {
                raitedStudentsArray.add(student);
            }
        }
        return raitedStudentsArray;
    }


    @Override
    public String toString() {
        return "Student " + getName() + " studies in group " + getGroup() + " and has rating " + getRating();

    }
}
