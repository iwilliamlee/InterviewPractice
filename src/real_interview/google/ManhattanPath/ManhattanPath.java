package real_interview.google.ManhattanPath;

import common.Direction;

public class ManhattanPath {

    int[][] visited;

    Direction[] directions = Direction.getManhattanPaths();


    private int findRecurse(int row, int col, char[][] grid, char target) {

        //Check if it goes out of bounds
        if(row < 0 || row > grid.length - 1) return Integer.MAX_VALUE;
        if(col < 0 || col > grid[0].length - 1) return Integer.MAX_VALUE;

//        System.out.println("Searching: Row:" + row + ", Col:" + col);

        if(visited[row][col] != 0 && grid[row][col] != target) {
            return visited[row][col];
        }
        else {
            //set to MAX_VALUE for now to signify visited
            visited[row][col] = Integer.MAX_VALUE;
        }

        if(grid[row][col] == target) {
            visited[row][col] = 0;
            return visited[row][col];
        }

        int min = Integer.MAX_VALUE;
        for(Direction dir : directions) {
            //Only search unvisited cells
            int dist = findRecurse(row + dir.delRow, col + dir.delCol, grid, target);
//            System.out.println("Searching row:" + (row + dir.delRow)  + ", Col: " + (col + dir.delCol) + ", Dist: " + dist);
            if(dist < min) min = dist;

        }
        if(min == Integer.MAX_VALUE) {
            visited[row][col] = 0;
            return min;
        }
//        System.out.println("Setting result at: row: " + row + ", col: " + col + ", Value: " + (min + 1));
        visited[row][col] = min + 1;
        return min + 1;
    }


    public int findPath(char[][] grid) {
        visited = new int[grid.length][grid[0].length];
        char start = 'x';
        char target = 'y';

        boolean foundFirst = false;


        //Find a value
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 'x') {
                    findRecurse(i, j, grid, target);
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < visited.length; i++) {
            for(int j = 0; j < visited[0].length; j++) {
                System.out.print(visited[i][j] + ", ");
                if(grid[i][j] == start && visited[i][j] < min) min = visited[i][j];
            }
            System.out.println();
        }

        if(min == Integer.MAX_VALUE) return -1;
        return min;

    }

}
