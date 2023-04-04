package GUI;

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

    public String[][] convert_to_int(int[][] data) {

        String[][] new_data = new String[8][8];

        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                new_data[row][col] = Integer.toString(data[row][col]);
            }
        }

        return new_data;
    }

    public Color[][] convert_to_color(int[][] data) {

        Color[][] color_data = new Color[SIZE][SIZE];

        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                color_data[row][col] = new Color(data[row][col]%255);
            }
        }

        return color_data;
    }
}
