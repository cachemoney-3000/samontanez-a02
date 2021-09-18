/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Samontanez
 */

/*
    Print "Enter username: "
    scanner takes the input from the user

    Print "What is your password? "
    scanner takes the input from the user
    'password' string stores the input

    string 'key' = stores the string "pa$$word"

    if the password is equals to the key {
        printf("Welcome")
    }

    else{
    Print "I don't know you."
    }
     */

package exercise15;

import java.util.Scanner;

public class Solution15 {
    private String user;
    private String password;

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Solution15 sol15 = new Solution15();

        sol15.user = sol15.readValueFromUser("Please enter your username: ");
        sol15.password = sol15.readValueFromUser("What is the password? ");

        System.out.println(sol15.output(sol15.password, sol15.user));

    }

    private String readValueFromUser(String prompt){
        System.out.print(prompt);
        return scanner.nextLine();
    }

    private String output(String password, String user){
        String key = "pa$$word";

        if(password.equals(key)){
            return "Nice to see you, " + user + "!";
        }
        else{
            return "I don't know you.";
        }
    }
}