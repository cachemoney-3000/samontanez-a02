/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Samontanez
 */

package exercise17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution17 {
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


    public static void main(String[] args) {

            System.out.print("Enter 1 if you are a male or 2 if you are a female: ");
            Scanner input0 = new Scanner(System.in);
            while (!input0.hasNextInt()) {
                System.out.println("Invalid input, please enter a number!");
                input0.nextLine();
            }
            int gender = input0.nextInt();

            double male = 0.73, female = 0.66;
            double ratio = (gender == 1) ? male : female;

            System.out.print("How many ounces of alcohol did you have? ");
            Scanner input1 = new Scanner(System.in);
            while (!input1.hasNextInt()) {
                System.out.println("Invalid input, please enter a number!");
                input1.nextLine();
             }
            int alcoholConsume = input1.nextInt();

            System.out.print("What is your weight in pounds? ");
            Scanner input2 = new Scanner(System.in);
            while (!input2.hasNextInt()) {
                System.out.println("Invalid input, please enter a number!");
                input2.nextLine();
            }
            int weight = input2.nextInt();

            System.out.print("How many hours has it been since catch (NumberFormatException e) {e your last drink? ");
            Scanner input3 = new Scanner(System.in);
             while (!input3.hasNextInt()) {
                System.out.println("Invalid input, please enter a number!");
                 input3.nextLine();
              }
            int time = input3.nextInt();


            double BAC = (alcoholConsume * 5.14 / weight * ratio) - 0.015 * time;

            DecimalFormat dF = new DecimalFormat(("###.######"));
            System.out.println("\nYour BAC is " + dF.format(BAC));

            if (BAC > 0.08) {
                System.out.println("It is not legal for you to drive.");
            } else {
                System.out.println("It is legal for you to drive");
            }


    }
}


