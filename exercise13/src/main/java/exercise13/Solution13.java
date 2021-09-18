/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Samontanez
 */

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

package exercise13;

import java.util.Scanner;
import java.text.NumberFormat;

public class Solution13 {
    private double principal;
    private double interestRate;
    private double time;
    private double compoundInterest;

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Solution13 sol13 = new Solution13();

        sol13.principal = sol13.readValueFromUser("What is the principal amount? ");
        sol13.interestRate = sol13.readValueFromUser("What is the rate? ");
        sol13.time = sol13.readValueFromUser("What is the number of years? ");
        sol13.compoundInterest = sol13.readValueFromUser("What is the number of times the " +
                "interest is compounded per year? ");

        double interest = sol13.interest(sol13.interestRate);
        double endAmount = sol13.endAmount(sol13.principal, interest, sol13.compoundInterest, sol13.time);

        System.out.println(sol13.output(sol13.principal, sol13.interestRate, sol13.time, endAmount, sol13.compoundInterest));
    }

    private double readValueFromUser(String prompt){
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    private double interest(double interestRate){
        return interestRate / 100;
    }

    private double endAmount(double principal, double interestRate, double compoundInterest, double time){
        return principal * Math.pow (1 + (interestRate / compoundInterest), (compoundInterest * time));
    }

    private String output(double principal, double interest, double time, double endAmount, double compoundInterest){
        NumberFormat dollar = NumberFormat.getCurrencyInstance();

        return "$" + principal + " invested at " + interest + "% for " + time + " years compounded "
                + compoundInterest + " times per year is " + dollar.format(endAmount) + ".";
    }
}
