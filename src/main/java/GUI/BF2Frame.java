package GUI;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import bf2.Board;

import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Component;

import javax.swing.Timer;

/**
 * {@summary} A class to represent a main frame in the GUI
 * @param timer - Timer object used to smoothly change font
 * @param fontSize - default to 20
 * @param dimensions - Window dimensions
 */
public class BF2Frame extends JFrame {

    private Timer timer;
    private int fontSize = 20;
    public Dimension dimensions = new Dimension(300, 300);

    public BF2Frame() {

        // Default setup for the frame
        this.setTitle("BF^2");
        this.setMinimumSize(dimensions);
        this.setResizable(true);

        // TODO: Fix logo problem
        Image icon = Toolkit.getDefaultToolkit().getImage("./img/brain.png");
        this.setIconImage(icon);

        // Listens for window resize
        this.addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
                var dim = Math.min(getSize().height, getSize().width);
                int newFontSize = dim / 20;

                if (newFontSize != fontSize) {
                    animateFontSizeChange(newFontSize);
                }
            }
        });

        this.getContentPane();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
    * {@summary} This function is used to add a number of panels of type {@code BF2ColorPanel} to the main frame
    * @return void
    * @see BF2ColorPanel
    */
    public void print_as_colors() {

        // Create new instance of Converter object
        Converter converter = new Converter();

        // Convert data to colors using converter object
        var colors = converter.convert_to_color();
        this.setLayout(new GridLayout(Board.SIZE_Y, Board.SIZE_X, 0, 0));

        // Add shapes to the frame
        for (int i = 0; i < Board.SIZE_Y; i++) {
            for (int j = 0; j < Board.SIZE_X; j++) {
                BF2ColorPanel panel = new BF2ColorPanel(colors[i][j]);
                this.add(panel);
            }
        }
    }

    /**
     * {@summary} This function is used to add a number of panels of type {@code BF2TextPanel} to the main frame
     * @return void
     * @see BF2TextPanel
     */
    public void print_as_int() {

        this.setLayout(new GridLayout(Board.SIZE_Y, Board.SIZE_X, 0, 0));

        for (int i = 0; i < Board.SIZE_Y; i++) {
            for (int j = 0; j < Board.SIZE_X; j++) {
                BF2TextPanel panel = new BF2TextPanel(Board.mainBoard[i][j].getValue_());
                this.add(panel);
            }
        }
    }

    /**
     * {@summary} This function is used to add one {@code JTextArea} to the main frame and set it to be non-editable
     * @return void
     * @see JTextArea
     */
    public void print_as_string() {

        // Initialize converter object
        Converter converter = new Converter();

        // Convert board to string
        var text = converter.convert_to_string();

        // Add new JTextArea
        this.add(new JTextArea(text) {
            @Override
            public void setEditable(boolean arg0) {
                super.setEditable(false);
            }
        });
    }
    /**
     * {@summary} Function to set new font size in all the components of the frame
     * @param newFontSize - size of font after resize calculation
     * @return None
     */
    private void animateFontSizeChange(int newFontSize) {
        
        if (timer != null && timer.isRunning()) {
            timer.stop();
        }

        int diff = newFontSize - fontSize;
        int sign = Integer.signum(diff);
        int duration = Math.abs(diff) / 10;
        final int[] t = { 0 };

        Component[] components = this.getContentPane().getComponents();
        
        timer = new Timer(10, e -> {
            double x = (double)t[0] / duration;
            double y = 2 * x - x * x;
            int size = fontSize + (int)(sign * Math.round(diff * y));

            for (Component c : components) {
                c.setFont(new Font("Monospaced", Font.PLAIN, size));
            }

            if (t[0]++ >= duration) {
                timer.stop();
                fontSize = newFontSize;
                for (Component c : components) {
                    c.setFont(new Font("Monospaced", Font.PLAIN, newFontSize));
                }
            }
        });

        timer.start();
    }
}
