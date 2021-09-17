/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Samontanez
 */

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

package exercise09;

import java.util.Scanner;

public class Solution09 {

    private int length;
    private  int width;
    private static final int constantValue = 350;

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Solution09 sol9 = new Solution09();

        sol9.length = sol9.readValueFromUser("What is the length of the room in feet? ");
        sol9.width = sol9.readValueFromUser("What is the width of the room in feet? ");

        int constantValue = 350;
        int area = sol9.area(sol9.length, sol9.width);
        int numPaint = sol9.numPaint(area, constantValue);
        int leftOver = sol9.leftOver(area, constantValue);

        if(leftOver < constantValue || leftOver > constantValue)
            numPaint++;

        System.out.println(sol9.output(numPaint, area));
    }

    private int readValueFromUser(String prompt){
        System.out.print(prompt);
        return scanner.nextInt();
    }

    private int area(int length, int width){
        return length * width;
    }

    private int numPaint(int area, int constant){
        return area / constant;
    }

    private int leftOver(int area, int constant){
        return area % constant;
    }

    private String output(int numPaint, int area){
        return "You will need to purchase " + numPaint + " gallons of paint to cover " + area + " square feet.";
    }
}
