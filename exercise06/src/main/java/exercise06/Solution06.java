/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Samontanez
 */

    /*
    Get the current value of the year
    Store the year to 'year'

    print "What is your current age?" to prompt user for their age
    scanner reads the user's input,
    'age' stores the input

    print "At what age would you like to retire? to prompt user their ideal retirement age
    scanner will read the user input
    'retire' stores the input

    'remaining' stores the calculation of the remaining year a user can retire.
    'retYear stores the calculation to tell what year can user can retire.

    print "You have <remaining> years left until you can retire.
    newline print "It's <year>, so you can retire in <retYear>
     */

package exercise06;

import java.util.Calendar;
import java.util.Scanner;

public class Solution06 {

    private int age;
    private int retire;

    private static final Scanner scanner = new Scanner(System.in);

    private int readValueFromUser(String prompt){
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        Solution06 sol6 = new Solution06();

        int year = Calendar.getInstance().get(Calendar.YEAR);

        sol6.age = sol6.readValueFromUser("How old are you? ");
        sol6.retire = sol6.readValueFromUser("At what age would you like to retire? ");

        int remaining = sol6.retire - sol6.age;
        int retYear = remaining + year;

        System.out.println("You have " + remaining + " years until you can retire. \n" +
                "It is " + year + " so you have retired in " + retYear);
    }
}