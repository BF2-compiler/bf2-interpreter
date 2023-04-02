package org.bf2.GUI;

import java.awt.Color;

public class Converter {

    int SIZE = 8;
    
    public Converter() {}

    public String convert_to_string(int[][] data) {

        StringBuilder s = new StringBuilder();

        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                s.append((char)data[row][col]);
            }
        }

        return s.toString();
    }

    public Color[][] convert_to_color(int[][] data) {

        Color[][] color_data = new Color[SIZE][SIZE];

        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                color_data[row][col] = new Color(data[row][col]);
            }
        }

        return color_data;
    }
}
