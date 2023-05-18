package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JPanel;

/**
 * A class to represent color panel for further display in the main frame
 * @see JPanel
 */
public class BF2ColorPanel extends JPanel {

    Color color;

    public BF2ColorPanel(Color c) {
        this.color = c;
        this.setBackground(c);
    }

    public BF2ColorPanel(){}
}
