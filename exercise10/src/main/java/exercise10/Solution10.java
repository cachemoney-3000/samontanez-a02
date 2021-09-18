/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Samontanez
 */

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

package exercise10;

import java.text.NumberFormat;
import java.util.Scanner;

public class Solution10 {
    private int item1;
    private int quantityItem1;
    private int item2;
    private int quantityItem2;
    private int item3;
    private int quantityItem3;
    private final double taxRate = 0.055;

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Solution10 sol10 = new Solution10();

        sol10.item1 = sol10.readValueFromUser("Enter the price of item 1: ");
        sol10.quantityItem1 = sol10.readValueFromUser("Enter the quantity of item 1: ");
        sol10.item2 = sol10.readValueFromUser("Enter the price of item 2: ");
        sol10.quantityItem2 = sol10.readValueFromUser("Enter the quantity of item 2: ");
        sol10.item3 = sol10.readValueFromUser("Enter the price of item 3: ");
        sol10.quantityItem3 = sol10.readValueFromUser("Enter the quantity of item 3: ");

        double subtotal = sol10.subtotal(sol10.item1, sol10.quantityItem1, sol10.item2, sol10.quantityItem2,
                sol10.item3, sol10.quantityItem3);
        double taxRate = sol10.taxRate;
        double tax = sol10.tax(subtotal, taxRate);
        double totalPrice = sol10.totalPrice(subtotal, tax);

        System.out.println(sol10.output(subtotal, tax, totalPrice));
    }

    private int readValueFromUser(String prompt){
        System.out.print(prompt);
        return scanner.nextInt();
    }

    private double subtotal(int item1, int qtt1, int item2, int qtt2, int item3, int qtt3){
        return (item1 * qtt1) + (item2 * qtt2) + (item3 * qtt3);
    }

    private double tax(double subtotal, double taxRate){
        return subtotal * taxRate;
    }

    private double totalPrice(double subtotal, double tax){
        return subtotal + tax;
    }

    private String output(double subtotal, double tax, double totalPrice){
        NumberFormat dollar = NumberFormat.getCurrencyInstance();

        return "Subtotal: " + dollar.format(subtotal) + "\nTax: " + dollar.format(tax) +
                "\nTotal: " + dollar.format(totalPrice);

    }
}
