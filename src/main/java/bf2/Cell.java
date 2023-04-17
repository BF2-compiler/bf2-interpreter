package bf2;

public class Cell {
    private int value_;
    private Board boardUp;
    private Board boardDown;

    public Cell(int value){
        this.value_ = value;
    }

    public int getValue_() {
        return value_;
    }
    public void setValue_(int value) {
        this.value_ = value;
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
