package bf2;

import Exceptions.PointerOutOfBoardException;
import Exceptions.RedefinitionOfFunctionException;
import interpreter.BF2App;
import org.junit.*;
import org.junit.rules.ExpectedException;

public class Bf2Tests {
    @Test
    public void helloWorldTest() {
        String[] args = {"src/test/resources/helloWorld.bf2"};
        BF2App.main(args);
        Cell[][] expectedBoard =
                {{new Cell(72), new Cell(101), new Cell(108), new Cell(108), new Cell(111), new Cell(32), new Cell(0), new Cell(0)},
                {new Cell(0), new Cell(119), new Cell(111), new Cell(114), new Cell(108), new Cell(100), new Cell(0), new Cell(0)},
                {new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0)},
                {new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0)},
                {new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0)},
                {new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0)},
                {new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0)},
                {new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0)}};
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                Assert.assertEquals(expectedBoard[i][j], Board.mainBoard[i][j]);
            }
        }
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();
    @Test(expected = RedefinitionOfFunctionException.class)
    public void functionRedefinitionTest(){
        exceptionRule.expectMessage("Exceptions.RedefinitionOfFunctionException");
        String[] args = {"src/test/resources/functionRedefinition.bf2"};
        BF2App.main(args);
    }

    @Test(expected = PointerOutOfBoardException.class)
    public void pointerOutOfBoardTest(){
        exceptionRule.expectMessage("Exceptions.PointerOutOfBoardException");
        String[] args = {"src/test/resources/outOfBoardException.bf2"};
        BF2App.main(args);
    }

    @Test
    public void loop1Test() {
        String[] args = {"src/test/resources/loop1.bf2"};
        BF2App.main(args);
        Cell[][] expectedBoard =
                {{new Cell(5), new Cell(3), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0)},
                        {new Cell(0), new Cell(81), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0)},
                        {new Cell(0), new Cell(81), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0)},
                        {new Cell(0), new Cell(81), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0)},
                        {new Cell(0), new Cell(81), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0)},
                        {new Cell(0), new Cell(81), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0)},
                        {new Cell(0), new Cell(81), new Cell(123), new Cell(123), new Cell(123), new Cell(123), new Cell(123), new Cell(123), new Cell(0), new Cell(0)},
                        {new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0)},
                        {new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0)},
                        {new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0)}};
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                Assert.assertEquals(expectedBoard[i][j], Board.mainBoard[i][j]);
            }
        }
    }

    @Test
    public void loop2Test() {
        String[] args = {"src/test/resources/loop2.bf2"};
        BF2App.main(args);
        Cell[][] expectedBoard =
                {{new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(6), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0)},
        {new Cell(4), new Cell(4), new Cell(4), new Cell(4), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0)},
        {new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0)},
        {new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0)},
        {new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0)},
        {new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0)},
        {new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0)},
        {new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0)},
        {new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0)},
        {new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0)}};
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                Assert.assertEquals(expectedBoard[i][j], Board.mainBoard[i][j]);
            }
        }
    }

    @Test
    public void loop3Test() {
        String[] args = {"src/test/resources/loop3.bf2"};
        BF2App.main(args);
        Cell[][] expectedBoard =
                {{new Cell(5), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0)},
                        {new Cell(3), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0)},
                        {new Cell(8), new Cell(6), new Cell(6), new Cell(6), new Cell(6), new Cell(6), new Cell(6), new Cell(0), new Cell(0), new Cell(0)},
                        {new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(2), new Cell(0), new Cell(0), new Cell(0)},
                        {new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0), new Cell(0)}};
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 10; j++){
                Assert.assertEquals(expectedBoard[i][j], Board.mainBoard[i][j]);
            }
        }
    }
}