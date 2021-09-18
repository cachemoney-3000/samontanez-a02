/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Samontanez
 */

/*
        Print "Enter the first number "
        scanner takes the input from the user
        'num1' stores the input from user

        Print "Enter the second number "
        scanner takes the input from the user
        'num2' stores the input from user

        Print "Enter the third number "
        scanner takes the input from the user
        'num3' stores the input from user

        If all the numbers are equal:
            We must exit the program
            Print "All numbers are equal, exiting..."

        if all numbers are not equal:
            We will compare each numbers
            If 'num1' > 'num2' and 'num1' > 'num3'
                'numMax' = num1 is the largest

            else if 'num2' > 'num1' and 'num2' > 'num3'
                'numMax' = num2 is the largest

            if the above conditions are incorrect:
                'numMax' = num3 is the largest

        Therefore:
        Print "The largest number is <numMax>."
     */
package exercise22;

import java.util.Scanner;

public class Solution22 {
    private int num1;
    private int num2;
    private int num3;

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Solution22 sol22 = new Solution22();

        sol22.num1 = sol22.readValueFromUser("What is the first number: ");
        sol22.num2 = sol22.readValueFromUser("What is the second number: ");
        sol22.num3 = sol22.readValueFromUser("What is the third number: ");

        System.out.println(sol22.output(sol22.num1, sol22.num2, sol22.num3));

    }
    private int readValueFromUser(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()){
            System.out.println("Invalid input, please enter a number: ");
            scanner.nextLine();
        }
        return scanner.nextInt();
    }

    private String output(int num1, int num2, int num3){
        if(num1 == num2 && num2 == num3){
            return "All numbers are equal, exiting...";
        }
        else {
            int numMax = num1;
            if (numMax > num2 && numMax > num3)
                numMax = num1;

            else if (num2 > num1 && num2 > num3)
                numMax = num2;

            else
                numMax = num3;

            return "The largest number is " + numMax;
        }
    }
}
