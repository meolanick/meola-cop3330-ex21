/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Meola
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        int month;
        String String;
        System.out.println( "Please enter the number of the month: " );
        month = scan.nextInt();

        switch (month) {
            case 1:
                String = "The name of the month is January";
                break;

            case 2:
                String = "The name of the month is February";
                break;

            case 3:
                String = "The name of the month is March";
                break;

            case 4:
                String = "The name of the month is April";
                break;

            case 5:
                String = "The name of the month is May";
                break;

            case 6:
                String = "The name of the month is June";
                break;

            case 7:
                String = "The name of the month is July";
                break;

            case 8:
                String = "The name of the month is August";
                break;

            case 9:
                String = "The name of the month is September";
                break;

            case 10:
                String = "The name of the month is October";
                break;

            case 11:
                String = "The name of the month is November";
                break;

            case 12:
                String = "The name of the month is December";
                break;

            default:
                String = "Error.";
                break;

        }

        System.out.println(String);
    }
}
