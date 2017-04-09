package Hello;

import static java.lang.Math.*;

public class HelloWorld {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int c = 25;

        System.out.println("Hello World");
        System.out.println(sqr(10));
        System.out.println(distance(50, 65, 200, 3));
        System.out.println(sqrt(2,10,4));
        // System.out.println("x1 = "+x1, "x2 = " + x2);
        System.out.println(fourthTask(-5));
        System.out.println(fifthTask(2, 10, 5));
        //System.out.println(sixthTask(15));
        System.out.println((a > 2) && (b <= 3));
        System.out.println((b > a) && (b < c));
        //System.out.println(ninthTask(5, 2, 2, 2));
        System.out.println(tenthTask());
        System.out.println(eleventhTask());


    }


    public static int sqr(int a) {
        return a * a;
    }

    public static int distance(int x, int y, int s, int t) {

        return Math.abs(s - t * (x + y));
    }

    public static double sqrt(double a, double b, double c) {
    double d = Math.sqrt( b * b - 4 * a * c);
        double x1 =  (-b + d) / (2 * a);
        return x1;
        //double x2 = (-b - d) / (2 * a);
        //return x2;


    }

    public static int fourthTask(int a) {
        if (a > 0) {
            a++;
        } else if (a < 0) {
            a -= 2;
        } else {
            a = 10;
        }
        return a;
    }

    public static int fifthTask(int a, int b, int c) {
        int sum;
        int min = Math.min(Math.min(a, b), c);
        if (min == a) {
            sum = b + c;
        } else if (min == b) {
            sum = a + c;
        } else
            sum = a + b;
        return sum;


    }

    /*public static int  sixthTask(){
        int number = 45
        switch (number)
        case number == 0:{
            System.out.println("Нулевое число");
            break;
        }
        case
                System.out.println("Положительное четное число")
        System.out.println("Положительное нечетное число")
        System.out.println("Отрицательное четное число")
        System.out.println("Отрицательно нечетное число")
    }*/
    /*public static int ninthTask(int a, int b, int c, int d) {
        int number;
        if (a == b && b == c) {
            number = 3;

        }else if (a == b && b == d) {
            number = 2;


        } else if (a == c && c == d) {
            number = 1;

        } else
            number = 0;

        System.out.println("Порядковый номер числа, отличного от остальных: " + number);

    }*/
    public static int tenthTask() {
        int k = 10;
        switch (k) {
            case 1:
                System.out.println("плохо");
                break;
            case 2:
                System.out.println("неудовлетворительно");
                break;
            case 3:
                System.out.println("удовлетворительно");
                break;
            case 4:
                System.out.println("хорошо");
                break;
            case 5:
                System.out.println("отлично");
                break;

        } if ((k<1)||(k>5)) {
            System.out.println("ошибка");
        }
        return k;
    }

    public static int eleventhTask() {
        int m = 5;
        switch (m) {
            case 1:
            case 2:
            case 12:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
        }
        return m;
    }


}







