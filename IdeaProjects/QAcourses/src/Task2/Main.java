package Task2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Ввести n чисел с консоли.


            int[] nums;
            System.out.println("How much numbers do you want input?");
            Scanner scanCount = new Scanner(System.in);
            int n = Integer.parseInt(scanCount.next());
            System.out.println("Input " + n + " integers");
            Scanner scan = new Scanner(System.in);
            nums = new int[n];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = Integer.parseInt(scan.next());
            }
            System.out.println(Arrays.toString(nums));


//        findTheLongestAndTheShortestNumber(nums);
//        System.out.println(Arrays.toString(sortAscArray(nums)));
//        System.out.println(Arrays.toString(sortDescArray(nums)));
//        findNumberLongerOrShorterThanAvr(nums);
        findNumberWithMinimunOfDifferentDigits(nums);
    }

    //1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
    public static void findTheLongestAndTheShortestNumber(int[] nums) {
        sortAscArray(nums);
        System.out.println(nums[0] + " is the shortest number in Array. With length - "
                + String.valueOf(nums[0]).length());
        System.out.println(nums[nums.length - 1] + " is the longest number in Array. With length - "
                + String.valueOf(nums[nums.length - 1]).length());
    }

    // 2. Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.
    public static int[] sortAscArray(int[] nums) {
        for (int j = nums.length - 1; j >= 0; j--) {
            for (int i = 0; i < j; i++) {
                if (String.valueOf(nums[i]).length() > String.valueOf(nums[i + 1]).length()) {
                    int tmpNum = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = tmpNum;

                }
            }

        }
        return nums;
    }

    public static int[] sortDescArray(int[] nums) {
        for (int j = nums.length - 1; j >= 0; j--) {
            for (int i = 0; i < j; i++) {
                if (String.valueOf(nums[i]).length() < String.valueOf(nums[i + 1]).length()) {
                    int tmpNum = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = tmpNum;

                }
            }

        }
        return nums;
    }

    //    3. Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.
    public static void findNumberLongerOrShorterThanAvr(int[] nums) {
        for (int n:nums){

            if (String.valueOf(n).length() > calculateAvrLength(nums)) {
                System.out.println(n + " consists of " + String.valueOf(n).length()
                        + " digits and is longer than average length.");
            }
            if (String.valueOf(n).length() < calculateAvrLength(nums)) {
                System.out.println(n + " consists of " + String.valueOf(n).length()
                        + " digits and is shorter than average length.");
            }
        }
    }
    public static int calculateAvrLength(int [] nums){
        int avrLength=0;
        int lengthOfCurrentElement = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            lengthOfCurrentElement = String.valueOf(nums[i]).length();
            sum += lengthOfCurrentElement;

            avrLength = sum / nums.length;
        }
        return avrLength;
    }
 //   4. Найти число, в котором число различных цифр минимально. Если таких чисел несколько, найти первое из них.
public static void findNumberWithMinimunOfDifferentDigits(int[] nums){
        String strNumber;
    int countOfRepeat = 0;
    for (int n:nums) {
        strNumber = String.valueOf(n);
        for (int i = 0; i < strNumber.length()-1; i++) {
            if(strNumber.charAt(i)==strNumber.charAt(i+1)){
                countOfRepeat++;
            }

        }
    }
}

}