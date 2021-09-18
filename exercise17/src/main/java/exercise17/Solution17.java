/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Samontanez
 */

/*
    Print "Enter 1 if you are a male or 2 if you are a female: "
    scanner takes the input from the user,
    A while-loop, determines if the user input a number, if not, it will print "Please enter a number."
    'gender' stores the input from user

    Use a ternary operator to determine the alcohol distribution ratio based on gender:
    is the gender of user male:
        true: ratio = 0.73 (men)
        false ratio = 0.66 (women)

    Print "How many ounces of alcohol did you have? "
    scanner takes the input from the user
    A while-loop, determines if the user input a number, if not, it will print "Please enter a number."
    'alcoholConsume' stores the input from user

    Print "What is your weight in pounds? "
    scanner takes the input from the user
    A while-loop, determines if the user input a number, if not, it will print "Please enter a number."
    'weight' stores the input from user

    Print "How many hours has it been since your last drink? "
    scanner takes the input from the user
    A while-loop, determines if the user input a number, if not, it will print "Please enter a number."
    'time' stores the input from user

     'BAC' will store the calculation of blood alcohol level of the user
     using formula: BAC = (alcoholConsume * 5.14 / weight * r) - 0.15 * time

     Print "Your BAC is <BAC>"

     if BAC > 0.08
        Print "It is not legal for you to drive."

     else
        Print "It is legal for you to drive."
     */

package exercise17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution17 {
    private double gender;
    private double alcoholConsumed;
    private double weight;
    private double time;

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Solution17 sol17 = new Solution17();

        sol17.gender = sol17.readValueFromUser("Enter 1 if you are a male or 2 if you are a female: ");
        sol17.alcoholConsumed = sol17.readValueFromUser("How many ounces of alcohol did you have? ");
        sol17.weight = sol17.readValueFromUser("What is your weight in pounds? ");
        sol17.time = sol17.readValueFromUser("How many hours has it been since your last drink? ");


        double ratio = sol17.ratio(sol17.gender);
        double BAC = sol17.BAC(sol17.alcoholConsumed, sol17.weight, sol17.time, ratio);

        System.out.println(sol17.output(BAC));
    }

    private double readValueFromUser(String prompt){
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input, please enter a number: ");
            scanner.nextLine();
        }
        return scanner.nextDouble();
    }

    private double ratio(double gender){
        double male = 0.73;
        double female = 0.66;
        double r = (gender == 1) ? male : female;
        return r;
    }

    private double BAC(double alcoholConsumed, double weight, double time, double ratio){
        return (alcoholConsumed * 5.14 / weight * ratio) - 0.015 * time;
    }

    private String output(double BAC){
        DecimalFormat decimal = new DecimalFormat(("###.######"));
        System.out.println("\nYour BAC is " + decimal.format(BAC));

        if (BAC > 0.08) {
            return "It is not legal for you to drive.";
        } else {
            return "It is legal for you to drive";
        }
    }
}


