/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Samontanez
 */

package exercise16;

import java.util.Scanner;

public class Solution16 {
    /*
    Print "What is your age? "
    scanner takes the input from the user
    'age' stores the input from user

    'minAgeLegal' stores the legal age to drive which is 16 or older.

    We are using the ternary operator:
    If 'age' is equal or greater than the legal age to drive
        true: print "You are old enough to legally drive.
        false: You are not old enough to legally drive.
     */


    public static void main(String[] args) {
        System.out.print("What is your age? ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        int minAgeLegal = 16;

        String msg = (age >= minAgeLegal) ? "You are old enough to legally drive" :
                "You are not old enough to legally drive";

        System.out.println(msg);
    }
}