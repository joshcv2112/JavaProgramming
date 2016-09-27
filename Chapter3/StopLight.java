/*
Exercise 12 from Java Programming
Author: Joshua Vaughan
Date: September 26, 2016
GUI with two rows of buttons with three in each row. The top buttons are labeled Red Yellow and Green
Bottom row buttons are labeled Stop, Look and Go
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StopLight extends JFrame
{
    private JButton redB, yellowB, greenB;
    private JButton stopB, lookB, goB;
    private RedButtonHandler rbHandler;
    private YellowButtonHandler ybHandler;
    private GreenButtonHandler gbHandler;
    private StopButtonHandler sbHandler;
    private LookButtonHandler lbHandler;
    private GoButtonHandler gobHandler;

    private Container pane;

    private static final int WIDTH = 350;
    private static final int HEIGHT = 100;

    public StopLight()
    {
        redB = new JButton("Red");
        yellowB = new JButton("Yellow");
        greenB = new JButton("Green");
        stopB = new JButton("Stop");
        lookB = new JButton("Look");
        goB = new JButton("Go");

        rbHandler = new RedButtonHandler();
        ybHandler = new YellowButtonHandler();
        gbHandler = new GreenButtonHandler();
        sbHandler = new StopButtonHandler();
        lbHandler = new LookButtonHandler();
        gobHandler = new GoButtonHandler();

        redB.addActionListener(rbHandler);
        yellowB.addActionListener(ybHandler);
        greenB.addActionListener(gbHandler);
        stopB.addActionListener(sbHandler);
        lookB.addActionListener(lbHandler);
        goB.addActionListener(gobHandler);

        setTitle("Traffic Signal");

        pane = getContentPane();
        pane.setLayout(new GridLayout(2, 3));

        pane.add(redB);
        pane.add(yellowB);
        pane.add(greenB);
        pane.add(stopB);
        pane.add(lookB);
        pane.add(goB);

        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private class RedButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            redB.setBackground(Color.red);
            yellowB.setBackground(Color.white);
            greenB.setBackground(Color.white);
        }
    }

    private class YellowButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            redB.setBackground(Color.white);
            yellowB.setBackground(Color.yellow);
            greenB.setBackground(Color.white);
        }
    }

    private class GreenButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            redB.setBackground(Color.white);
            yellowB.setBackground(Color.white);
            greenB.setBackground(Color.green);
        }
    }

    private class StopButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            redB.setBackground(Color.red);
            yellowB.setBackground(Color.white);
            greenB.setBackground(Color.white);
        }
    }

    private class LookButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            redB.setBackground(Color.white);
            yellowB.setBackground(Color.yellow);
            greenB.setBackground(Color.white);
        }
    }

    private class GoButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            redB.setBackground(Color.white);
            yellowB.setBackground(Color.white);
            greenB.setBackground(Color.green);
        }
    }

    public static void main(String[] args)
    {
        StopLight window = new StopLight();
    }
}