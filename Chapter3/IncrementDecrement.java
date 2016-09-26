/*
Chapter 3 Programming Exercise 10
Challenge found on page 320 of Programming Exercises text
Author: Joshua Vaughan
Date: Sept 25, 2016
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class IncrementDecrement extends JFrame
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

    public IncrementDecrement()
    {
        // Gather user input.
        int x1, x2;
        System.out.println("Enter an integer: ");
        x1 = console.nextInt();
        System.out.println("Enter another integer: ");
        x2 = console.nextInt();

        String str1 = Integer.toString(x1);
        String str2 = Integer.toString(x2);

        label1 = new JLabel("TEST", SwingConstants.CENTER);
        label1.setText(str1);
        label2 = new JLabel("TEST2", SwingConstants.CENTER);
        label2.setText(str2);
        
        incrementButton = new JButton("Increment");
        ibHandler = new IncrementButtonHandler();
        incrementButton.addActionListener(ibHandler);
        
        decrementButton = new JButton("Decrement");
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
            String s1 = label1.getText();
            int num1 = Integer.parseInt(s1);
            num1 -= 1;
            s1 = Integer.toString(num1);
            label1.setText(s1);   
        }
    }

    private class IncrementButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String s2 = label2.getText();
            int num2 = Integer.parseInt(s2);
            num2 += 1;
            s2 = Integer.toString(num2);
            label2.setText(s2);
        }
    }

    public static void main(String[] args)
    {
        IncrementDecrement window = new IncrementDecrement();
    }
}