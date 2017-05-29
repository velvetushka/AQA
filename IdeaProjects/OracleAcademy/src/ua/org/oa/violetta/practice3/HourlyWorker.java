package ua.org.oa.violetta.practice3;

public class HourlyWorker extends Employee {
    private int normOfHours;
    private int workedHours;
    private double normalRate;
    private double overRate;


    public HourlyWorker(String firstName, String lastName, int normOfHours, int workedHours, double normalRate, double overRate) {
        super(firstName, lastName);
        this.normOfHours = normOfHours;
        this.workedHours = workedHours;
        this.normalRate = normalRate;
        this.overRate = overRate;

    }

    public int getNormOfHours() {
        return normOfHours;
    }

    public void setNormOfHours(int normOfHours) {
        this.normOfHours = normOfHours;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    public double getNormalRate() {
        return normalRate;
    }

    public void setNormalRate(double normalRate) {
        this.normalRate = normalRate;
    }

    public double getOverRate() {
        return overRate;
    }

    public void setOverRate(double overRate) {
        this.overRate = overRate;
    }

    @Override
    public double calculateSalary() {
        double monthSalary;
        if (getWorkedHours() <= getNormOfHours()) {
             monthSalary = getWorkedHours() * getNormalRate();
        } else {
            monthSalary = (getWorkedHours() - getNormOfHours()) * getOverRate() + getNormOfHours() * getNormalRate();
        }
        return monthSalary;
    }
}