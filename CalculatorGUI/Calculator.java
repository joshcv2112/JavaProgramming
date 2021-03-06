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
        textField.setFont(new Font("SansSerif", Font.BOLD, 20));
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
        private String firstNumStr, secondNumStr;
        private boolean isSecond = false;
        private boolean firstHasDecimal = false;
        private boolean secondHasDecimal = false;
        private char operation;

        private void arithmetic(String currentNum, String op)
        {
            if (!isSecond)
            {
                firstNumStr = textField.getText();
                operation = op.charAt(0);
                isSecond = !isSecond;
                textField.setText("");
            }
            else
            {
                firstNumStr += currentNum;
                textField.setText("");
            }
        }

        private void calculate(String currentNum)
        {
            if (isSecond)
            {
                secondNumStr = textField.getText();
                textField.setText("");
                double x1 = Double.parseDouble(firstNumStr);
                double x2 = Double.parseDouble(secondNumStr);
                double answer = 0;

                if (operation == '+')
                {
                    answer = x1 + x2;
                }
                else if (operation == '-')
                {
                    answer = x1 - x2;
                }
                else if (operation == '*')
                {
                    answer = x1 * x2;
                }
                else if (operation == '/')
                {
                    if (x2 == 0)
                        JOptionPane.showMessageDialog(null, "You cannot divide by zero!", 
                            "Division by Zero Error", JOptionPane.ERROR_MESSAGE);
                    else
                        answer = x1 / x2;
                }

                String answerString = String.valueOf(answer);
                textField.setText(answerString);
            }
            else
            {
                // Send warning message saying that there has only been one input
            }
        }

        public void clearText()
        {
            firstNumStr = "";
            secondNumStr = "";
            isSecond = false;
            textField.setText("");
            /*
                Maybe add functionality to click once to only delete second number, 
                click twice to reset entire current calculation.
            */
        }

        public void decimal(String currentNum)
        {
            String num = textField.getText();
            if (!isSecond)
            {
                if (!firstHasDecimal)
                {
                    textField.setText(num + ".");
                    firstHasDecimal = true;
                }
            }
            else
            {
                if (!secondHasDecimal)
                {
                    textField.setText(num + ".");
                    secondHasDecimal = true;   
                }
            }
        }

        public void actionPerformed(ActionEvent e)
        {
            String buttonPressed = e.getActionCommand();
            String currentNum = textField.getText();

            switch(buttonPressed)
            {
                case "0":
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                    textField.setText(currentNum + buttonPressed);
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                    arithmetic(currentNum, buttonPressed);
                    break;
                case ".":
                    decimal(currentNum);
                    break;
                case "=":
                    calculate(currentNum);
                    break;
                case "C":
                    clearText();
                    break;
                case "Exit":
                    System.exit(0);
                    break;
            }
        }
    }
}
