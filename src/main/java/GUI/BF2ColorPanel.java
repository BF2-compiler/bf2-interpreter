package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JPanel;


public class BF2ColorPanel extends JPanel {

    Color color;

    public BF2ColorPanel(Color c) {
        this.color = c;
    }

    public BF2ColorPanel(){}

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        Rectangle rectangle = new Rectangle(new Dimension(30, 30));

        g2d.setPaint(this.color);
        g2d.fill(rectangle);
        g2d.draw(rectangle);

    }
}
