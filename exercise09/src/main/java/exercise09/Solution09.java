/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Samontanez
 */

package exercise09;

import java.util.Scanner;

public class Solution09 {
    /*
    Calculate gallons of paint needed to paint the ceiling of a room.
    Print "What is the length of the room in feet?"
    scanner takes the input from user
    'length' stores the input

    Print "What is the width of the room in feet?"
    scanner takes the input from user
    'width' stores the input

    'area' stores the calculation of the area of the room
    'paint' stores the calculation of how many area the paint will cover

    print "You will need to purchase <paint> gallons of paint to cover <area> square feet."
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
        int numPaint = area / 350;
        int leftOver = area % 350;

        if(leftOver<350 && leftOver>0) {
            numPaint++;
        }

        System.out.println("You will need to purchase " + numPaint + " gallons of paint to cover " + area + " square feet.");
    }
}
