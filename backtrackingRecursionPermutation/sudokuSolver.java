import java.util.Arrays;
public class sudokuSolver{

    public static boolean isSafe(char [][]board ,int row,int column){
     
    }

    public static boolean helper(char [][] board, int row , int column){
         
        int nrow = 0;
        int ncolumn= 0;

        if(row != board.length-1){
            nrow = row;
            ncolumn = column + 1;

        }
        else{
            nrow = row +1;
            ncolumn = 0;
        }

        if(board[row][column] =='.'){
            if(helper(board, nrow, ncolumn)){
                return true;
            }
            else{
                for(int i = 1 ;i<9; i++){
                    if(isSafe(board,row,column ,i)){
                        board[row][column] = (char) (i+'0');
                        return true; 
                    }
                    else{
                        board[row][column] = '.';
                    }
                }
            }
        }
    } 

    
    public static void main(String [] args ){

        System.out.println("--- sudoku solver using backtracking and recursion ---");

        char [] [] board = new int[8][8];

        helper(board, 0, 0); 
    }
}