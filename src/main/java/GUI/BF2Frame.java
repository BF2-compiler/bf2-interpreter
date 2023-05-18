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


/**
 * {@summary} A class to represent a main frame in the GUI
 * @param dimensions - Window dimensions
 * @param rows - number of rows in a frame
 * @param cols - number of columns in a frame
 */
public class BF2Frame extends JFrame {

    public Dimension dimensions = new Dimension(300, 300);
    int rows;
    int cols;

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

                int new_width = getWidth() / cols;
                int new_height = getHeight() / rows;

                resizePanels(new_width, new_height);
                animateFontSizeChange(newFontSize);

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
                this.add(new JTextArea(Integer.toString(Board.mainBoard[i][j].getValue_())) {
                    @Override
                    public void setEditable(boolean arg0) {
                        super.setEditable(false);
                    }
                });
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
                super.setWrapStyleWord(true);
                super.setLineWrap(true);
            }
        });
    }

     /**
     * {@summary} Function to set new font size in all the components of the frame
     * @param newFontSize - size of font after resize calculation
     * @return None
     */
    private void animateFontSizeChange(int newFontSize) {

        Component[] components = this.getContentPane().getComponents();  
              
        for (Component c : components) {
            c.setFont(new Font("Monospaced", Font.PLAIN, newFontSize));
        }
    }

    /**
     * {@summary} Function to resize all the components of the frame
     * @param newWidth - window width
     * @param newHeight - window height
     * @return None
     */
    private void resizePanels(int newWidth, int newHeihgt) {
        Component[] components = this.getContentPane().getComponents();

        for (Component c : components) {
            c.setSize(newWidth, newHeihgt);
        }
    }
}