package alexQI.OficeHours.Practice_05_03_2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SumOfNumbersInList {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("123", "54", "24"));

        for(int i = 0; i < list.size(); i++) {
            int totalSum = 0;

            for(char digit : list.get(i).toCharArray()){

                totalSum += Integer.parseInt("" + digit);
            }
//            System.out.println(list);
            list.set(i, "" + totalSum);
        }
        System.out.println(list);
    }
}
