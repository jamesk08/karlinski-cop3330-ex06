/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Karlinski
 */

package org.example;

import java.text.MessageFormat;
import java.time.Year;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        System.out.print("What is your current age? ");
        Scanner scanner = new Scanner(System.in);
        int currentAge = scanner.nextInt();

        System.out.print("At what age would you like to retire? ");
        int retirementTarget = scanner.nextInt();

        int retirementAge = retirementTarget - currentAge;
        String yearsLeftMessage = MessageFormat.format("You have {0} years left until you can retire.", retirementAge);
        System.out.println(yearsLeftMessage);

        int currentYear = Year.now().getValue();
        String retirementYear = Integer.toString(currentYear + retirementAge);
        String yearToRetireMessage = MessageFormat.format(
            "Its {0}, so you can retire in {1}.",
            Integer.toString(currentYear),
            retirementYear
        );
        System.out.println(yearToRetireMessage);
    }
}