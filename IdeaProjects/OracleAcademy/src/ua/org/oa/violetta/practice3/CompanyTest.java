package ua.org.oa.violetta.practice3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CompanyTest {
    public static void main(String[] args) {


        Company firm = new Company();
        Employee boss = new Boss("Ivan", "Petrov", 200);
        Employee commissionWorker = new CommissionWorker("Petya", "Ivanov", 300.0, 2000.0, 0.05);
        Employee hourlyWorker = new HourlyWorker("Marta","Ivanova", 200, 210, 1.3, 1.8);
        Employee pieceWorker = new PieceWorker("Victor", "Virorov", 300, 2);

        firm.addEmployee(boss);
        firm.addEmployee(commissionWorker);
        firm.addEmployee(hourlyWorker);
        firm.addEmployee(pieceWorker);


        firm.calculateTotalSalary();
        System.out.println(firm);







    }
}
