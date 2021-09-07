/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Eric Gass
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        String principle = scan.nextLine();
        System.out.print("Enter the rate of interest: ");
        String rateInterest = scan.nextLine();
        System.out.print("Enter the number of years: ");
        String numYears = scan.nextLine();

        double princ = Double.parseDouble(principle);
        double roi = Double.parseDouble(rateInterest);
        int years = Integer.parseInt(numYears);
        double investment = princ*(1+((roi*.01)*years));

        String invest= String.format("$%.2f",investment);
        System.out.print(String.format("After %d years at %.1f%%, the investment will be worth %s",years,roi,invest));
    }
}