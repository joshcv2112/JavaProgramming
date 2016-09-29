//*************************************************************
// Author: Malik/Burton
//
// This program computes and outputs the weekly wages 
// of an employee.
//*************************************************************

import java.util.*;

public class WeeklyWages
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        double wages, rate, hours;

        System.out.println("Hours worked: ");
        hours = console.nextDouble();
        System.out.println();

        System.out.println("Pay rate: ");
        rate = console.nextDouble();
        System.out.println();

        if (hours > 40.0)
            wages = 40.0 * rate + 1.5 * rate * (hours - 40.0);
        else
            wages = hours * rate;

        System.out.printf("Wages: " + "$%.2f %n", wages);
        System.out.println();
    }
}