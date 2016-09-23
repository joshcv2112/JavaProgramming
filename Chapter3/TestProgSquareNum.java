import java.util.*;

public class TestProgSquareNum
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        double number;

        System.out.println("The square of 5.0 = " + square(5));

        number = square(8.25);
        System.out.println("number = " + number);
        printNum(number);
        System.out.println();

        System.out.println("Enter a number: ");
        number = console.nextDouble();
        System.out.println();

        printSquare(number);
    }

    public static double square(double num)
    {
        return num * num;
    }

    public static void printNum(double x)
    {
        System.out.println(x);
    }

    public static void printSquare(double x)
    {
        System.out.println("The square of " + x + " = " + square(x));
    }
}