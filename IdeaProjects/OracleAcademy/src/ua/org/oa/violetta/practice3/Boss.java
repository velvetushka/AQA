package ua.org.oa.violetta.practice3;
public class Boss extends Employee {
    private double weekSalary;
    public final int  AMOUNT_OF_WEEKS = 4;

    public Boss(String firstName, String lastName,  double weekSalary) {
        super(firstName, lastName);
        this.weekSalary = weekSalary;

    }

    public double getWeekSalary() {
        return weekSalary;
    }

    public void setWeekSalary(double weekSalary) {
        this.weekSalary = weekSalary;
    }

    @Override
    public double calculateSalary() {
        double monthSalary;
        monthSalary = getWeekSalary() * AMOUNT_OF_WEEKS;
        return monthSalary;
    }
}
