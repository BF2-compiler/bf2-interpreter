package bf2;

public class Cell {
    private int value;
    private Board boardUp;
    private Board boardDown;

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public Board getBoardUp()
    {
        return boardUp;
    }
    public void setBoardUp(Board boardUp) {
        this.boardUp = boardUp;
    }
    public Board getBoardDown()
    {
        return boardDown;
    }
    public void setBoardDown(Board boardDown) {
        this.boardDown = boardDown;
    }
}
