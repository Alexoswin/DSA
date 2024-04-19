import java.util.*;

public class nQueens {

    public static boolean isSafe(int row, int column, char[][] board) {
        // Check horizontal
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }
        // Check vertical
        for (int j = 0; j < board.length; j++) {
            if (board[j][column] == 'Q') {
                return false;
            }
        }
        // Check upper left diagonal
        for (int r = row, c = column; r >= 0 && c >= 0; r--, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        // Check upper right diagonal
        for (int r = row, c = column; r >= 0 && c < board.length; r--, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void saveBoard(char[][] board, List<List<String>> allBoards) {
        List<String> newBoard = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'Q') {
                    row.append(" Q ");
                } else {
                    row.append(" . ");
                }
            }
            newBoard.add(row.toString());
        }
        allBoards.add(newBoard);
    }

    public static void calculate(char[][] board, List<List<String>> allBoards, int column) {
        if (column == board.length) {
            saveBoard(board, allBoards);
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, column, board)) {
                board[row][column] = 'Q';
                calculate(board, allBoards, column + 1);
                board[row][column] = ' . ';
            }
        }
    }

    public static void main(String[] args) {
        int n = 4;
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        for (char[] row : board) {
            Arrays.fill(row, '.');
        }
        calculate(board, allBoards, 0);
        for (List<String> result : allBoards) {
            for (String row : result) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}

