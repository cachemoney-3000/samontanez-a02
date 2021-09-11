/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Samontanez
 */

package exercise19;

import java.util.Scanner;
import java.text.DecimalFormat;


public class Solution19 {
    /*
    Print "Enter your weight"
    scanner takes the input from the user
        while loop will determine if the user input is valid
    'weight' stores the input from user

    Print "Enter your height"
    scanner takes the input from the user
        while loop will determine if the user input is valid
    'height' stores the input from user

    'BMI' = (weight / (height × height)) * 703

    print "Your BMI is <BMI>."

    if the BMI is between 18.5 and 25, do the following:
        print "You are within the ideal weight range."

    else, do:
        print "You are overweight. You should see your doctor."
     */


    public static void main(String[] args) {


        System.out.print("Enter your weight in pounds: ");
        Scanner input1 = new Scanner(System.in);
        while (!input1.hasNextInt()) {
            System.out.println("Invalid input, please enter a number!");
            input1.nextLine();
        }
        double weight = input1.nextInt();

        System.out.print("Enter your height in inches: ");
        Scanner input2 = new Scanner(System.in);
        while (!input2.hasNextInt()) {
            System.out.println("Invalid input, please enter a number!");
            input2.nextLine();
        }
        double height = input2.nextInt();

        double BMI = (weight / (height * height)) * 703;
        DecimalFormat dF = new DecimalFormat(("###.#"));

        System.out.println("Your BMI is " + dF.format(BMI));

        if(BMI > 18.5 && BMI < 25){
            System.out.println("You are within the ideal weight range.");
        }

        else
            System.out.println("You are overweight. You should see your doctor");

    }
}