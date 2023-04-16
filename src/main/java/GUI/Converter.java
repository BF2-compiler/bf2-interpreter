package GUI;

import java.awt.Color;

public class Converter {

    int SIZE = 8;
    Color[] colors;
    
    public Converter() {
        this.colors = generateColorList();
    }

    public static Color[] generateColorList() {

        int numColors = 255;
        Color[] colors = new Color[numColors];
        for (int i = 0; i < numColors; i++) {
            float hue = (float)i / (float)numColors;
            colors[i] = Color.getHSBColor(hue, 1.0f, 1.0f);
        }

        return colors;
    }

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
                color_data[row][col] = colors[data[row][col]];
            }
        }

        return color_data;
    }
}
