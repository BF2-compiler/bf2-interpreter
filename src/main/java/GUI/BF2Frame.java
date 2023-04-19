package GUI;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import bf2.Board;

import java.awt.GridLayout;
import java.net.URL;
import java.awt.Dimension;

/**
 * A class to represent a main frame in the GUI
 */
public class BF2Frame extends JFrame {

    Dimension dimensions = new Dimension(300, 300);

    public BF2Frame() {

        // Default setup for the frame
        this.setTitle("BF^2");

        // TODO: Fix logo problem
        // URL iconURL = getClass().getResource("img/brain.png");
        // ImageIcon icon = new ImageIcon(iconURL);
        // this.setIconImage(icon.getImage());

        this.setMinimumSize(dimensions);
        this.setResizable(true);

        this.getContentPane();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
    * This function is used to add a number of panels of type {@code BF2ColorPanel} to the main frame
    * @return
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
     * @return
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
     * @return
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
