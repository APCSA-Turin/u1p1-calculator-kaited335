package com.example;
import java.util.Scanner;
import java.text.DecimalFormat; // The website that helped me understand how to round https://www.geeksforgeeks.org/java/java-program-to-round-a-number-to-n-decimal-places/

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW
        DecimalFormat money = new DecimalFormat ("#.##");    
        double tip = (cost * (percent/100.0));
        double total = cost + tip;
        double perPersonNoTip = cost / people;
        double tipSplit = tip / people;
        double totalPerPerson = total / people;

        String result = "-------------------------------\n" +
                       "Total bill before tip: $" + cost + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + money.format(tip) + "\n" +
                       "Total Bill with tip: $" + money.format(total) + "\n" +
                       "Per person cost before tip: $" + money.format(perPersonNoTip) + "\n" +
                       "Tip per person: $" + money.format(tipSplit) + "\n" +
                       "Total cost per person: $" + money.format(totalPerPerson) + "\n" +
                       "-------------------------------\n";

        return result;
    }

    public static String extraCredit(int people, int percent, double cost) {
        String result = "Extra credit not implemented";
        boolean condition = true;
    
        //  COPY AND PASTE YOUR PROGRAM FROM calculateTip() HERE 
        
        // the while loop condition is checked,
        // and if TRUE, runs the code inside.
        // when the code inside is done running, the condition is rechecked,
        // and the loop repeats as long as the condition remains TRUE.
        // when the condition becomes FALSE, it stops

        while (condition) {
            //enter your code here 
            System.out.println("placeholder");
            condition = false;
    
        }

        return result;
    }
    
    
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people=10; 
        int percent=8;
        double cost=10.5;              
        //System.out.println(calculateTip(people,percent,cost));
        System.out.println(extraCredit(people, percent, cost));
    }
}
        
