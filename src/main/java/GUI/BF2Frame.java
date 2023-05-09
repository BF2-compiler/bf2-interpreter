package GUI;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import bf2.Board;

import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.net.URL;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

/**
 * A class to represent a main frame in the GUI
 */
public class BF2Frame extends JFrame {

    Dimension dimensions = new Dimension(300, 300);
    Font smallFont = new Font("Monospaced", Font.PLAIN, 12);
    Font mediumFont = new Font("Monospaced", Font.PLAIN, 16);
    Font bigFont = new Font("Monospaced", Font.PLAIN, 20);

    public BF2Frame() {

        // Default setup for the frame
        this.setTitle("BF^2");

        // TODO: Fix logo problem
        Image icon = Toolkit.getDefaultToolkit().getImage("img/brain.png");
        this.setIconImage(icon);

        this.addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
                // small font
                if (getSize().width <= 500 && getSize().height <= 500) {
                    setFont(smallFont);
                }
                // medium font
                if (getSize().width > 500 && getSize().width < 700 && getSize().height > 500 && getSize().height < 700) {
                    setFont(mediumFont);
                }
                // big font
                if (getSize().height >= 700 && getSize().width >= 700) {
                    setFont(bigFont);
                }
            }
        });

        this.setMinimumSize(dimensions);
        this.setResizable(true);

        this.getContentPane();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
    * This function is used to add a number of panels of type {@code BF2ColorPanel} to the main frame
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
     * This function is used to add a number of panels of type {@code BF2TextPanel} to the main frame
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
     * This function is used to add one {@code JTextArea} to the main frame and set it to be non-editable
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
}
