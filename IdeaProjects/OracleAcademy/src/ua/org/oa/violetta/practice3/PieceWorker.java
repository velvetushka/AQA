package ua.org.oa.violetta.practice3;

public class PieceWorker extends Employee {
    private int amountOfDetails;
    private double rateForDetail;


    public PieceWorker(String firstName, String lastName, int amountOfDetails, double rateForDetail) {
        super(firstName, lastName);
        this.amountOfDetails = amountOfDetails;
        this.rateForDetail = rateForDetail;

    }

    public int getAmountOfDetails() {
        return amountOfDetails;
    }

    public void setAmountOfDetails(int amountOfDetails) {
        this.amountOfDetails = amountOfDetails;
    }

    public double getRateForDetail() {
        return rateForDetail;
    }

    public void setRateForDetail(double rateForDetail) {
        this.rateForDetail = rateForDetail;
    }

    @Override
    public double calculateSalary() {
        double monthSalary;
        monthSalary = getAmountOfDetails() * getRateForDetail();
        return monthSalary;
    }
}
