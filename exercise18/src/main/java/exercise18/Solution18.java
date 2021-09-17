/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Samontanez
 */

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

package exercise18;

import java.util.Scanner;

public class Solution18 {
    private String conv;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Solution18 sol18 = new Solution18();

        sol18.conv = sol18.readValueFromUser();
        System.out.println(sol18.conversion(sol18.conv));
    }

    private String readValueFromUser() {
        String msg = """
                Press C to convert from Fahrenheit to Celsius.
                Press F to convert from Celsius to Fahrenheit.
                Your choice:""";
        System.out.print(msg);
        return scanner.nextLine();
    }

    private int readValue(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    private String conversion(String conv){
        Solution18 sol18 = new Solution18();

        if (conv.equals("C") || conv.equals("c")) {
            int fahrenheit = sol18.readValue("Please enter the temperature in Fahrenheit: ");
            int celsius = (fahrenheit - 32) * 5 / 9;

            return "The temperature in Celsius is " + celsius + ".";
        }
        else if(conv.equals("F") || conv.equals("f")){
            int celsius = sol18.readValue("Please enter the temperature in Celsius: ");
            int fahrenheit = (celsius * 9 / 5) + 32;

            return "The temperature in Fahrenheit is " + fahrenheit + ".";
        }
        else{
            return "Invalid input, re-run the program again.";
        }
    }
}