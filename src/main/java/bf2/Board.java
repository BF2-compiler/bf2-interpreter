package bf2;

import java.util.ArrayList;

public class Board {
    public int SIZE_X, SIZE_Y;
    public Cell[][] mainBoard = null;
    public int pointerX = 0, pointerY = 0;

    private ArrayList<Integer> pXLastPositions = new ArrayList<>();
    private ArrayList<Integer> pYLastPositions = new ArrayList<>();
    private ArrayList<Cell[][]> boardLastStates = new ArrayList<>();
    public void setInitialBoard(int size_x, int size_y)
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

    public void updateBoard(int value){
        Cell newCell = new Cell(value);
        mainBoard[pointerY][pointerX] = newCell;
    }


    public int getCurrentValue(){
        return mainBoard[pointerY][pointerX].getValue_();
    }

    public void updatePointerX(int change){
        pointerX += change;
    }
    public void updatePointerY(int change) {
        pointerY += change;
    }

    public void saveBoardState(){
        boardLastStates.add(mainBoard);
        pXLastPositions.add(pointerX);
        pYLastPositions.add(pointerY);
    }

    public void loadBoardState(){
        if (boardLastStates.size() > 0)
            mainBoard = boardLastStates.remove(boardLastStates.size() - 1);
        if (pXLastPositions.size() > 0)
            pointerX = pXLastPositions.remove(pXLastPositions.size() - 1);
        if (pYLastPositions.size() > 0)
            pointerY = pYLastPositions.remove(pYLastPositions.size() - 1);
    }

    public int[][] getIntArray(){
        int[][] returnArray = new int[SIZE_Y][SIZE_X];
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                returnArray[i][j] = mainBoard[i][j].getValue_();
            }
        }
        return returnArray;
    }

}
