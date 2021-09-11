/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Samontanez
 */

package exercise20;

import java.text.NumberFormat;
import java.util.Scanner;

public class Solution20 {
    /*
    Print "What is the order amount? "
    scanner takes the input from the user
        while loop will determine if the user input is valid
    'subtotal' stores the input from user

    Print "What state do you live in? "
    scanner takes the input from the user
        while loop will determine if the user input is valid
    'state' stores the input from user

    Print "What county do you live in? "
    scanner takes the input from the user
        while loop will determine if the user input is valid
    'county' stores the input from user

     Write a statement to call 'stateTax'
     The method called 'stateTax' will provide us with 'tax'

    output:

    'total' = subtotal + tax
    Print "The tax is $<tax>."
    newline "The total is $<total>.


    -------------------
    create a new method called 'stateTax'
        if the user put Wisconsin on state, do:
        'baseTax' = 5/100

        **user input a county:**
            if the user lives in Eu claire county, do:
             'tax' = baseTax + 0.005
            if the user lives in Dunn count, do:
                'tax = vaseTax + 0.004
            if other county, do:
                'tax' = 5/100 //no additional tax

     if the user put Illinois, do:
        'tax' = 8/100

    All other states not mention, do not have any tax
     */


    public static void main(String[] args) {

        System.out.print("What is the order amount? ");
        Scanner input1 = new Scanner(System.in);
        while (!input1.hasNextInt()) {
            System.out.println("Invalid input, please enter a number!");
            input1.nextLine();
        }
        double subtotal = input1.nextInt();

        System.out.print("What state do you live in? ");
        Scanner input2 = new Scanner(System.in);
        String state = input2.nextLine();

        System.out.print("What county do you live in? ");
        Scanner input3 = new Scanner(System.in);
        String county = input3.nextLine();

        NumberFormat nf = NumberFormat.getCurrencyInstance();
        double tax = stateTax(state,county,subtotal);
        double total = subtotal + tax;

        System.out.println("The tax is " + nf.format(tax) + "." +
                "\nThe total is " + nf.format(total) + ".");

    }

    private static double stateTax(String state, String county, double subtotal) {
        if (state.equals("Wisconsin") || state.equals("wisconsin") || state.equals("WI") || state.equals("wi")) {
            double baseTax = 0.05 * subtotal;

            if (county.equals("Eu Claire") || county.equals("eu claire")) {
                double tax = (0.05 + 0.005) * subtotal;
                return tax;
            }
            if (county.equals("Dunn") || county.equals("dunn")) {
                double tax =  (0.05 + 0.004) * subtotal;
                return tax;
            }
            if(!county.equals("Eu Claire") || !county.equals("eu claire") || county.equals("Dunn") || !county.equals("dunn"))
            return baseTax;
        }
        if (state.equals("Illinois") || state.equals("illinois") || state.equals("IL") || state.equals("il")) {
            double tax = (0.08 * subtotal);
            return tax;
        }
        return 0;
    }

}
