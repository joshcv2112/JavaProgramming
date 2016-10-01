//**********************************************************
// Author: Malik/Burton
// Modified by: Joshua Vaughan
//
// This program illustrates how to use panels, thext fields
// and buttons in a GUI program. It also illustrates how to
// change the colors and fonts,, and how to handle events.
//**********************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelTextColorAndFonts extends JFrame
{
    private JTextField textTF;
    private JButton textColorB, textFontB, textBackgroundClrB;
    private ButtonEventHandler eventHandler;
    private Container pane;
    private static final int WIDTH = 500;
    private static final int HEIGHT = 100;

    public PanelTextColorAndFonts()
    {
        setTitle("JPanels Demonstrations");

        textTF = new JTextField("", 60);
        textTF.setHorizontalAlignment(JTextField.CENTER);

        eventHandler = new ButtonEventHandler();

        textColorB = new JButton("Text Color");
        textColorB.addActionListener(eventHandler);

        textFontB = new JButton("Text Font");
        textFontB.addActionListener(eventHandler);

        textBackgroundClrB = new JButton("Text Background Color");
        textBackgroundClrB.addActionListener(eventHandler);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(1, 1));
        panel1.add(textTF);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(1, 3));
        panel2.add(textColorB);
        panel2.add(textFontB);
        panel2.add(textBackgroundClrB);

        pane = getContentPane();
        pane.setLayout(new GridLayout(2, 1));

        pane.add(panel1);
        pane.add(panel2);

        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private class ButtonEventHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String str = e.getActionCommand();

            if (str.equals("Text Color"))
                textTF.setForeground(Color.red);
            else if (str.equals("Text Font"))
                textTF.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 20));
            else if (str.equals("Text Background Color"))
                textTF.setBackground(Color.green);
        }
    }

    public static void main(String[] args)
    {
        PanelTextColorAndFonts demoObject = new PanelTextColorAndFonts();
    }
}
