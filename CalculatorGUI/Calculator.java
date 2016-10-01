//**********************************************************
// Author: Joshua Vaughan
//
// Simple GUI calculator program.
//**********************************************************

import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame
{
    private JTextField textField;
    private JButton addB, subB, multB, divB, equalsB, dotB;
    private JButton oneB, twoB, threeB, fourB, fiveB,
                    sixB, sevenB, eightB, nineB, zeroB;
    private JButton clearB, exitB;

    private Container pane;
    private static final int WIDTH = 300;
    private static final int HEIGHT = 500;

    public Calculator()
    {
        // START panel1 setup
        textField = new JTextField("", 60);
        textField.setHorizontalAlignment(JTextField.CENTER);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(1, 1));
        panel1.add(textField);
        // END Panel1 setup.

        // START Panel 2 setup.
        oneB = new JButton("1");
        twoB = new JButton("2");
        threeB = new JButton("3");
        addB = new JButton("+");

        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(1, 4));
        panel2.add(oneB);
        panel2.add(twoB);
        panel2.add(threeB);
        panel2.add(addB);
        // END Panel 2 setup.

        // START Panel 3 setup.
        fourB = new JButton("4");
        fiveB = new JButton("5");
        sixB = new JButton("6");
        subB = new JButton("-");

        JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayout(1, 4));
        panel3.add(fourB);
        panel3.add(fiveB);
        panel3.add(sixB);
        panel3.add(subB);
        // END Panel 3 setup.

        // START Panel 4 setup.
        sevenB = new JButton("7");
        eightB = new JButton("8");
        nineB = new JButton("9");
        multB = new JButton("*");

        JPanel panel4 = new JPanel();
        panel4.setLayout(new GridLayout(1, 4));
        panel4.add(sevenB);
        panel4.add(eightB);
        panel4.add(nineB);
        panel4.add(multB);
        // END Panel 4 setup.

        // START Panel 5 setup.
        zeroB = new JButton("0");
        dotB = new JButton(".");
        equalsB = new JButton("=");
        divB = new JButton("/");

        JPanel panel5 = new JPanel();
        panel5.setLayout(new GridLayout(1, 4));
        panel5.add(zeroB);
        panel5.add(dotB);
        panel5.add(equalsB);
        panel5.add(divB);
        // END Panel 5 setup.

        // START Panel 6 setup.
        clearB = new JButton("C");
        exitB = new JButton("Exit");

        JPanel panel6 = new JPanel();
        panel6.setLayout(new GridLayout(1, 2));
        panel6.add(clearB);
        panel6.add(exitB);
        // END Panel 6 setup.

        pane = getContentPane();
        pane.setLayout(new GridLayout(6, 1));
        pane.add(panel1);
        pane.add(panel2);
        pane.add(panel3);
        pane.add(panel4);
        pane.add(panel5);
        pane.add(panel6);

        setTitle("Calculator");
        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {

        }
    }
}
