/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Samontanez
 */

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

package exercise16;

import java.util.Scanner;

public class Solution16 {
    private int age;

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Solution16 sol16 = new Solution16();

        sol16.age = sol16.readValueFromUser("What is your age? ");
        int minLegalAge = 16;

        System.out.println(sol16.output(sol16.age, minLegalAge));
    }

    private int readValueFromUser(String prompt){
        System.out.print(prompt);
        return scanner.nextInt();
    }

    private String output(int age, int minLegalAge){
        String msg = (age >= minLegalAge) ? "You are old enough to legally drive" :
                "You are not old enough to legally drive";
        return msg;
    }
}