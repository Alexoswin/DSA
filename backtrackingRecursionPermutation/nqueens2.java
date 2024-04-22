import java.util.ArrayList;
import java.util.List;

public class nqueens2 {

    public static boolean isSafe(int row, int column, char[][] board) {

        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == 'Q') {
                return false;
            }
        }

        for (int i = 0; i < board.length; i++) {
            if (board[i][column] == 'Q') {
                return false;
            }
        }

        for (int i = row, j = column; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        for (int i = row, j = column; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        for (int i = row, j = column; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        for (int i = row, j = column; i < board.length && j < board.length; i++, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void saveBoard(char[][] board, List<List<String>> allboards) {
        List<String> newBoard = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 'Q') {
                    row.append('Q');
                } else {
                    row.append('.');
                }
            }
            newBoard.add(row.toString());
        }
        allboards.add(newBoard);
    }

    public static void calculate(int column, char[][] board, List<List<String>> allboards) {

        if (column == board.length) {
            saveBoard(board, allboards);
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, column, board)) {
                board[row][column] = 'Q';
                calculate(column + 1, board, allboards);
                board[row][column] = '.';
            }
        }
    }

    public static void main(String[] args) {

        System.out.println(" n queens in n*n dimension chess board ");

        int n = 4;
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        calculate(0, board, allBoards);
        for (List<String> result : allBoards) {
            for (String row : result) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
