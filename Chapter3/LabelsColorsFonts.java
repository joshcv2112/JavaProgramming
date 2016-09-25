import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LabelsColorsFonts extends JFrame
{
    private JLabel javaL, programmingL;
    private JButton colorB, fontB;
    private ColorButtonHandler cHandler;
    private FontButtonHandler fHandler;
    private Container pane;
    private static final int WIDTH = 350;
    private static final int HEIGHT = 100;

    public LabelsColorsFonts()
    {
        javaL = new JLabel("Java", SwingConstants.CENTER);
        programmingL = new JLabel("Programming", SwingConstants.CENTER);

        colorB = new JButton("Color");
        cHandler = new ColorButtonHandler();
        colorB.addActionListener(cHandler);

        fontB = new JButton("Font");
        fHandler = new FontButtonHandler();
        fontB.addActionListener(fHandler);

        setTitle("Labels, fonts, and colors demonstration");

        pane = getContentPane();
        pane.setLayout(new GridLayout(2, 2));

        pane.add(javaL);
        pane.add(programmingL);
        pane.add(colorB);
        pane.add(fontB);

        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private class ColorButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            javaL.setForeground(Color.red);
            programmingL.setForeground(Color.blue);

            pane.setBackground(Color.cyan);

            colorB.setBackground(Color.orange);
            fontB.setBackground(Color.orange);
        }
    }

    private class FontButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            javaL.setFont(new Font("Arial", Font.BOLD, 24));
            programmingL.setFont(new Font("Arial", Font.BOLD, 24));
        }
    }

    public static void main(String[] args)
    {
        LabelsColorsFonts demoObject = new LabelsColorsFonts();
    }
}
