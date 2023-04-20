package listener;

import bf2.Cell;

public class ListenerBoard {
    public static int SIZE_X, SIZE_Y;
    public static Cell[][] mainBoard = null;
    public static int pointerX = 0, pointerY = 0;

    public static void setInitialBoard(int size_x, int size_y)
    {
        SIZE_X = size_x;
        SIZE_Y = size_y;
        mainBoard = new Cell[size_y][size_x];
        for (int i = 0; i < SIZE_Y; i++){
            for (int j = 0; j < SIZE_X; j++){
                Cell newCell = new Cell(0);
                mainBoard[i][j] = newCell;
            }
        }
    }

    public static void updateBoard(int value){
        Cell newCell = new Cell(value);
        mainBoard[pointerY][pointerX] = newCell;
    }


    public static int getCurrentValue(){
        return mainBoard[pointerY][pointerX].getValue_();
    }

    public static void updatePointerX(int change){
        pointerX += change;
    }
    public static void updatePointerY(int change) {
        pointerY += change;
    }

}
