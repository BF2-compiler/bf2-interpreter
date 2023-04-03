package org.bf2.GUI;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.TextField;


public class BF2Frame extends JFrame {

    Dimension dimensions = new Dimension(600, 300);
    
    public BF2Frame() {
        
        // Default setup for the frame
        this.setTitle("BF^2 COMPILER");

        this.setMinimumSize(dimensions);
        this.setResizable(false);

        this.setLayout(new GridLayout());
        this.getContentPane();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void print_as_colors(int[][] data) {

        // Create new instance of Converter object
        Converter converter = new Converter();

        // Convert data to colors using converter object
        var colors = converter.convert_to_color(data);

        // Add shapes to the frame
        for(int i = 0; i < converter.SIZE; i++) {
            for(int j = 0; j < converter.SIZE; j++) {
                BF2Panel panel = new BF2Panel(colors[i][j]);
                this.add(panel);
            }
        }
    }

    public void print_as_int(int[][] data) {
        Converter converter = new Converter();

        var ints = converter.convert_to_int(data);

        this.add(new TextField(ints));
    }

    public void print_as_string(int[][] data) {
        Converter converter = new Converter();

        var text = converter.convert_to_string(data);

        this.add(new TextField(text));
    }
}
