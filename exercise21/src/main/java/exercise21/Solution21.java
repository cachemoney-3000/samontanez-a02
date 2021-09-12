/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Samontanez
 */

package exercise21;

import java.util.Scanner;

public class Solution21 {
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


    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);
        int monthNum;

        while (true) {
            System.out.print("Please enter the number of the month: ");
            monthNum = input1.nextInt();

            if (monthNum > 0 && monthNum < 13) {
                String month = month(monthNum);
                System.out.println("The name of the month is " + month);
                break;
            }
            else{
                System.out.println("Wrong input, try again!");
            }

        }
    }

        private static String month ( int monthNum){
            String month;
            switch (monthNum) {
                case 1:
                    month = "January";
                    return month;
                case 2:
                    month = "February";
                    return month;

                case 3:
                    month = "March";
                    return month;
                case 4:
                    month = "April";
                    return month;
                case 5:
                    month = "May";
                    return month;
                case 6:
                    month = "June";
                    return month;
                case 7:
                    month = "July";
                    return month;
                case 8:
                    month = "August";
                    return month;
                case 9:
                    month = "September";
                    return month;
                case 10:
                    month = "October";
                    return month;
                case 11:
                    month = "November";
                    return month;
                case 12:
                    month = "December";
                    return month;
            }
            return "no value";
        }
    }



