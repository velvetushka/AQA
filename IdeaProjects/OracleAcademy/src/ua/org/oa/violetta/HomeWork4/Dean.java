package ua.org.oa.violetta.HomeWork4;

public class Dean extends Teacher {
    private String faculty;



    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Dean(String name, int age, String academicDegree, String subject,  String faculty) {
        super(name, age, academicDegree, subject);
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return getName() + " is a dean of " + getFaculty() + " faculty";

    }
}
