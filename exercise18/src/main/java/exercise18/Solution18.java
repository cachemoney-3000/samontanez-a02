/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Samontanez
 */

package exercise18;

import java.util.Scanner;

public class Solution18 {
    /*
    Print "Press C to convert from Fahrenheit to Celsius."
    Print "Press F to convert from Celsius to Fahrenheit."

    Print "Your choice:"
    scanner takes the input from the user
    'conv' stores the input from user

    If user enter "c" or "C", do the following:
        Print "Please enter the temperature in Fahrenheit: "
        scanner takes the input from the user
        'F' stores the input from user

        'C' = (F - 32) * 5 / 9

        Print "The temperature in Celsius is: <CtoF>."

    else, do:
        Print "Please enter the temperature in Celsius: "
        scanner takes the input from the user
        'C' stores the input from user

        'F' = (C * 9 / 5) + 32

        Print "The temperature in Fahrenheit is: <F>."

     */


    public static void main(String[] args) {

        String input = "nothing";

        String msg = """
                Press C to convert from Fahrenheit to Celsius. 
                Press F to convert from Celsius to Fahrenheit.
                Your choice: """;

        System.out.print(msg);
                Scanner convStr = new Scanner(System.in);
                String conv = convStr.nextLine();

        if (conv.equals("C") || conv.equals("c")) {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            Scanner fah = new Scanner(System.in);
            int F = fah.nextInt();

            int C = (F - 32) * 5 / 9;

            System.out.println("The temperature in Celsius is " + C + ".");

        }
        else if(conv.equals("F") || conv.equals("f")){
            System.out.print("Please enter the temperature in Celsius: ");
            Scanner cel = new Scanner(System.in);
            int C = cel.nextInt();

            int F = (C * 9 / 5) + 32;

            System.out.println("The temperature in Fahrenheit is " + F + ".");
        }
        else{
            System.out.println("Invalid input, re-run the program again.");
        }


    }
}