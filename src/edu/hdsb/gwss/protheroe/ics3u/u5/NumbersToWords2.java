/*
 * Name: NumbersToWords.java
 * Date: April 18th, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
 * Description: This program will write out any number from 10-999
 */
package edu.hdsb.gwss.protheroe.ics3u.u5;

import java.util.Scanner;

public class NumbersToWords2 {

    //VARIABLES
    public static int number;
    public static String strNumber;
    public static String tens;
    public static String teens;
    public static String ones;
    public static String hundreds;

    public static void main(String[] args) {
        descriptionAndInput();
        print();
    }
    public static void descriptionAndInput() {
        //DESCRIPTION OF PROGRAM
        System.out.println("Numbers To Words 2");
        System.out.println();
        System.out.println("This program will write out any number from 1-999");
        System.out.println();

        //OBJECTS
        Scanner input = new Scanner(System.in);

        //USER INPUT
        System.out.println("Please enter a number from 1 - 999: ");
        number = input.nextInt();
        strNumber = Integer.toString(number);
        System.out.println();
    }
    public static void ones() {
        //FIGURES OUT ONES VALUE
        switch (strNumber.charAt(strNumber.length() - 1)) {
            case '0':
                ones = " ";
                break;
            case '1':
                ones = "One";
                break;
            case '2':
                ones = "Two";
                break;
            case '3':
                ones = "Three";
                break;
            case '4':
                ones = "Four";
                break;
            case '5':
                ones = "Five";
                break;
            case '6':
                ones = "Six";
                break;
            case '7':
                ones = "Seven";
                break;
            case '8':
                ones = "Eight";
                break;
            case '9':
                ones = "Nine";
                break;
        }
    }
    public static void tens() {
        //FIGURES OUT TEN VALUE
        switch (strNumber.charAt(strNumber.length() - 2)) {
            case '0':
                tens = "";
                break;
            case '2':
                tens = "Twenty ";
                break;
            case '3':
                tens = "Thirty ";
                break;
            case '4':
                tens = "Fourty ";
                break;
            case '5':
                tens = "Fifty ";
                break;
            case '6':
                tens = "Sixty ";
                break;
            case '7':
                tens = "Seventy ";
                break;
            case '8':
                tens = "Eighty ";
                break;
            case '9':
                tens = "Ninety ";
                break;
        }
    }
    public static void teens() {
        //FIGURES OUT TEENS VALUE
        switch (strNumber.charAt(strNumber.length() - 1)) {
            case '0':
                teens = "Ten";
                break;
            case '1':
                teens = "Eleven";
                break;
            case '2':
                teens = "Twelve";
                break;
            case '3':
                teens = "Thirteen";
                break;
            case '4':
                teens = "Fourteen";
                break;
            case '5':
                teens = "Fifteen";
                break;
            case '6':
                teens = "Sixteen";
                break;
            case '7':
                teens = "Seventeen";
                break;
            case '8':
                teens = "Eighteen";
                break;
            case '9':
                teens = "Nineteen";
                break;
        }
    }
    public static void hundreds() {
        //FIGURES OUT HUNDREDS VALUE
        switch (strNumber.charAt(strNumber.length() - 3)) {
            case '1':
                hundreds = "One Hundred ";
                break;
            case '2':
                hundreds = "Two Hundred ";
                break;
            case '3':
                hundreds = "Three Hundred ";
                break;
            case '4':
                hundreds = "Four Hundred ";
                break;
            case '5':
                hundreds = "Five Hundred ";
                break;
            case '6':
                hundreds = "Six Hundred ";
                break;
            case '7':
                hundreds = "Seven Hundred ";
                break;
            case '8':
                hundreds = "Eight Hundred ";
                break;
            case '9':
                hundreds = "Nine Hundred ";
                break;
        }
    }
    public static void print() {
        //PRINTS NUMBER
        if (number <= 9 & number >= 1) {
            ones();
            System.out.println("Your number is: " + ones);
        } else if (number >= 10 & number <= 19) {
            teens();
            System.out.println(teens);
        } else if (number >= 20 & number <= 99) {
            tens();
            ones();
            System.out.println("Your number is: " + tens + ones);
        } else if (number >= 100 & number <= 999) {
            strNumber = Integer.toString(number);
            if (Integer.parseInt(strNumber.substring(strNumber.length() - 2)) >= 10 & Integer.parseInt(strNumber.substring(strNumber.length() - 2)) <= 19) {
                hundreds();
                teens();
                System.out.println("Your number is: " + hundreds + teens);
            } else {
                tens();
                ones();
                hundreds();
                System.out.println("Your number is: " + hundreds + tens + ones);
            }
        } else {
            System.out.println("Invalid");
        }
    }
}
