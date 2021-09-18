/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Samontanez
 */

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

package exercise23;

import java.util.Scanner;

public class Solution23 {
    private char key;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Solution23 sol23 = new Solution23();

        sol23.key = sol23.readValueFromUser("Is the car silent when you turn the key? (Y/N) ");
        System.out.println(sol23.switchMain(sol23.key));

    }

    private char readValueFromUser(String prompt) {
        System.out.print(prompt);
        return scanner.next().charAt(0);
    }

    private String switchMain(char input) {
        Solution23 sol23 = new Solution23();
        char terminal;
        char clickNoise;
        char engine;
        char fuelInjector;

        switch (input) {
            case 'Y':
            case 'y':
                terminal = sol23.readValueFromUser("Are the battery terminals corroded? (Y/N) ");
                return sol23.switchLastLevel(terminal,"Clean terminals and try starting again.",
                        "Replace the cables and try again.");

            case 'N':
            case 'n':
                clickNoise = sol23.readValueFromUser("Does the car make a clicking noise? (Y/N) ");
                switch (clickNoise) {
                    case 'Y':
                    case 'y':
                        return "Check the spark plug connections.";

                    case 'N':
                    case 'n':
                        engine = sol23.readValueFromUser("Does the engine start and die? (Y/N) ");
                        switch (engine) {
                            case 'Y':
                            case 'y':
                                fuelInjector = sol23.readValueFromUser("Does your car have fuel injection? (Y/N) ");
                                return sol23.switchLastLevel(fuelInjector,"Get it in for service.",
                                        "Check to ensure the choke is opening and closing.");
                            case 'N':
                            case 'n':
                                return "This should not be possible.";

                            default:
                                return "That is not a valid entry, try again.";
                        }
                }
            default:
                return "That is not a valid entry, try again.";
        }
    }

    private String switchLastLevel(char input, String promptYes, String promptNo) {
        String prompt;
        switch (input) {
            case 'Y':
            case 'y':
                prompt = promptYes;
                break;
            case 'N':
            case 'n':
                prompt = promptNo;
                break;
            default:
                return "Invalid input, try again.";
        }
        return prompt;
    }
}

