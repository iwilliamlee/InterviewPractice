import dynamic.queens.Queens;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class QueensTest {
    @Test
    public void Test1() {
        Queens queens = new Queens();
        List<int[][]> solution = queens.getQueenPositions(8);
        assertEquals("Num of solutions in 8x8 board", 92, solution.size());
    }

    @Test
    public void Test2() {
        Queens queens = new Queens();
        List<int[][]> solution = queens.getQueenPositions(7);
        assertEquals("Num of solutions in 7x7 board", 40, solution.size());
    }

    @Test
    public void Test3() {
        Queens queens = new Queens();
        List<int[][]> solution = queens.getQueenPositions(6);
        assertEquals("Num of solutions in 6x6 board", 4, solution.size());
    }
}