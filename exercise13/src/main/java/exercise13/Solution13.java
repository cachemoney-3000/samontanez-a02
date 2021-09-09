/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Samontanez
 */

package exercise13;

import java.util.Scanner;
import java.text.NumberFormat;

public class Solution13 {
    /*
    Print "What is the principal amount? "
    scanner takes the input from the user
    'principal' stores the input

    Print "What is the rate?"
    scanner takes the input
    'rate' stores the input

    Print "What is the number of years? "
    scanner takes the input
    'time' stores the input

    Print "What is the number of times the interest is compounded per year? "
    scanner takes the input
    'compoundInt' stores the input

    'endAmount' = stores the calculation the end amount of the investment using
    formula: A = P(1 + r/n)^(n*t) where

    P is the principal amount.
    r is the annual rate of interest.
    t is the number of years the amount is invested.
    n is the number of times the interest is compounded per year.
    A is the amount at the end of the investment.

     Print "$<principal> invested at <rate>% for <time> years compounded
     <compoundInt> times per year is $<endAmount>.
     */

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("What is the principal amount? ");
        Scanner num1 = new Scanner(System.in);
        int principal = num1.nextInt();

        System.out.print("What is the rate? ");
        Scanner num2 = new Scanner(System.in);
        double interest = num2.nextDouble();

        System.out.print("What is the number of years? ");
        Scanner num3 = new Scanner(System.in);
        double time = num3.nextDouble();

        System.out.print("What is the number of times the interest is compounded per year? ");
        Scanner num4 = new Scanner(System.in);
        double compoundInt = num4.nextDouble();


        double intDecimal = interest / 100.0;
        double endAmount = principal * Math.pow (1 + (intDecimal / compoundInt), (compoundInt * time));
        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();


        System.out.println("$" + principal + " invested at " + interest + " for " + time + " years compounded "
            + compoundInt + " times per year is " + defaultFormat.format(endAmount));

    }
}
