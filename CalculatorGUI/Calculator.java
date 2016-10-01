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
    private JPanel panel1, panel2, panel3, panel4, panel5, panel6;
    private JTextField textField;
    private JButton addB, subB, multB, divB, equalsB, dotB;
    private JButton[] numberButtons = new JButton[10];
    private JButton clearB, exitB;
    private ButtonHandler buttonHandler;

    private Container pane;
    private static final int WIDTH = 300;
    private static final int HEIGHT = 500;

    // START constructor functions
    private void setButtons()
    {
        for (int i = 0; i < 10; i++)
            numberButtons[i] = new JButton(Integer.toString(i));
        
        addB = new JButton("+");
        subB = new JButton("-");
        multB = new JButton("*");
        divB = new JButton("/");
        equalsB = new JButton("=");
        dotB = new JButton(".");
        clearB = new JButton("C");
        exitB = new JButton("Exit");
    }

    private void setButtonsHandler()
    {
        buttonHandler = new ButtonHandler();

        for (int i = 0; i < 10; i++)
            numberButtons[i].addActionListener(buttonHandler);
        
        addB.addActionListener(buttonHandler);
        subB.addActionListener(buttonHandler);
        multB.addActionListener(buttonHandler);
        divB.addActionListener(buttonHandler);
        dotB.addActionListener(buttonHandler);
        equalsB.addActionListener(buttonHandler);
        clearB.addActionListener(buttonHandler);
        exitB.addActionListener(buttonHandler);
    }

    private void setTextField()
    {
        textField = new JTextField("", 60);
        textField.setHorizontalAlignment(JTextField.CENTER);
    }

    private void setPanels()
    {
        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(1, 1));
        panel1.add(textField);
        // END Panel1 setup.

        // START Panel 2 setup.
        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(1, 4));
        panel2.add(numberButtons[1]);
        panel2.add(numberButtons[2]);
        panel2.add(numberButtons[3]);
        panel2.add(addB);
        // END Panel 2 setup.

        // START Panel 3 setup.
        panel3 = new JPanel();
        panel3.setLayout(new GridLayout(1, 4));
        panel3.add(numberButtons[4]);
        panel3.add(numberButtons[5]);
        panel3.add(numberButtons[6]);
        panel3.add(subB);
        // END Panel 3 setup.

        // START Panel 4 setup.
        panel4 = new JPanel();
        panel4.setLayout(new GridLayout(1, 4));
        panel4.add(numberButtons[7]);
        panel4.add(numberButtons[8]);
        panel4.add(numberButtons[9]);
        panel4.add(multB);
        // END Panel 4 setup.

        // START Panel 5 setup.
        panel5 = new JPanel();
        panel5.setLayout(new GridLayout(1, 4));
        panel5.add(numberButtons[0]);
        panel5.add(dotB);
        panel5.add(equalsB);
        panel5.add(divB);
        // END Panel 5 setup.

        // START Panel 6 setup.
        panel6 = new JPanel();
        panel6.setLayout(new GridLayout(1, 2));
        panel6.add(clearB);
        panel6.add(exitB);
        // END Panel 6 setup.
    }

    private void setPane()
    {
        pane = getContentPane();
        pane.setLayout(new GridLayout(6, 1));
        pane.add(panel1);
        pane.add(panel2);
        pane.add(panel3);
        pane.add(panel4);
        pane.add(panel5);
        pane.add(panel6);
    }

    private void setWindowSettings()
    {
        setTitle("Calculator");
        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    // END constructor functions
    
    public Calculator()
    {
        setButtons();
        setButtonsHandler();
        setTextField();
        setPanels();
        setPane();
        setWindowSettings();
    }

    private class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String str = e.getActionCommand();

            if (str.equals("Exit"))
                System.exit(0);
        }
    }
}
