//******************************************************************
// Authors: Malik/Burton
// 
// This program illustrates how to use the class ChairAndTable
// to draw a chair and a table.
//******************************************************************

import java.awt.*;
import javax.swing.*;

public class ChairAndTableTestProg
{
    public static void main(String[] args)
    {
        JFrame window = new JFrame("Chair and Table");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().add(new ChairAndTable());

        window.pack();
        window.setVisible(true);
    }
}