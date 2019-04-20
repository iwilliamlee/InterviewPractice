import org.junit.Test;
import real_interview.ConnectFour.ConnectFour;

import static org.junit.Assert.*;

public class ConnectFourTest {

    @Test
    public void Test1() {
        int[][] mat = new int[][]{
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 2, 0, 2, 0},
                {0, 0, 0, 1, 2, 1, 0},
                {0, 0, 0, 2, 1, 1, 0},
                {0, 0, 2, 1, 1, 2, 0},
        };
        ConnectFour connectFour = new ConnectFour();
        assertEquals(2, connectFour.checkGame(mat, 4));
    }

    @Test
    public void Test2() {
        int[][] mat = new int[][]{
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 2, 0, 2, 0},
                {0, 0, 0, 1, 2, 1, 0},
                {0, 0, 0, 2, 1, 1, 0},
                {0, 0, 2, 1, 1, 2, 0},
        };
        ConnectFour connectFour = new ConnectFour();
        assertEquals(0, connectFour.checkGame(mat, 5));
    }


    @Test
    public void Test3() {
        int[][] mat = new int[][]{
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 2, 0, 2, 0},
                {0, 0, 0, 1, 2, 1, 0},
                {0, 0, 0, 2, 1, 1, 0},
                {0, 0, 1, 1, 1, 1, 1},
        };
        ConnectFour connectFour = new ConnectFour();
        assertEquals(1, connectFour.checkGame(mat, 5));
    }
}