import java.util.Arrays;

public class sudokuSolver {

    public static boolean isSafe(char[][] board, int row, int column, int number) {
        // Check if the number is already present in the row or column
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] == (char) (number + '0') || board[row][i] == (char) (number + '0')) {
                return false;
            }
        }

        // Check if the number is already present in the 3x3 subgrid
        int sr = (row / 3) * 3;
        int sc = (column / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == (char) (number + '0')) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean helper(char[][] board, int row, int column) {
        if (row == board.length  && column == board.length) {
            // Print the solution
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            return true;
        }

        int nrow, ncolumn;

        if (column == board.length - 1) {
            nrow = row + 1;
            ncolumn = 0;
        } else {
            nrow = row;
            ncolumn = column + 1;
        }

        if (board[row][column] != '.') {
            return helper(board, nrow, ncolumn);
        } else {
            for (int i = 1; i <= 9; i++) {
                if (isSafe(board, row, column, i)) {
                    board[row][column] = (char) (i + '0');
                    if (helper(board, nrow, ncolumn)) {
                        return true;
                    }
                    // Backtrack
                    board[row][column] = '.';
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("--- Sudoku Solver using Backtracking and Recursion ---");

        char[][] board = {
            {'.', '.', '3', '.', '8', '.', '.', '.', '.'},
            {'5', '.', '7', '.', '9', '.', '.', '4', '.'},
            {'.', '.', '.', '.', '.', '1', '.', '.', '.'},
            {'3', '.', '.', '.', '7', '4', '.', '8', '.'},
            {'.', '6', '.', '8', '.', '.', '2', '.', '1'},
            {'.', '.', '.', '1', '.', '.', '7', '.', '6'},
            {'.', '.', '.', '.', '.', '5', '.', '.', '.'},
            {'.', '1', '.', '.', '.', '.', '.', '3', '2'},
            {'4', '.', '.', '.', '.', '.', '.', '5', '.'}
        };
        

        helper(board, 0, 0);
    }
}
