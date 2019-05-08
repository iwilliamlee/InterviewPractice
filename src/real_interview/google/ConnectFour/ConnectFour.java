package real_interview.google.ConnectFour;

import common.Direction;

import java.util.HashSet;

/**
 * Given an n x m grid. Determine if a connect game of length K is still on going.
 *
 */
public class ConnectFour {

    Direction[] fiveDirections = {
            new Direction(0, -1),
            new Direction(1, -1),
            new Direction(1, 0),
            new Direction(1, 1),
            new Direction(0, 1),
    };


    HashSet<Direction>[][] visited;


    /**
     * Only need to check 5 directions.
     * Bottom left, bottom, bottom right, right, and left
     * @param game
     * @return
     */
    private int checkGameRecurse(int[][] game, int row, int col, int player, int count, int kInRow, Direction dir) {
        //If we reached the kInRow, then we have a winner
//        System.out.println("Checking row: " + row + ", col: " + col + ", count: " + count);
        if(count == kInRow) {
            return player;
        }
        //Base case, check boundary
        if(row < 0 || row > game.length - 1) {
            return 0;
        }
        else if(col < 0 || col > game[0].length - 1) {
            return 0;
        }
        //If it contains that direction already, then we already explored and it's imposisble to for it to contain a solution
        else if(visited[row][col].contains(dir)) {
            return 0;
        }
        //We are the same player, we can increment count and continue to move in that direction
        else if(game[row][col] == player) {
            visited[row][col].add(dir);
            return checkGameRecurse(game, row + dir.delRow, col + dir.delCol, player, ++count, kInRow, dir);
        }
        //We are not the same player, return
        else {
            return 0;
        }

    }

    public int checkGame(int[][] game, int kInRow) {

        visited = new HashSet[game.length][game[0].length];
        for(int i = 0; i <game.length; i++) {
            for(int j = 0; j < game[0].length; j++) {
                visited[i][j] = new HashSet<Direction>();
            }
        }

        for(int i = 0; i < game.length; i++) {
            for(int j = 0; j < game[0].length; j++) {
                if(game[i][j] != 0) {
//                    System.out.print(game[i][j] + "ITERATOR ");
                    for(Direction dir : fiveDirections) {
                        int solution = checkGameRecurse(game, i, j, game[i][j], 0, kInRow, dir);
                        if(solution != 0) return solution;
                    }
                }
            }
            System.out.println();
        }
        return 0;
    }

}
