//***********************************************************************
// Author: Joshua Vaughan
// Chapter 4
// Programming Exercise 1
// Command line calculator program.
//***********************************************************************

import java.util.*;

public class Exercise9
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        int x1, x2, ans = 0;
        char operation;

        System.out.println("Program only supports integer arithmetic for now.");
        System.out.println("Enter your calculation.");
        x1 = console.nextInt();
        operation = console.next().charAt(0);
        x2 = console.nextInt();

        if (operation == '+')
            ans = x1 + x2;
        else if (operation == '-')
            ans = x1 - x2;
        else if (operation == '*')
            ans = x1 * x2;
        else if (operation == '/')
        {
            if (x2 == 0)
            {
                System.out.println("ERROR: Cannot divide by zero.");
                System.exit(0);
            }
            else
                ans = x1 / x2;
        }

        System.out.println(x1 + " " + operation + " " + x2 + " = " + ans);
    }
}
