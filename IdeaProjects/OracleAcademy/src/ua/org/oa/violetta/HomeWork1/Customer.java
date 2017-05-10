package ua.org.oa.violetta.HomeWork1;

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
