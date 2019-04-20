package dynamic.queens;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Queens {

    List<int[][]> solutions;


    private void getQueenRecurse(int[][] board, int row) {

        //If we've reached past the board, means we have a solution
        if(row == board.length) {
//            System.out.println("we got a solution");
            solutions.add(board);
            return;
        }

        for(int i = 0; i < board[0].length; i++) {
            //Check if we could place a queen on this spot
            int[][] newBoard = placeQueens(row, i, board);
            if(newBoard != null) {
                //If we could, move to next row and try again
               getQueenRecurse(newBoard, row + 1);
            }
        }
        return;
    }

    private int[][] duplicateBoard(int[][] board) {
        int[][] newBoard = new int[board.length][board[0].length];
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                newBoard[i][j] = board[i][j];
            }
        }
        return newBoard;
    }

    /**
     * @param row - row queen to be placed in
     * @param col - col queen to be placed in
     * @param currBoard - The current board
     * @return a new board if placing queen was succesful, else null if unsuccessful
     */
    private int[][] placeQueens(int row, int col, int[][] currBoard) {
//        System.out.println("Placing queens on Row: " + row + ", Col: " + col);
        if(currBoard[row][col] != 0) {
            return null;
        }
        int[][] board = duplicateBoard(currBoard);
        //Place along vertical
        for(int i = row; i < board.length; i++) {
            board[i][col] = -1;
        }
        //Place along diagonal left side
        int rowDiag = row;
        int colDiagLeft = col;
        while(rowDiag < board.length && colDiagLeft >= 0) {
            board[rowDiag][colDiagLeft] = -1;
            rowDiag++;
            colDiagLeft--;
        }
        //place along diagonal right side
        rowDiag = row;
        int colDiagRight = col;
        while(rowDiag < board.length && colDiagRight < board[0].length) {
            board[rowDiag][colDiagRight] = -1;
            rowDiag++;
            colDiagRight++;
        }

        board[row][col] = 1;
        return board;
    }


    public List<int[][]> getQueenPositions(int numOfQueens) {
        solutions = new ArrayList<>();
        int[][] board = new int[numOfQueens][numOfQueens];

        for(int i = 0; i < numOfQueens; i++) {
            Arrays.fill(board[i], 0);
        }
        getQueenRecurse(board, 0);

        for(int[][] boardSol : solutions) {
            for(int i = 0; i < boardSol.length; i++) {
                for(int j = 0; j < boardSol[0].length; j++) {
                    if(boardSol[i][j] == -1) boardSol[i][j] = 0;
                }
            }
        }

        return solutions;
    }

}
