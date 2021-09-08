/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Samontanez
 */

package exercise10;

import java.util.Scanner;

public class Solution10 {
    /*
    print "Enter the price of item 1:"
    scanner takes the input from the user
    'item1' stores the price of the first item.

    print "Enter the quantity of item 1:"
    scanner takes the input from the user
    'qtt1' stores the quantity of the first item.

    print "Enter the price of item 2:"
    scanner takes the input from the user
    'item2' stores the price of the second item.

    print "Enter the quantity of item 2:"
    scanner takes the input from the user
    'qtt2' stores the quantity of the second item.

    print "Enter the price of item 3:"
    scanner takes the input from the user
    'item3' stores the price of the third item.

    print "Enter the quantity of item 3:"
    scanner takes the input from the user
    'qtt3' stores the quantity of the third item.

    'subtotal' stores the calculation of the subtotal price of all the items
    'taxRate' = 5.5%
    'tax' stores the calculation of the tax (tax rate 5.5%)
    'totalPrice' stores the calculation of the price + tax

    print "Subtotal: $<subtotal>"
    print "Tax: $<tax>"
    print "Total: $<totalPrice"
     */

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the price of item 1: ");
        String item1str = scanner.nextLine();
        int item1 = Integer.parseInt(item1str);

        System.out.print("Enter the quantity of item 1: ");
        String qtt1Str = scanner.nextLine();
        int qtt1 = Integer.parseInt(qtt1Str);

        System.out.print("Enter the price of item 2: ");
        String item2str = scanner.nextLine();
        int item2 = Integer.parseInt(item2str);

        System.out.print("Enter the quantity of item 2: ");
        String qtt2Str = scanner.nextLine();
        int qtt2 = Integer.parseInt(qtt2Str);

        System.out.print("Enter the price of item 3: ");
        String item3str = scanner.nextLine();
        int item3 = Integer.parseInt(item3str);

        System.out.print("Enter the quantity of item 3: ");
        String qtt3Str = scanner.nextLine();
        int qtt3 = Integer.parseInt(qtt3Str);

        double subtotal = (item1 * qtt1) + (item2 * qtt2) + (item3 * qtt3);
        double taxRate = 0.055;
        double tax = subtotal * taxRate;
        double totalPrice = subtotal + tax;

        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("Tax: $%.2f\n", tax);
        System.out.printf("Total: $%.2f", totalPrice);
    }
}
