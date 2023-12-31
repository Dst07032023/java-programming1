package alexQI.OficeHours.Practice_04_13_2021;

import java.util.Arrays;
import java.util.Scanner;

public class
SmallestAndLongestWordFromArray {

    /*
    Shortest and Longest words from String array
    ~ Write a program that can return the shortest string element from a String array
    ~ Write a program that can return the longest string element from a String array
     */
    public static void main(String[] args) {

        //Get dynamic values from the user and store them in array words

        Scanner input = new Scanner(System.in);
        System.out.println("How many words will you enter:");
        String [] words = new String[input.nextInt()];
        input.nextLine();
        for(int i = 0; i < words.length; i++) {
            System.out.println("Enter word: " + (i+1));
            words[i] = input.nextLine();
        }
        System.out.println(Arrays.toString(words));
//        String smallest = words[0];
//        String largest = words[0];
        String [] smallAndLarge = {words[0], words[0]}; //null, null
        // 0 -> smallest
        //1 -> largest

        for(String eachWord: words) {
            if(eachWord.length() < smallAndLarge[0].length()) { // eachWord.length() < smallest.length()
                smallAndLarge[0] = eachWord; // smallest = eachWord
            }
            if(eachWord.length() > smallAndLarge[1].length()) { // eachWord.length() < largest.length()
                smallAndLarge[1] = eachWord; // largest = eachWord
            }
        }
        System.out.println("Smallest element: " + smallAndLarge[0]); //smallest
        System.out.println("Largest element: " + smallAndLarge[1]); //largest
        System.out.println(Arrays.toString(smallAndLarge));
    }
}
