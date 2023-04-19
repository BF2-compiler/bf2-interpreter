package GUI;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * A class to represent a piece of text for further display in the main frame
 * @see JPanel
 */
public class BF2TextPanel extends JPanel {
    String text;

    public BF2TextPanel(String text) {
        this.text = text;
        AddText();
    }

    public BF2TextPanel(int number) {
        this.text = Integer.toString(number);
        AddText();
    }

    public BF2TextPanel(){}

    public void AddText() {
        this.add(new JLabel(this.text));
    }
}
