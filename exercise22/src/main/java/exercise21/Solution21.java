/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Samontanez
 */

package exercise21;

import java.util.Scanner;

public class Solution21 {
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

    public static void main(String[] args) {
        System.out.print("What is the first number: ");
        Scanner input1 = new Scanner(System.in);
        int num1 = input1.nextInt();

        System.out.print("What is the second number: ");
        Scanner input2 = new Scanner(System.in);
        int num2 = input2.nextInt();

        System.out.print("What is the third number: ");
        Scanner input3 = new Scanner(System.in);
        int num3 = input3.nextInt();

        if(num1 == num2 && num2 == num3){
            System.out.println("All numbers are equal, exiting...");
            System.exit(0);
        }
        else {
            int numMax = num1;
            if (numMax > num2 && numMax > num3)
                numMax = num1;

            else if (num2 > num1 && num2 > num3)
                numMax = num2;

            else
                numMax = num3;

            System.out.println("The largest number is " + numMax);
        }
    }
}
