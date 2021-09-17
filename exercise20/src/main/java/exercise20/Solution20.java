/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Samontanez
 */

/*
    Print "What is the order amount? "
    scanner takes the input from the user
        while loop will determine if the user input is valid
    'subtotal' stores the input from user

    Print "What state do you live in?"
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

package exercise20;

import java.text.NumberFormat;
import java.util.Scanner;

public class Solution20 {

    private double subtotal;
    private String state;
    private String county;

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Solution20 sol20 = new Solution20();

        sol20.subtotal = sol20.readValueFromUser("What is the order amount? ");
        sol20.state = sol20.readValue("What state do you live in? ");
        sol20.county = sol20.readValue("What county do you live in? ");

        double tax = stateTax(sol20.state, sol20.county, sol20.subtotal);
        double total = sol20.subtotal + tax;

        System.out.println(sol20.output(tax, total));
    }

    private double readValueFromUser(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()){
            System.out.println("Invalid input, please enter a number: ");
            scanner.nextLine();
        }
        return scanner.nextDouble();
    }

    private String readValue(String prompt) {
        System.out.print(prompt);
        Scanner str = new Scanner(System.in);
        String input = str.nextLine();
        return input;
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
            if(!county.equals("Eau  Claire") || !county.equals("eau claire") || county.equals("Dunn") || !county.equals("dunn"))
            return baseTax;
        }
        if (state.equals("Illinois") || state.equals("illinois") || state.equals("IL") || state.equals("il")) {
            double tax = (0.08 * subtotal);
            return tax;
        }
        return 0;
    }

    private String output(double tax, double total){
        NumberFormat dollar = NumberFormat.getCurrencyInstance();

        return "The tax is " + dollar.format(tax) + "." +
                "\nThe total is " + dollar.format(total) + ".";
    }

}
