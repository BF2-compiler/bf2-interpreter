package org.bf2.GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JPanel;


public class BF2Panel extends JPanel {

    Color color;

    public BF2Panel(Color c) {
        this.color = c;
    }

    public BF2Panel(){}

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        Rectangle rectangle = new Rectangle(new Dimension(20, 20));

        g2d.setPaint(this.color);
        g2d.fill(rectangle);
        g2d.draw(new Rectangle(new Dimension(20,20)));

    }
}
