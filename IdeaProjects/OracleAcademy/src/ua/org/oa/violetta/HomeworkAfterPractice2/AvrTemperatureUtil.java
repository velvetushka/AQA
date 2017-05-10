package ua.org.oa.violetta.HomeworkAfterPractice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AvrTemperatureUtil {

    public static  String inputMonth() throws IOException {
        BufferedReader brName = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input month name, for example 'January'");

//
        String   monthName = brName.readLine();
        return monthName;

    }


    public  static int checkNumbersOfDays(String monthName) throws IOException {
        int days;
         switch (monthName) {
             case "January": case "March":case "May":case "July":case "August":case "October":case "December":
                 days = 31;
                 break;
             case "September":case "April":case "June":case "November":
                 days = 30;
                 break;
             case "February":
                 days = 28;
                 break;
             default:
                 System.out.println("Invalid month");
                 days = checkNumbersOfDays(inputMonth());
                 break;

         }
        return days;
    }
    public  static void inputDaysTemperatureIntoArrayList(int days) throws IOException {
        ArrayList<Integer> listOfTemperature = new ArrayList<Integer>();
        BufferedReader brTemper = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < days; i++) {
            System.out.println("Input day's temperature for the " + (i + 1) + " day");
            listOfTemperature.add(Integer.parseInt(brTemper.readLine()));
        }
        listOfTemperature.trimToSize();

//calculate average and MIN and MAX temperature

        {
            double sum = 0;
            for (int i = 0; i <= (listOfTemperature.size()-1); i++) {
                sum += listOfTemperature.get(i);
            }
            double avrTemper = sum/days;

            System.out.println("Average temperature is " + avrTemper);
            //check MIN and MAX
            int max = listOfTemperature.get(0) ;
            int maxDay = 1;
            int min = listOfTemperature.get(0);
            int minDay = 1;

            for (int i = 0; i<(listOfTemperature.size()-1); i++) {
                if (max < listOfTemperature.get(i + 1)) {
                    max = listOfTemperature.get(i + 1);
                    maxDay = i + 2;
                }
                if (min > listOfTemperature.get(i + 1)) {
                    min = listOfTemperature.get(i + 1);
                    minDay = i + 2;
                }
            }
                System.out.println("Maximum of temperature was " + maxDay + "th and was " + max + "'C");
                System.out.println("Minimum of temperature was " + minDay + "th and was " + min + "'C");


        }

    }
}
