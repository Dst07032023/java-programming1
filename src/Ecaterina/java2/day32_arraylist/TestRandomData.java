package Ecaterina.java2.day32_arraylist;

import java.util.ArrayList;

public class TestRandomData {
    public static void main(String[] args) {

        System.out.println(EasyData.getRandomNumbers(10));

        ArrayList<Integer> nums = EasyData.getRandomNumbers(20);
        System.out.println(nums);
    }
}
