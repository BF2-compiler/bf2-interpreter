package bf2;

import java.util.Objects;

public class Cell {
    private int value_;
    private Board boardUp;
    private Board boardDown;

    public Cell(int value){
        this.value_ = value;
        boardUp = null;
        boardDown = null;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cell cell = (Cell) o;
        return value_ == cell.value_ && Objects.equals(boardUp, cell.boardUp) && Objects.equals(boardDown, cell.boardDown);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value_, boardUp, boardDown);
    }
}
