/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Samontanez
 */

/*
    Print "What is the order amount "
    scanner takes the input from the user
    'subtotal' stores the input

    Print "What is the state"
    scanner takes the input
    'state' stores the input

    if the state is "WI"{
        tax = 5.5%
        Print "The subtotal is <subtotal>."
        <newline> "The tax is <tax>."
        <newline> "The total is <total>."
    }

    Print "The total is <total>."
     */

package exercise14;

import java.text.NumberFormat;
import java.util.Scanner;

public class Solution14 {
    private double subtotal;

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Solution14 sol14 = new Solution14();

        sol14.subtotal = sol14.readValueFromUser("What is the order amount? ");

        System.out.print("What is the state? ");
        Scanner stateStr = new Scanner(System.in);
        String state = stateStr.nextLine();

        System.out.println(sol14.output(state, sol14.subtotal));
    }

    private double readValueFromUser(String prompt){
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    private String output(String state, double subtotal) {
        NumberFormat dollar = NumberFormat.getCurrencyInstance();

        if (state.equals("WI") || state.equals("wi")) {
            double tax = (5.5 / 100) * subtotal;
            double total = tax + subtotal;

            return "The subtotal is " + dollar.format(subtotal) + "." +
                    "\nThe tax is " + dollar.format(tax) + "." +
                    "\nThe total is " + dollar.format(total) + ".";
        }

        if (!state.equals("WI") || !state.equals("wi")) {
            double total = subtotal;
            return "The total is " + dollar.format(total);
        }
        return "Try again";
    }
}