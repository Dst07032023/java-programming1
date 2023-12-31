package Ecaterina.java2.day32_arraylist;

import java.util.*;

public class VendingMachine {
    public static void main(String[] args) {

        //older approach: use add method
//        ArrayList<String> drinks = new ArrayList<>();
//        drinks.add("Soda");
//        drinks.add("Juice");
//        drinks.add("Water");
//        drinks.add("Coffee");
//        System.out.println(drinks);

        Scanner input = new Scanner(System.in);

        ArrayList<String> drinks = new ArrayList<>(Arrays.asList("Soda", "Juice", "Water", "Coffee"));

        System.out.println("Welcome. Which drink would you like?");
        String selection = input.next(); // StringUtil.fixFormat(input.nest())

        if(drinks.contains(selection)) {
            System.out.println(selection + " is vending");
        }else{
            System.out.println(selection + " is not in the vending machine");
        }



    }
}
