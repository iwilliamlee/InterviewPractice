package dynamic.robot_in_grid;

public class RobotInGrid {

    public static int[][] findPath(int[][] grid, int[][] memo, int row, int col) {

        memo[row][col] = 1;

        //We reached the bottom right
        if(row == grid.length - 1 && col == grid.length - 1) {
            int[][] path = new int[grid.length][grid.length];
            path[row][col] = 1;
            return path;
        }

        //We are blocked in the path
        if(grid[row][col] == 1) {
            return null;
        }

        int[][] path;

        if(row != grid.length - 1) {
            //Unexplored, then explore it
            if(memo[row+1][col] == 0) {
                path = findPath(grid, memo, row + 1, col);
                if(path != null) {
                    path[row][col] = 1;
                    return path;
                }
            }

        }
        if(col != grid.length - 1) {
            if(memo[row][col + 1] == 0) {
                path = findPath(grid, memo, row, col + 1);
                if(path != null){
                    path[row][col] = 1;
                    return path;
                }
            }
        }

        return null;
    }

    public static int[][] findPath(int[][]grid) {
        int[][] memo = new int[grid.length][grid.length];
        return findPath(grid, memo, 0, 0);
    }

}
