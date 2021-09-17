/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Samontanez
 */

    /*

    Create a program that calculates the area of a room. Prompt the user for the length and width of the room in feet.
     Then display the area in both square feet and square meters.

    print "What is the length of the room in feet?" to prompt user to enter length
    scanner gets the input from user,
    'Length' will store the input.

    print "What is the width of the room in feet?" to prompt user to enter width
    scanner gets the input from user,
    'Width' will store the input.

    'area' stores the calculation of the area of rectangle
    'meter2' stores the conversion from square feet to square meter

    print "You entered dimensions of <length> feet by <width> feet.
    print "The area is
    <newline> <area> square feet"
    print "<meter2> square meters"

     */

package exercise07;

import java.util.Scanner;

public class Solution07 {

    private int length;
    private  int width;

    private static final Scanner scanner = new Scanner(System.in);

    private int readValueFromUser(String prompt){
        System.out.print(prompt);
        return scanner.nextInt();
    }

    private int area(int length, int width){
        return length * width;
    }

    public static void main(String[] args) {
        Solution07 sol7 = new Solution07();

        sol7.length = sol7.readValueFromUser("What is the length of the room in feet? ");
        sol7.width = sol7.readValueFromUser("What is the width of the room in feet? ");

        int area = sol7.area(sol7.length, sol7.width);
        double meter2 = area * 0.09290304;

        System.out.printf("You entered dimensions of " + sol7.length + " feet by " + sol7.width + " feet." +
                "\nThe area is\n"
                + area + " square feet\n");
        System.out.printf("%.3f square meters", meter2);

    }
}