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
    }

    public static void updateBoard(int value){
        Cell newCell = new Cell(value);
        mainBoard[pointerX][pointerY] = newCell;
    }
    public static void updatePointerX(int change){
        pointerX += change;
    }
    public static void updatePointerY(int change){
        pointerY += change;
    }

//    public int[][] boardToInt(){
//        int[][] returnArray = new int[SIZE_X][SIZE_Y];
//        for (int i )
//    }

}
