package ua.org.oa.violetta.practice3;

public class CommissionWorker extends  Employee {
    private double normalSalary;
    private double sales;
    private double commissionRate;

    public CommissionWorker(String firstName, String lastName, double normalSalary, double sales, double commissionRate) {
        super(firstName, lastName);
        this.normalSalary = normalSalary;
        this.sales = sales;
        this.commissionRate = commissionRate;

    }

    public double getNormalSalary() {
        return normalSalary;
    }

    public void setNormalSalary(double normalSalary) {
        this.normalSalary = normalSalary;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public double calculateSalary() {
        double monthSalary;
        monthSalary = getNormalSalary() + getSales()*getCommissionRate();

        return monthSalary;
    }
}
