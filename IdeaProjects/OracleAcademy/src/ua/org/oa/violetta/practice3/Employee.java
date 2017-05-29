package ua.org.oa.violetta.practice3;

public abstract class Employee {
    private String firstName;
    private String lastName;


    public abstract double calculateSalary();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }





    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }



    @Override
    public String toString() {
        return " Employee position - " + getClass().getSimpleName()  +
                ", name " + firstName + " " + lastName +
                ", salary "  + calculateSalary()+ "\n";

    }
}