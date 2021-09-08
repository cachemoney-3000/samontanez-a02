/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Samontanez
 */

package exercise06;

import java.util.Calendar;
import java.util.Scanner;

public class Solution06 {
    /*
    Get the current value of the year
    store the year to 'year'

    print "What is your current age?" to prompt user for their age
    scanner reads the user's input,
    'age' stores the input

    print "At what age would you like to retire? to prompt user their ideal retirement age
    scanner will read the user input
    'retire' stores the input

    print "You have <remaining> years left until you can retire.
    newline print "It's <currYear>, so you can retire in <retYear>
     */
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.print("How old are you? ");
        String ageStr = scanner.nextLine();
        int age = Integer.parseInt(ageStr);

        System.out.print("At what age would you like to retire? ");
        String retStr = scanner.nextLine();
        int retire = Integer.parseInt(retStr);

        int remaining = retire - age;
        int retYear = year + remaining;
        System.out.println("You have " + remaining + " years until you can retire. \n" +
                "It is " + year + " so you have retired in " + retYear);


    }
}