//******************************************************************
// Authors: Malik/Burton
// 
// This class extends the class JPanel and uses the class Graphics
// to draw a chair and a table.
//******************************************************************

import java.awt.*;
import javax.swing.*;

public class ChairAndTable extends JPanel
{
    public ChairAndTable()
    {
        setBackground(Color.yellow);
        setPreferredSize(new Dimension(250, 200));
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        g.setColor(Color.red);

        g.drawLine(50, 60, 60, 100);
        g.drawLine(60, 100, 95, 100);
        g.drawLine(60, 100, 40, 140);
        g.drawLine(95, 100, 110, 140);

        g.setColor(Color.green);

        g.drawLine(120, 80, 160, 80);
        g.drawLine(120, 80, 140, 120);
        g.drawLine(160, 80, 180, 120);
        g.drawLine(140, 120, 180, 120);

        g.setColor(Color.blue);

        g.drawLine(120, 80, 120, 100);
        g.drawLine(140, 120, 140, 140);
        g.drawLine(180, 120, 180, 140);
    }
}