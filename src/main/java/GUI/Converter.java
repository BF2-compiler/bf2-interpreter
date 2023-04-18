package GUI;

import java.awt.Color;

import bf2.Board;

public class Converter {

    Color[] colors;

    /**
     * Default constructor for the class
     * 
     * @return Converter object with initialized color palette
     */
    public Converter() {
        this.colors = generateColorList();
    }

    /**
     * Generates color palette used in other functions
     * 
     * @return color palette as 1-dim array of type Color
     * @see Color
     */
    private Color[] generateColorList() {

        int numColors = 255;
        Color[] colors = new Color[numColors];

        for (int i = 0; i < numColors; i++) {
            float hue = (float) i / (float) numColors;
            colors[i] = Color.getHSBColor(hue, 1.0f, 1.0f);
        }

        return colors;
    }

    /**
     * Create a concatenated string from Board.mainBoard
     * 
     * @return formatted string
     */
    public String convert_to_string() {

        StringBuilder s = new StringBuilder();

        for (int row = 0; row < Board.SIZE_Y; row++) {
            for (int col = 0; col < Board.SIZE_X; col++) {
                s.append((char)Board.mainBoard[row][col].getValue_());
            }
        }

        return s.toString();
    }

    /**
     * @deprecated
     *             Instead, use the default constructor of {@code BF2TextPanel}
     *             class
     * @return     2-dim array of type String
     * @see        BF2TextPanel
     */
    public String[][] convert_to_int() {

        String[][] new_data = new String[Board.SIZE_Y][Board.SIZE_X];

        for (int row = 0; row < Board.SIZE_Y; row++) {
            for (int col = 0; col < Board.SIZE_X; col++) {
                new_data[row][col] = Integer.toString(Board.mainBoard[row][col].getValue_());
            }
        }

        return new_data;
    }

    /**
     * Creates array of colors based on color scheme defined in
     * {@code Converter.colors}
     * 
     * @return 2-dim array of type Color
     * @see Color
     * @see Converter
     */
    public Color[][] convert_to_color() {

        Color[][] color_data = new Color[Board.SIZE_Y][Board.SIZE_Y];

        for (int row = 0; row < Board.SIZE_Y; row++) {
            for (int col = 0; col < Board.SIZE_X; col++) {
                color_data[row][col] = colors[Board.mainBoard[row][col].getValue_() % 256];
            }
        }

        return color_data;
    }
}
