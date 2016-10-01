//***********************************************************************
// Author: Joshua Vaughan
// Chapter 4
// Programming Exercise 1
// Program inputs one number from user and prints if it is positive,
// negative, or equal to zero.
//***********************************************************************

import java.util.*;

public class Exercise1
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Input a number: ");
        double num = console.nextDouble();

        String str;

        if (num > 0)
            str = "Number is positive.\n";
        else if (num == 0)
            str = "Number is zero.\n";
        else
            str = "Number is negative.\n";
        
        System.out.println(str);
    }
}
