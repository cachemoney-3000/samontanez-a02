/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Samontanez
 */

package exercise08;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Solution08 {
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
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("How many people? ");
        String peopleStr = scanner.nextLine();
        int people = Integer.parseInt(peopleStr);

        System.out.print("How many pizzas do you have? ");
        String pizzaStr = scanner.nextLine();
        int pizza = Integer.parseInt(pizzaStr);

        System.out.print("How many slices per pizza? ");
        String sliceStr = scanner.nextLine();
        int slice = Integer.parseInt(sliceStr);

        int totalSlices = slice * pizza;
        int piece = (pizza*slice)/people;
        int leftover = (pizza*slice) % people;

        System.out.println(people + " people with " + pizza + " pizzas (" + totalSlices + " slices).");
        System.out.println("Each person gets " + piece + " pieces of pizza.");
        System.out.println("There are " + leftover + " leftover pieces.");
    }
}