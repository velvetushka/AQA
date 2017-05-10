package ua.org.oa.violetta.HomeWork2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student {
        private static final int MIN_AGE = 0;
        private static final int MAX_AGE = 100;
        private static final double MIN_RATING = 0.0;
        private static final double MAX_RATING = 5.0;
        private String name;
        private String group;
        private int age;
        private double rating;

        public Student(String name, double rating){
            setName(name);
            setGroup(group);
            setAge(age);
            setRating(rating);
        }

        public Student(String name, String group, int age, double rating) {
            setName(name);
            setGroup(group);
            setAge(age);
            setRating(rating);
        }
        public Student (String name, String group, double rating) {
            setName(name);
            setGroup(group);
            setAge(age);
            setRating(rating);

        }

    //method creates object Student from console
        public static Student createStudentConsole() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input student's name");
            String name = br.readLine();
            System.out.println("Input student's group");
            String group = br.readLine();
            System.out.println("Input student's age");
            int age = Integer.parseInt(br.readLine());
            System.out.println("Input student's rating");
            Double rating = Double.parseDouble(br.readLine());
            return new Student(name, group, age, rating);
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getGroup() {
            return group;
        }
        public void setGroup(String group) {
            this.group = group;
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
        public double getRating() {
            return rating;
        }
        public void setRating(double rating) {
            if (rating >= MIN_RATING && rating <= MAX_RATING) {
                this.rating = rating;
            } else {
                System.out.println("Rating is not correct. Rating should be less or equal to 5 ");
            }
        }

    public void printStudent() {
        System.out.println("Student's name: " + getName());
        System.out.println("Student's group: " + getGroup());
        System.out.println("Student's rating: " + getRating());
    }


        @Override
        public String toString() {
            return "Student{" +
                    ", name='" + name + '\'' +
                    ", group='" + group + '\'' +
                    ", age=" + age +
                    ", rating=" + rating +
                    '}';
        }
    }



