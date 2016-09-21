import java.io.*;
import java.util.*;

public class StudentGrade
{
    public static void main(String[] args) throws FileNotFoundException
    {
        double test1, test2, test3, test4, test5;
        double average;
        String firstName;
        String lastName;

        Scanner inFile = new Scanner(new FileReader("test.txt"));

        PrintWriter outFile = new PrintWriter("testavg.out");

        firstName = inFile.next();
        lastName = inFile.next();

        outFile.println("Student Name:" + firstName + " " + lastName);

        test1 = inFile.nextDouble();
        test2 = inFile.nextDouble();
        test3 = inFile.nextDouble();
        test4 = inFile.nextDouble();
        test5 = inFile.nextDouble();

        outFile.printf("Test scores: %5.2f %5.2f %5.2f %5.2f %5.2f %n", test1, test2, test3, test4, test5);

        average = (test1 + test2 + test3 + test4 + test5) / 5.0;
        outFile.printf("Average test score: %5.2f %n", average);

        inFile.close();
        outFile.close();
    }
}