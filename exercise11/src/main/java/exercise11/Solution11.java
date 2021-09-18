/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Samontanez
 */

/*
    Print "How many euros are you exchanging? "
    scanner takes the input from the user
    'euro' stores the input

    Print "What is the current exchange rate?"
    scanner takes the input
    'rate' stores the input

    'dollars' = euro * rate
    'roundOff' = rounds the 'dollar' amount to the nearest tenths.

    Print "<euro> euros at an exchange rate of <rate> is <dollars> U.S. dollars.
     */

package exercise11;

import java.text.NumberFormat;
import java.util.Scanner;

public class Solution11 {
    private float euro;
    private float rate;

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Solution11 sol11 = new Solution11();

        sol11.euro = sol11.readValueFromUser("How many euros are you exchanging? ");
        sol11.rate = sol11.readValueFromUser("What is the current exchange rate? ");

        float dollars = sol11.dollarConversion(sol11.euro, sol11.rate);

        System.out.println(sol11.output(sol11.euro, sol11.rate, dollars));
    }

    private float readValueFromUser(String prompt){
        System.out.print(prompt);
        return scanner.nextFloat();
    }

    private float dollarConversion(float euro, float rate){
        return euro * rate;
    }

    private String output(float euro, float rate, float dollars){
        NumberFormat dollar = NumberFormat.getCurrencyInstance();
        return euro + " euros at an exchange rate of " + rate + " is\n" +
                dollar.format(dollars) + " U.S. dollars.";
    }
}
