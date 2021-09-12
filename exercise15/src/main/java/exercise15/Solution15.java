/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Samontanez
 */

package exercise15;

import java.util.Scanner;

public class Solution15 {
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

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please enter your username: ");
        Scanner userStr = new Scanner(System.in);
        String user = userStr.nextLine();

        System.out.print("What is the password? ");
        Scanner passStr = new Scanner(System.in);
        String password = passStr.nextLine();

        String key = "pa$$word";

        if(password.equals(key)){
            System.out.println("Welcome!");
        }
        else{
            System.out.println("I don't know you.");
        }
    }
}