import org.junit.Test;
import real_interview.ManhattanPath.ManhattanPath;

import static org.junit.Assert.*;

public class ManhattanPathTest {

    @Test
    public void Test1() {
        char[][] grid = {
                {'x', 'O', 'O', 'O'},
                {'x', 'O', 'O', 'O'},
                {'O', 'O', 'y', 'y'},
                {'O', 'O', 'O', 'O'},
        };

        ManhattanPath manhattanPath = new ManhattanPath();
        assertEquals(3, manhattanPath.findPath(grid));
    }

    @Test
    public void Test2() {
        char[][] grid = {
                {'x', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'O'},
                {'O', 'O', 'y', 'y'},
                {'O', 'O', 'O', 'O'},
        };

        ManhattanPath manhattanPath = new ManhattanPath();
        assertEquals(4, manhattanPath.findPath(grid));
    }

    @Test
    public void Test3() {
        char[][] grid = {
                {'O', 'O', 'O', 'y'},
                {'O', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'x'},
                {'O', 'O', 'O', 'O'},
        };

        ManhattanPath manhattanPath = new ManhattanPath();
        assertEquals(2, manhattanPath.findPath(grid));
    }

    @Test
    public void Test4() {
        char[][] grid = {
                {'x', 'x', 'y', 'y'},
                {'x', 'x', 'y', 'y'},
                {'x', 'x', 'y', 'y'},
                {'x', 'x', 'y', 'y'},
        };

        ManhattanPath manhattanPath = new ManhattanPath();
        assertEquals(1, manhattanPath.findPath(grid));
    }

    @Test
    public void Test5() {
        char[][] grid = {
                {'x', '0', 'y', 'y'},
                {'0', '0', 'y', 'y'},
                {'0', '0', 'y', 'y'},
                {'0', '0', 'y', 'x'},
        };

        ManhattanPath manhattanPath = new ManhattanPath();
        assertEquals(1, manhattanPath.findPath(grid));
    }


}