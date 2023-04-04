package org.bf2.GUI;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.TextField;


public class BF2Frame extends JFrame {

    Dimension dimensions = new Dimension(600, 300);
    
    public BF2Frame() {
        
        // Default setup for the frame
        this.setTitle("BF^2 COMPILER");
        // this.setIconImage(getIconImage());

        this.setMinimumSize(dimensions);
        this.setResizable(false);

        this.setLayout(new BorderLayout());
        this.getContentPane();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void print_as_colors(int[][] data) {

        // Create new instance of Converter object
        Converter converter = new Converter();
        JLabel break_line = new JLabel("<br>");

        // Convert data to colors using converter object
        var colors = converter.convert_to_color(data);

        // Add shapes to the frame
        for(int i = 0; i < converter.SIZE; i++) {
            for(int j = 0; j < converter.SIZE; j++) {
                BF2Panel panel = new BF2Panel(colors[i][j]);
                this.add(panel);
            }
            this.add(break_line);
        }
    }

    public void print_as_int(int[][] data) {
        Converter converter = new Converter();

        var ints = converter.convert_to_int(data);

        this.add(new JTextArea(ints){
            @Override
            public void setEditable(boolean arg0) {
                super.setEditable(false);
            }
        });
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
