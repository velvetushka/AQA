package ua.org.oa.violetta.HomeWork4;

import java.util.ArrayList;

public class Teacher extends Human {
    private String academicDegree;
    private String subject;

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher(String name, int age, String academicDegree, String subject) {
        super(name, age);
        this.academicDegree = academicDegree;
        this.subject = subject;
    }

    public static ArrayList<Teacher> getDocents(ArrayList<Teacher> teachers) {
        ArrayList<Teacher>  docentArray = new ArrayList<>();
        for (Teacher teacher : teachers)
            if (teacher.getAcademicDegree().equals("docent")){
                docentArray.add(teacher);
            }
        return docentArray;
    }

    @Override
    public String toString() {
        return "Name " + getName() + ", age " + getAge() +
                " academic degree is " + academicDegree +
                ", subject - " + subject;
    }
}
