/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Samontanez
 */

package exercise07;

import java.util.Scanner;

public class Solution07 {
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
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("What is the length of the room in feet? ");
        String lenStr = scanner.nextLine();
        int length = Integer.parseInt(lenStr);

        System.out.print("What is the width of the room in feet? ");
        String widStr = scanner.nextLine();
        int width = Integer.parseInt(widStr);

        int area = length * width;
        double meter2 = area * 0.09290304;

        System.out.println("You entered dimensions of " + lenStr + " feet by " + widStr + " feet.");
        System.out.println("The area is \n"
                + area + " square feet");
        System.out.printf("%.3f square meters", meter2);

    }
}