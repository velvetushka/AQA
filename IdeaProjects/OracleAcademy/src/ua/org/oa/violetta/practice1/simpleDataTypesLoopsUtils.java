package ua.org.oa.violetta.practice1;

public class simpleDataTypesLoopsUtils {
    public static byte b;
    public static short s;
    public static int a;
    public static long l;


    public static void printSimpleTypes() {
        System.out.println(b);
        System.out.println(s);
        System.out.println(a);
        System.out.println(l);
    }

    public static void printLocalSimpleTypes() {
        byte b1 = 1;
        short s1 = 0;
        int a1 = -586;
        long l1 = 15455878;

        float a = 1.f;
        float b = 1;
        float c = 0x1;
        float d = 0b1;
        float e = 1.0e1f;
        float f = 01;

        short sh1 = 2 + 5;
        short sh2 = (short) (6 + 0.5);
        short sh3 = (short) (a + a1);
        short sh4 = (short) (b1 + s1);
        short sh5 = (short) (b + 1.);

        System.out.println(b1);
        System.out.println(s1);
        System.out.println(a1);
        System.out.println(l1);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(sh1);
        System.out.println(sh2);
        System.out.println(sh3);
        System.out.println(sh4);
        System.out.println(sh5);

    }

    public static int sumUpToTwenty() {
        int sum = 0;
        for (int i = 0; i < 21; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumEvenUpToTwenty() {
        int sum = 0;
        for (int i = 0; i < 21; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int sumPrimeUpToTwenty() {
        int sum = 0;
        m:
        for (int i = 2; i < 21; i++) {
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    continue m;
                }

            }
            sum += i;
        }
        return sum;
    }

    public static boolean sumOfThree() {
        int a = 6;
        int b = 3;
        int c = 8;

        if (a + b == c) {
            return true;
        } else if (b + c == a) {
            return true;
        } else if (c + a == b) {
            return true;
        } else return false;

    }

    public static void averageOfAB() {
            int a = 5;
            int b = 4;
            int sum = a;
            double avr;
            int counter = 1;
       if (a > b && a > 0 && b > 0) {
          for (int i = b; i < a; i++) {
               sum += i;
               counter += 1;

            } avr = (double)sum / counter;
           System.out.println("Average of a and b is " + avr);


        } else {System.out.println("check your numbers");}
    }
          public static void bankCredit() {
        float loan = 5000;
        int interestRate = 20;
        int term = 24;
        double monthInterestRate = (double) interestRate / 12;
        double finalSum = loan + (1 + monthInterestRate / 100) * term;
        double monthPayment = finalSum/term;
        double remainder;
        double sumOfInterest;
        for (int i = 1; i <= term; i++) {
                  remainder = finalSum - i*monthPayment;

                  sumOfInterest = monthInterestRate/100 * loan * i;

                  System.out.println(i + " Month " + " remainder " + remainder   + " Payed interest " + sumOfInterest);

              }



    }
}
