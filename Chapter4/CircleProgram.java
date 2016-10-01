//*****************************************************************
// Authors: Malik/Burton
// 
// Given the radius and width of a circle, this program determines
// its area and circumference, and GUI to display the results.
//*****************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CircleProgram extends JFrame
{
    private JLabel radiusL, areaL, circumferenceL;
    private JTextField radiusTF, areaTF, circumferenceTF;
    private JButton calculateB, exitB;
    private Container pane;

    private CalculateButtonHandler cbHandler;
    private ExitButtonHandler ebHandler;

    private static final int WIDTH = 325;
    private static final int HEIGHT = 150; 

    public CircleProgram()
    {
        radiusL = new JLabel("Enter the radius: ", SwingConstants.RIGHT);
        areaL = new JLabel("Area: ", SwingConstants.RIGHT);
        circumferenceL = new JLabel("Circumference: ", SwingConstants.RIGHT);

        radiusTF = new JTextField(10);
        areaTF = new JTextField(10);
        circumferenceTF = new JTextField(10);

        calculateB = new JButton("Calculate"); 
        cbHandler = new CalculateButtonHandler();
        calculateB.addActionListener(cbHandler);

        exitB = new JButton("Exit");
        ebHandler = new ExitButtonHandler();
        exitB.addActionListener(ebHandler);

        setTitle("Area and Circumference of a Circle");

        pane = getContentPane();

        pane.setLayout(new GridLayout(4, 2));

        pane.add(radiusL);
        pane.add(radiusTF);
        pane.add(areaL);
        pane.add(areaTF);
        pane.add(circumferenceL);
        pane.add(circumferenceTF);
        pane.add(calculateB);
        pane.add(exitB);

        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private class CalculateButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double radius, area, circumference;

            radius = Double.parseDouble(radiusTF.getText());
            area = Math.PI * radius * radius;
            circumference = 2 * Math.PI * radius;

            areaTF.setText("" + String.format("%.2f%n", area));
            circumferenceTF.setText("" + String.format("%.2f%n", circumference));
        }
    }

    private class ExitButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }

    public static void main(String[] args)
    {
        CircleProgram cirObject = new CircleProgram();
    }
}
