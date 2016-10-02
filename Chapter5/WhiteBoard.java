//**********************************************************
// Author: Malik/Burton
// 
// This program illustrates how to use a text area. It also
// illustrates how to set the null layout and specify the
// locations of the GUI components to be added.
//**********************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WhiteBoard extends JFrame
{
    private static int WIDTH = 550;
    private static int HEIGHT = 260;

    private int row = 10;
    private int col = 20;

    private JTextField lineTF;
    private JTextArea whiteBoardTA;
    private JButton exitB, appendB;

    private ButtonEventHandler eventHandler;

    public WhiteBoard()
    {
        setTitle("White Board");
        setSize(WIDTH, HEIGHT);

        Container pane = getContentPane();

        lineTF = new JTextField(20);
        whiteBoardTA = new JTextArea(row, col);
        exitB = new JButton("Exit");
        appendB = new JButton("Append");
        eventHandler = new ButtonEventHandler();

        exitB.addActionListener(eventHandler);
        appendB.addActionListener(eventHandler);

        lineTF.setLocation(20, 50);
        whiteBoardTA.setLocation(320, 10);
        appendB.setLocation(230, 50);
        exitB.setLocation(20, 140);

        lineTF.setSize(200, 30);
        whiteBoardTA.setSize(200, 200);
        appendB.setSize(80, 30);
        exitB.setSize(200, 30);

        pane.add(lineTF);
        pane.add(whiteBoardTA);
        pane.add(appendB);
        pane.add(exitB);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private class ButtonEventHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (e.getActionCommand().equals("Appends"))
                whiteBoardTA.append(lineTF.getText());
            else if (e.getActionCommand().equals("Exit"))
                System.exit(0);
        }
    }

    public static void main(String[] args)
    {
        WhiteBoard window = new WhiteBoard();
    }
}