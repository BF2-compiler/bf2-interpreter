package org.bf2.GUI;

public class BF2GUI {
    
    public static void main(String[] args) {
        BF2Frame frame = new BF2Frame();
        
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

        frame.print_as_string(hw);
        
        frame.pack();
        frame.setVisible(true);
    }
}
