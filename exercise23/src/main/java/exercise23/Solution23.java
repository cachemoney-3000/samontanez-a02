/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Samontanez
 */

package exercise23;

import java.util.Scanner;

public class Solution23 {
    /*
        Print "Is the car silent when you turn the key? (Y/N) "
        scanner takes the input from the user
        'key' stores the input from user

        >if the answer is yes

            Print "Are the battery terminals corroded? (Y?N) "
            scanner takes the input from the user
            'terminal' stores the input from user

            >>if the answer is yes:
                Print "Clean terminals and try starting again.
                end the program.

            >>if the answer is no:
                Print "Replace the cables and try again.
                end the program.


         >if the answer is no:

            Print "Does the car make a slicking noise? (Y?N)"
            scanner takes the input and store it to 'slickNoise'.

                >>if the answer is yes:
                Print "Check the spark plug connections"
                end the program.

                >>if the answer is no:
                    Print "Does the engine start and die? (Y/N)"
                    scanner takes the input and store it to 'engine' string

                    >>>if the answer is yes:
                        Print "Does your car have fuel injection? (Y/N)"
                        scanner takes the input and store it to 'fuelInj'

                        >>>>if the answer is yes:
                            Print "Get it in for service."
                            end the program.

                        >>>>if the answer is no:
                            Print "Check to ensure the choke is opening and closing."
                            end the program.

                     >>>else if the engine starts and don't die:
                        Print "This should not be possible."
                        end the program.
     */

    public static void main(String[] args) {
            System.out.print("Is the car silent when you turn the key? (Y/N) ");
            Scanner keyStr = new Scanner(System.in);
            char key = keyStr.next().charAt(0);

            switch (key) {
                case 'Y':
                case 'y':
                    System.out.print("Are the battery terminals corroded? (Y/N) ");
                    Scanner terminalStr = new Scanner(System.in);
                    char terminal = terminalStr.next().charAt(0);

                    switch (terminal) {
                        case 'Y':
                        case 'y':
                            System.out.println("Clean terminals and try starting again.");
                            break;
                        case 'N':
                        case 'n':
                            System.out.println("Replace the cables and try again.");
                            break;
                    }
                    break;

                case 'N':
                case 'n':
                    System.out.print("Does the car make a slicking noise? (Y/N) ");
                    Scanner slickNoiseStr = new Scanner(System.in);
                    char slickNoise = slickNoiseStr.next().charAt(0);

                    switch (slickNoise) {
                        case 'Y':
                        case 'y':
                            System.out.println("Check the spark plug connections.");
                            break;

                        case 'N':
                        case 'n':
                            System.out.print("Does the engine start and die? (Y/N) ");
                            Scanner engineStr = new Scanner(System.in);
                            char engine = engineStr.next().charAt(0);

                            switch (engine) {
                                case 'Y':
                                case 'y':
                                    System.out.print("Does your car have fuel injection? (Y/N) ");
                                    Scanner fuelInjStr = new Scanner(System.in);
                                    char fuelInj = fuelInjStr.next().charAt(0);

                                    switch (fuelInj) {
                                        case 'Y':
                                        case 'y':
                                            System.out.println("Get it in for service.");
                                            break;

                                        case 'N':
                                        case 'n':
                                            System.out.println("Check to ensure the choke is opening and closing.");
                                            break;
                                    }
                                case 'N':
                                case 'n':
                                    System.out.println("This should not be possible.");
                                    break;
                            }
                    }
                default:
                    System.out.println("That is not a valid entry, try again.");
            }
    }

}

