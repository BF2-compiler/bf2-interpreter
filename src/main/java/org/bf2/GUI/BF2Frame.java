package org.bf2.GUI;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import java.awt.GridLayout;
import java.awt.Dimension;


public class BF2Frame extends JFrame {

    Dimension dimensions = new Dimension(300, 300);
    
    public BF2Frame() {
        
        // Default setup for the frame
        this.setTitle("BF^2 COMPILER");
        // TODO: img icon

        this.setMinimumSize(dimensions);
        this.setResizable(false);

        this.getContentPane();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void print_as_colors(int[][] data) {

        // Create new instance of Converter object
        Converter converter = new Converter();

        // Convert data to colors using converter object
        var colors = converter.convert_to_color(data);
        this.setLayout(new GridLayout(converter.SIZE, converter.SIZE, 0, 0));


        // Add shapes to the frame
        for(int i = 0; i < converter.SIZE; i++) {
            for(int j = 0; j < converter.SIZE; j++) {
                BF2ColorPanel panel = new BF2ColorPanel(colors[i][j]);
                this.add(panel);
            }
        }
    }

    public void print_as_int(int[][] data) {
        Converter converter = new Converter();

        String[][] ints = converter.convert_to_int(data);
        this.setLayout(new GridLayout(converter.SIZE, converter.SIZE, 0, 0));


        for(int i = 0; i < converter.SIZE; i++) {
            for(int j = 0; j < converter.SIZE; j++) {    
                BF2TextPanel panel = new BF2TextPanel(ints[i][j]);
                this.add(panel);
            }
        }
    }

    public void print_as_string(int[][] data) {
        Converter converter = new Converter();

        var text = converter.convert_to_string(data);

        this.add(new JTextArea(text){
            @Override
            public void setEditable(boolean arg0) {
                super.setEditable(false);
            }
        });
    }
}
