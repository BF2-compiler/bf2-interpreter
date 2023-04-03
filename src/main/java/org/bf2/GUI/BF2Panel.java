package org.bf2.GUI;
import java.awt.geom.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.TextField;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.text.Utilities;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import org.bf2.GUI.Converter;


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
