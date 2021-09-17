/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Samontanez
 */

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

package exercise19;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Solution19 {
    private double weight;
    private double height;

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Solution19 sol19 = new Solution19();

        sol19.weight = sol19.readValueFromUser("Enter your weight in pounds: ");
        sol19.height = sol19.readValueFromUser("Enter your height in inches: ");

        double BMI = sol19.calculateBMI(sol19.weight, sol19.height);
        System.out.println(sol19.output(BMI));

    }

    private int readValueFromUser(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()){
            System.out.println("Invalid input, please enter a number: ");
            scanner.nextLine();
        }
        return scanner.nextInt();
    }

    private double calculateBMI(double weight, double height){
        return (weight / (height * height)) * 703;
    }

    private String output(double BMI){
        DecimalFormat decimal = new DecimalFormat(("###.#"));

        if(BMI > 18.5 && BMI < 25){
            return "Your BMI is " + decimal.format(BMI) +
                    "\nYou are within the ideal weight range.";
        }
        else
            return "Your BMI is " + decimal.format(BMI) +
            "\nYou are overweight. You should see your doctor";
    }
}