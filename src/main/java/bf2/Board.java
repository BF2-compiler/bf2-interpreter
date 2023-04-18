package bf2;

public class Board {
    public static int SIZE_X, SIZE_Y;
    public static Cell[][] mainBoard = null;
    public static int pointerX = 0, pointerY = 0;

    public static void setInitialBoard(int size_x, int size_y)
    {
        SIZE_X = size_x;
        SIZE_Y = size_y;
        mainBoard = new Cell[size_x][size_y];
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
    public static void updatePointerX(int change) {
        if (pointerX + change < SIZE_X && pointerX + change > 0)
        {
            pointerX += change;
        } else
        {
//            throw new Exception(String.valueOf(pointerX + change));
        }

    }
    public static void updatePointerY(int change) {
        if (pointerY + change < SIZE_Y && pointerY + change > 0)
        {
            pointerY += change;
        } else {
//            throw new ArrayIndexOutOfBoundsException(String.valueOf(pointerY + change));
        }

    }

//    public int[][] boardToInt(){
//        int[][] returnArray = new int[SIZE_X][SIZE_Y];
//        for (int i )
//    }

}
