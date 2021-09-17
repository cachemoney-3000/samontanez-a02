/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Samontanez
 */

/*

    >While loop will determine if the user input is valid (1-12 only)
        Print "Please enter the number of the month: "
        scanner takes the input from the user
        'monthNum' stores the input from user

        If the input is valid:
            it will call the "month method"
            print "The name of the month is <month>

        If the input is invalid:
            it will prompt user to try again.


    Month method will convert the number to months using switch
    Switch statements:
        case 1: String month will store January
        case 2: String month will store February
        case 3: String month will store March
        case 4: String month will store April
        case 5: String month will store May
        case 6: String month will store June
        case 7: String month will store July
        case 8: String month will store August
        case 9: String month will store September
        case 10: String month will store October
        case 11: String month will store November
        case 12: String month will store December

    Print "The name of the month is <month>."
     */

package exercise21;

import java.util.Scanner;

public class Solution21 {
    private int monthNum;

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Solution21 sol21 = new Solution21();

        sol21.monthNum = sol21.readValueFromUser("Please enter the number of the month: ");

        System.out.println(sol21.month(sol21.monthNum));

    }

    private int readValueFromUser(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    private static String month (int monthNum){
        String month;
        switch (monthNum) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                month = "Invalid input, try again!";
                return month;
        }
        return "The name of the month is " + month;
    }

}