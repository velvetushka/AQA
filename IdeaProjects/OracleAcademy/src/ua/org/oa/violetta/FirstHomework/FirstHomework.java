package ua.org.oa.violetta.FirstHomework;

public class FirstHomework {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int c = 25;

        System.out.println("ua.org.oa.org.violetta.FirstHomework.FirstHomework World");
        System.out.println(sqr(10));
        System.out.println(distance(50, 65, 200, 3));
        sqrt(2,10,4);
        System.out.println(fourthTask(-5));
        System.out.println(fifthTask(2, 10, 5));
        sixthTask(15);
        System.out.println((a > 2) && (b <= 3));
        System.out.println((b > a) && (b < c));
        System.out.println(ninthTask(5, 2, 2, 2));
        System.out.println(tenthTask());
        System.out.println(eleventhTask());
        twelfthTask(2,5,4);
        thirteenthTask(5,9);
        fourteenthTask(4, 8);
        fifteenthTask(5);
        System.out.println(sixteenth(13, 4));
        seventeenthTask(10);
    }


    public static int sqr(int a) {
        return a * a;
    }

    public static int distance(int x, int y, int s, int t) {

        return Math.abs(s - t * (x + y));
    }

    public static void sqrt(float a, float b, float c) {
    double d = Math.sqrt( b * b - 4 * a * c);
        float x1 = (float) (-b + d) / (2 * a);

        float x2 = (float)(-b - d) / (2 * a);

        System.out.println("x1= " + x1 +", " + "x2 = " + x2);
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

    public static void  sixthTask(int number){

          if (number == 0) {
              System.out.println("Нулевое число");

          } else if (number>0 && number%2 == 0) {

               System.out.println("Положительное четное число");

          } else if (number>0 && number%2 != 0) {

              System.out.println("Положительное нечетное число");

          } else if (number<0 && number%2 == 0) {

              System.out.println("Отрицательное четное число");
          }else
                System.out.println("Отрицательно нечетное число");
        }

    public static int ninthTask(int a, int b, int c, int d) {
        int number;
        if (a == b && b == c) {
            number = 3;

        }else if (a == b && b == d) {
            number = 2;


        } else if (a == c && c == d) {
            number = 1;

        } else {
            number = 0;
        } return number;



    }

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
public static void twelfthTask(int n, int a, int b) {
        switch (n) {
        case 1:
            System.out.println("a+b = " + (a+b));
            break;
        case 2:
            System.out.println("a-b = " + (a-b));
            break;
        case 3:
            System.out.println("a * b = " + (a*b));
            break;
        case 4:
            System.out.println("a / b = " + (a/b));
            break;
    }

}
    public static void thirteenthTask(int a, int b) {
        int counter=0;
        for(int i=a; i<=b; i++) {

            System.out.println(i);
            counter++;
        }
        System.out.println(counter);


    }
    public static void fourteenthTask(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
    public static void fifteenthTask(int n){
        int p=1;
        for (int i = 1; i<=n; i++) {
            p *= i;
        }
        System.out.println(p);
    }
    public static int sixteenth(int a, int b) {
        int c=0;
        for (int i = b; i <= a; i +=b) {
         c =a-i;
        } return c;

    }
    public static void seventeenthTask(int n) {
        int k=1;
        while (3 * k < n) {
            k +=1;
        }
        System.out.println(k);
    }
}







