package ua.org.oa.violetta.HomeWork4;

public class Human {
    private static final int MIN_AGE = 0;
    private static final int MAX_AGE = 100;
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= MIN_AGE && age <= MAX_AGE) {
            this.age = age;
        } else {
            System.out.println("Age is not correct. Age should be from " + MIN_AGE + " to " + MAX_AGE);
        }
    }

}
