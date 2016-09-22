import javax.swing.*;

public class Example2_16
{
    public static void main(String[] args)
    {
        String str;
        int num1 = 45;
        int num2 = 56;
        int sum;

        str = "The two numbers are: " + num1 + " and " + num2 + "\n";
        sum = num1 + num2;

        str = str + "The sum of the numbers is: " + sum + "\n";
        str = str + "That is all for now!";

        JOptionPane.showMessageDialog(null, str, "Summing Numbers", JOptionPane.ERROR_MESSAGE);
    }
}