import dynamic.robot_in_grid.RobotInGrid;
import org.junit.Test;

import static org.junit.Assert.*;

public class RobotInGridTest {

    @Test
    public void findPath() {
        int[][] multi = new int[][]{
                { 0, 0, 1, 0, 0, 1, 0, 0, 1, 0 },
                { 0, 0, 0, 1, 0, 0, 1, 1, 0, 0 },
                { 0, 0, 0, 0, 0, 1, 0, 0, 0, 1 },
                { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 },
                { 0, 1, 1, 0, 0, 0, 0, 0, 1, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
                { 0, 0, 0, 0, 1, 0, 0, 0, 0, 1 },
                { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0 }
        };

        int[][] path = RobotInGrid.findPath(multi);
        if(path == null) {
            System.out.println("Could not find path");
            return;
        }
        for(int i = 0; i < path.length; i++) {
            for(int j = 0; j < path.length; j++) {
                System.out.print(path[i][j] + ", ");
            }
            System.out.println();
        }

    }
}