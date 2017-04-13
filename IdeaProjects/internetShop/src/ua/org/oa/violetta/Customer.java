package ua.org.oa.violetta;

import java.util.Date;

public class Customer {
    public String name;
    public int age;
    public String email;
    public String password;
    public double order;




    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", order=" + order +
                '}';
    }

    public static double sumOrder(double productPrice, int productAmount ) {
        double order;
        order = productPrice * productAmount;
        return order;
    }
}
