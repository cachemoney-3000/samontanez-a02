/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Samontanez
 */

package exercise14;

import java.text.NumberFormat;
import java.util.Scanner;

public class Solution14 {
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

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("What is the order amount? ");
        Scanner num1 = new Scanner(System.in);
        double subtotal = num1.nextDouble();

        System.out.print("What is the state? ");
        Scanner stateStr = new Scanner(System.in);
        String state = stateStr.nextLine();

        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();

        if(state.equals("WI")){
            double tax = (5.5/100) * subtotal;
            double total = tax + subtotal;

            System.out.println("The subtotal is " + defaultFormat.format(subtotal) + "." +
                    "\nThe tax is " + defaultFormat.format(tax) + "." +
                    "\nThe total is " + defaultFormat.format(total) + ".");
        }

        if(!state.equals("WI")){
            double total = subtotal;
            System.out.println("The total is " + defaultFormat.format(total));
        }
    }
}