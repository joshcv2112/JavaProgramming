/*
Chapter 3 Programming Exercise 9
Challenge found on page 229 of Java Programming text.
Author: Joshua Vaughan
Date: Sept, 27 2016
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class RandomNumberGUI extends JFrame
{
    static Scanner console = new Scanner(System.in);

    private JLabel label;
    private JButton button;
    private ButtonHandler handler;
    private Container pane;
    private static final int WIDTH = 350;
    private static final int HEIGHT = 100;

    public RandomNumberGUI()
    {
        double num = Math.random();

        label = new JLabel("", SwingConstants.CENTER);
        label.setText(Double.toString(num));

        button = new JButton("Random Number");
        handler = new ButtonHandler();
        button.addActionListener(handler);

        pane = getContentPane();
        pane.setLayout(new GridLayout(1, 2));

        pane.add(label);
        pane.add(button);

        setTitle("Random Number Generator");
        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            label.setText(Double.toString(Math.random()));
        }
    }

    public static void main(String[] args)
    {
        RandomNumberGUI x = new RandomNumberGUI();
    }
}
