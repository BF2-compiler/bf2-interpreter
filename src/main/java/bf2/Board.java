package bf2;

public class Board {
    public Cell[][] MainBoard = null;

    Board(int size_x, int size_y)
    {
        MainBoard = new Cell[size_x][size_y];
    }
}
