/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Samontanez
 */

package exercise12;

import java.util.Scanner;

public class Solution12 {
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

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the principal: ");
        Scanner num1 = new Scanner(System.in);
        double principal = num1.nextDouble();

        System.out.print("Enter the rate of interest: ");
        Scanner num2 = new Scanner(System.in);
        double interest = num2.nextDouble();

        System.out.print("Enter the number of years: ");
        Scanner num3 = new Scanner(System.in);
        double time = num3.nextDouble();

        double intDecimal = interest / 100.0;
        double endAmount = principal * (1 + (intDecimal * time));

        System.out.println("After " + time + " years at " + interest + "% the investment will be worth $" + Math.round(endAmount));

    }
}
