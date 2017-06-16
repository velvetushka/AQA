package Task1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        // 1. Приветствовать любого пользователя при вводе его имени через командную строку.
//        // input  your name into field  "Program arguments" in Run/Debug configuration window
//        for (int i = 0; i < args.length; i++) {
//            System.out.println("Hello, " + args[i]);
//        }
//
//        // 2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
//        for (int i = args.length - 1; i >= 0; i--) {
//            System.out.println(args[i]);
//
//        }
//        // 3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
//        int amount = 5;
//        for (int i = 0; i <= amount; i++) {
//            System.out.print("i = " + Math.random());
//        }
//        System.out.println(" ");
//        for (int i = 0; i <= amount; i++) {
//            System.out.println(" i = " + Math.random());
//        }
//        // 4. Ввести пароль из командной строки и сравнить его со строкой-образцом.
//        {
//            String sample = "password";
//            System.out.println(Arrays.toString(sample.split("\\s")).equals(Arrays.toString(args)));
//        }
//        // 5. Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести
//        // результат на консоль.
//        {
//            int sum = 0;
//            int multiplication = 1;
//            for (int i = 0; i < args.length; i++) {
//                sum += Integer.parseInt(args[i]);
//                multiplication *= Integer.parseInt(args[i]);
//            }
//            System.out.println("sum = " + sum);
//            System.out.println("multiplication = " + multiplication);
//        }
        // 6. Ввести с консоли n целых чисел.
        System.out.println("How much numbers do you want input?");
        Scanner scanCount = new Scanner(System.in);
        int n = Integer.parseInt(scanCount.next());
        System.out.println("Input " + n + " integers");
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(scan.next());
        }
        System.out.println(Arrays.toString(nums));

//        findEvenNumbers(nums);
//        findOddNumbers(nums);
//        findMinAndMax(nums);
//        findNumsDividedbyNineAndThree(nums);
//        findNumsDividedbySevenAndFive(nums);
//        findNumsWithoutSTheSameDigits(nums);
//        findLuckyNumbers(nums);
        findElementEqualsHalfSumOfNeighbors(nums);
    }

    // 6.1. Четные и нечетные числа.
    public static void findEvenNumbers(int[] nums) {
        System.out.println("Even numbers:");
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] % 2 == 0) {
                System.out.println(nums[i]);
            }
        }
    }

    public static void findOddNumbers(int[] nums) {
        System.out.println("Odd numbers:");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                System.out.println(nums[i]);
            }
        }
    }

    // 6.2. Наибольшее и наименьшее число.
    public static void findMinAndMax(int[] nums) {
        int i = 0;
        int max = nums[i];
        int min = nums[i];
        for (i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] > nums[i]) {
                max = nums[i + 1];
                if (nums[i + 1] < nums[i])
                    min = nums[i + 1];
            }

        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }

    // 6.3. Числа, которые делятся на 3 или на 9.
    public static void findNumsDividedbyNineAndThree(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 9 == 0) {
                System.out.println(nums[i] + " can be divided by 3 and 9");
            }
            if ((nums[i] % 3 == 0) && (nums[i] % 9 != 0)) {
                System.out.println(nums[i] + " can be divided by 3");
            }
        }

    }

    //6.4. Числа, которые делятся на 5 и на 7.
    public static void findNumsDividedbySevenAndFive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] % 5 == 0) && (nums[i] % 7 == 0)) {
                System.out.println(nums[i] + " can be divided by 5 and 7");
            }
            if ((nums[i] % 7 == 0) && (nums[i] % 5 != 0)) {
                System.out.println(nums[i] + " can be divided by 7");
            }
            if ((nums[i] % 5 == 0) && (nums[i] % 7 != 0)) {
                System.out.println(nums[i] + " can be divided by 5");
            }
        }
    }

    //6.5. Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
    public static void findNumsWithoutSTheSameDigits(int[] nums) {
        System.out.println("Numbers without repeated digits:");
        String strNumber;
        for (int n : nums) {
            if ((n >= 100 && n <= 999) || (n <= -100 && n >= -999)) {
                strNumber = String.valueOf(n);
                if ((strNumber.charAt(0) != strNumber.charAt(1))
                        && (strNumber.charAt(1) != strNumber.charAt(2))
                        && (strNumber.charAt(0) != strNumber.charAt(2))) {
                    System.out.println(n);
                }

            }

        }

    }

    // 6.6. «Счастливые» числа.
    public static void findLuckyNumbers(int[] nums) {
        System.out.println("Lucky number(s): ");


        int myArraySize = nums.length;
        for (int i = 0; i <= myArraySize - 1; i++) {
            String currentTicketNumber = String.valueOf(nums[i]);
            if (currentTicketNumber.length() % 2 == 0) {
                String substring1 = currentTicketNumber.substring(0, currentTicketNumber.length() / 2);
                String substring2 = currentTicketNumber.substring(currentTicketNumber.length() / 2, currentTicketNumber.length());
                int sum1 = sumOfDigitsInNumber(substring1);
                int sum2 = sumOfDigitsInNumber(substring2);

                if (sum1 == sum2) {
                    System.out.println(currentTicketNumber);
                }
            }
        }
    }

    private static int sumOfDigitsInNumber(String intLikeString) {
        int myNumber = Integer.parseInt(intLikeString);
        int sum = 0;
        while (myNumber != 0) {
            sum += myNumber % 10;
            myNumber /= 10;
        }
        return sum;
    }

    // 6.7. Элементы, которые равны полусумме соседних элементов.
    public static void findElementEqualsHalfSumOfNeighbors(int[] nums) {
        System.out.println("Element equals half sum of Neighbors is ");
        if (nums.length >= 3) {
            for (int i = 1; i < nums.length - 1; i++) {
                if (nums[i] == (nums[i - 1] + nums[i + 1]) / 2) {
                    System.out.println(nums[i]);
                }

            }
        }else{
            System.out.println("You should have more than 3 numbers");
        }
    }
}







