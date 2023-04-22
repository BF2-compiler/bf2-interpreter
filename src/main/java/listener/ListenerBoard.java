package listener;

import bf2.Cell;

import java.util.ArrayList;


public class ListenerBoard {
    public static int SIZE_X, SIZE_Y;
    public static Cell[][] mainBoard = null;
    public static int pointerX = 0, pointerY = 0;

    private static ArrayList<Integer> pXLastPositions = new ArrayList<Integer>();
    private static ArrayList<Integer> pYLastPositions = new ArrayList<Integer>();

    public static boolean allowPointersChange = true;

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
        if (allowPointersChange)
            pointerX += change;
    }
    public static void updatePointerY(int change) {
        if (allowPointersChange)
            pointerY += change;
    }

    public static void savePointerPosition(){
        pXLastPositions.add(pointerX);
        pYLastPositions.add(pointerY);
    }

    public static void loadLastPointerPosition(){
        if (pXLastPositions.size() > 0)
            pointerX = pXLastPositions.remove(pXLastPositions.size() - 1);
        if (pYLastPositions.size() > 0)
            pointerY = pYLastPositions.remove(pYLastPositions.size() - 1);
    }

}
