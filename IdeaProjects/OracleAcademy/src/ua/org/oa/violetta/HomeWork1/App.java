package ua.org.oa.violetta.HomeWork1;

public class App {

    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.name = "Ivan";
        customer1.age = 30;
        customer1.email = "dsff@deudhe.ru";
        customer1.password = "123";
        customer1.order = Customer.sumOrder(25, 2);
        System.out.println("Customer name is " + customer1.name + " and age is " + customer1.age);
        System.out.println("He ordered the products for " + customer1.order + " usd");
        System.out.println(customer1);

        Customer customer2 = new Customer();
        customer2.name = "Anya";
        customer2.age = 20;
        customer2.email = "ehfgh@ejhf.rw";
        customer2.password = "46dwsd";
        System.out.println(customer2);
        System.out.println();
    }






}
