/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Samontanez
 */

/*
    Print "Enter the principal: "
    scanner takes the input from the user
    'principal' stores the input

    Print "Enter the rate of interest:"
    scanner takes the input
    'interest' stores the input

    Print "Enter the number of years: "
    scanner takes the input
    'time' stores the input

    'endAmount' = principal (1 + (rate * time))

     Print "After <time> years at <interest>% the investment will be worth $<endAmount>.
     */

package exercise12;

import java.text.NumberFormat;
import java.util.Scanner;

public class Solution12 {
    private double principal;
    private double interest;
    private double time;

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Solution12 sol12 = new Solution12();

        sol12.principal = sol12.readValueFromUser("Enter the principal: ");
        sol12.interest = sol12.readValueFromUser("Enter the rate of interest: ");
        sol12.time = sol12.readValueFromUser("Enter the number of years: ");

        double interest = sol12.convInterest(sol12.interest);
        double endAmount = sol12.endAmount(sol12.principal, interest, sol12.time);

        System.out.println(sol12.output(sol12.time, sol12.interest, endAmount));
    }
    private double readValueFromUser(String prompt){
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    private double convInterest(double interest){
        return interest / 100.0;
    }

    private double endAmount(double principal, double interest, double time){
        return principal * (1 + (interest * time));
    }

    private String output(double time, double interest, double endAmount){
        NumberFormat dollar = NumberFormat.getCurrencyInstance();
        return "After " + time + " years at " + interest + "% the investment will be worth "
                + dollar.format(endAmount);
    }
}