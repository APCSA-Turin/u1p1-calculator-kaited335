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
        tip = (double) (Double.parseDouble(money.format(tip)));
        total = (double) (Double.parseDouble(money.format(total)));
        perPersonNoTip = (double) (Double.parseDouble(money.format(perPersonNoTip)));
        tipSplit = (double) (Double.parseDouble(money.format(tipSplit)));
        totalPerPerson = (double) (Double.parseDouble(money.format(totalPerPerson)));

        String result = "-------------------------------\n" +
                       "Total bill before tip: $" + cost + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + tip + "\n" +
                       "Total Bill with tip: $" + total + "\n" +
                       "Per person cost before tip: $" + perPersonNoTip + "\n" +
                       "Tip per person: $" + tipSplit + "\n" +
                       "Total cost per person: $" + totalPerPerson + "\n" +
                       "-------------------------------\n";

        return result;
    }

    public static String extraCredit(int people, int percent, double cost) {
        String result = "Extra credit not implemented";
    
    
        DecimalFormat money = new DecimalFormat ("#.##");    
        double tip = (cost * (percent/100.0));
        double total = cost + tip;
        double perPersonNoTip = cost / people;
        double tipSplit = tip / people;
        double totalPerPerson = total / people;
        tip = (double) (Double.parseDouble(money.format(tip)));
        total = (double) (Double.parseDouble(money.format(total)));
        perPersonNoTip = (double) (Double.parseDouble(money.format(perPersonNoTip)));
        tipSplit = (double) (Double.parseDouble(money.format(tipSplit)));
        totalPerPerson = (double) (Double.parseDouble(money.format(totalPerPerson)));
         result = "-------------------------------\n" +
                       "Total bill before tip: $" + cost + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + tip + "\n" +
                       "Total Bill with tip: $" + total + "\n" +
                       "Per person cost before tip: $" + perPersonNoTip + "\n" +
                       "Tip per person: $" + tipSplit + "\n" +
                       "Total cost per person: $" + totalPerPerson + "\n" +
                       "-------------------------------\n"+
                       "Items ordered:\n";       
        //String x;
        //while (!x.equals("-1")) {
             
        //}
               
                       
        
                                            
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
        
