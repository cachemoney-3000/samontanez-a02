/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Samontanez
 */

package exercise11;

import java.text.NumberFormat;
import java.util.Scanner;

public class Solution11 {
    /*
    Print "How many euros are you exchanging? "
    scanner takes the input from the user
    'euro' stores the input

    Print "What is the current exchange rate?"
    scanner takes the input
    'rate' stores the input

    'dollars' = euro * rate
    'roundOff' = rounds the 'dollar' amount to the nearest tenths.

    Print "<euro> euros at an exchange rate of <rate> is <dollars> U.S. dollars.
     */

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("How many euros are you exchanging? ");
        String euroStr = scanner.nextLine();
        int euro = Integer.parseInt(euroStr);

        System.out.print("What is the current exchange rate? ");
        Scanner r8 = new Scanner(System.in);
        float rate = r8.nextFloat();

        float dollars = euro * rate;
        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();

        System.out.println(euro + " euros at an exchange rate of " + rate + " is\n" +
                defaultFormat.format(dollars) + " U.S. dollars.");

    }
}
