/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Samontanez
 */

/*
    print "How many people" to prompt user for the number of people
    scanner gets the input from user,
    'people' will store the input.

    print "How many pizzas do you have?"
    scanner gets the input from user,
    'pizza' will store the input.

    print "How many slices per pizza?"
    scanner gets the input from user,
    'slice' will store the input.

    'total slices' stores the calculation of pizza * slice
    'piece' stores the calculation of how many slice/s of pizza each person should get
    'leftover' stores the calculation of there will be a leftover pieces after each person have
    the same amount of pizzas.

    print "<people> people with <pizza> pizzas (<slices> slices)."
    print "Each person gets <piece> pieces of pizza."
    print "There are <leftover> leftover pieces."

     */

package exercise08;

import java.util.Scanner;

public class Solution08 {

    private int people;
    private int pizza;
    private int slice;

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Solution08 sol8 = new Solution08();

        sol8.people = sol8.readValueFromUser("How many people? ");
        sol8.pizza = sol8.readValueFromUser("How many pizzas do you have? ");
        sol8.slice = sol8.readValueFromUser("How many slices per pizza? ");

        int totalSlices = sol8.totalSlices(sol8.slice, sol8.pizza);
        int piece = sol8.piece(sol8.pizza, sol8.slice, sol8.people);
        int leftover = sol8.leftover(sol8.pizza, sol8.slice, sol8.people);

        System.out.println(sol8.output(sol8.people, sol8.pizza, totalSlices, piece, leftover));
    }

    private int readValueFromUser(String prompt){
        System.out.print(prompt);
        return scanner.nextInt();
    }

    private int totalSlices(int slice, int pizza){
        return slice * pizza;
    }

    private int piece(int pizza, int slice, int people){
        return (pizza*slice)/people;
    }

    private int leftover(int pizza, int slice, int people){
        return (pizza*slice) % people;
    }

    private String output(int people, int pizza, int totalSlices, int piece, int leftover){
        return people + " people with " + pizza + " pizzas (" + totalSlices + " slices).\n" +
                "Each person gets " + piece + " pieces of pizza.\n" +
                "There are " + leftover + " leftover pieces.";
    }
}