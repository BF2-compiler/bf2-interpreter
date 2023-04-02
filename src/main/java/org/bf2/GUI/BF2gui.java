package org.bf2.GUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import org.bf2.GUI.Converter;


public class BF2gui extends JPanel {

    Dimension dimensions = new Dimension(1000, 500);

    public BF2gui() {

        // Window dimensions here
        setMinimumSize(dimensions);
        setMaximumSize(dimensions);
        setPreferredSize(dimensions);
    }

    public static JLabel createString(String text) {
        JLabel textField = new JLabel(text);
        
        return textField;
    }


    public static void main(String[] args) {

        int[][] hw = {
            {72, 101, 108, 108, 111, 32, 0, 0},
            {119, 111, 114, 108, 100, 33, 10, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0}
        };

        Converter converter = new Converter();

        JFrame frame = new JFrame("BF^2");
        frame.getContentPane();

        BF2gui bf2gui = new BF2gui();
        frame.add(bf2gui);
        frame.add(createString(converter.convert_to_string(hw)));

        // Basic setup
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("BF^2 COMPILER");
        frame.pack();
        frame.setVisible(true);

    }
    
}
