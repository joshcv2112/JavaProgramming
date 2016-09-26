/*
Chapter 3 Programming Exercise 11
Challenge found on page 320 of Programming Exercises text.
This is a modified version of exercise 10.
Author: Joshua Vaughan
Date: Sept 26, 2016
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class AddSubtract extends JFrame
{
    // User input object.
    static Scanner console = new Scanner(System.in);

    // Initialize variables and elements here.
    private int firstNumberLabel;
    private int secondNumberLabel;
    private JLabel label1, label2;
    private JButton incrementButton, decrementButton;
    private DecrementButtonHandler dbHandler;
    private IncrementButtonHandler ibHandler;
    private Container pane;
    private static final int WIDTH = 350;
    private static final int HEIGHT = 100;

    public AddSubtract()
    {
        // Gather user input.
        int x1, x2;
        System.out.println("Enter an integer: ");
        x1 = console.nextInt();
        System.out.println("Enter another integer: ");
        x2 = console.nextInt();

        String str1 = Integer.toString(x1);
        String str2 = Integer.toString(x2);

        label1 = new JLabel("", SwingConstants.CENTER);
        label1.setText(str1);
        label2 = new JLabel("", SwingConstants.CENTER);
        label2.setText(str2);
        
        incrementButton = new JButton("Add");
        ibHandler = new IncrementButtonHandler();
        incrementButton.addActionListener(ibHandler);
        
        decrementButton = new JButton("Subtract");
        dbHandler = new DecrementButtonHandler();
        decrementButton.addActionListener(dbHandler);

        setTitle("Increment/Decrement Program");

        pane = getContentPane();
        pane.setLayout(new GridLayout(2, 2));

        pane.add(label1);
        pane.add(label2);
        pane.add(decrementButton);
        pane.add(incrementButton);

        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private class DecrementButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String num1 = label1.getText();
            String num2 = label2.getText();
            int int1 = Integer.parseInt(num1);
            int int2 = Integer.parseInt(num2);
            int2 = int1 - int2;
            num2 = Integer.toString(int2);
            label2.setText(num2);   
        }
    }

    private class IncrementButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String num1 = label1.getText();
            String num2 = label2.getText();
            int int1 = Integer.parseInt(num1);
            int int2 = Integer.parseInt(num2);
            int1 += int2;
            num1 = Integer.toString(int1);
            label1.setText(num1);
        }
    }

    public static void main(String[] args)
    {
        AddSubtract window = new AddSubtract();
    }
}