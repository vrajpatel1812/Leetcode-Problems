package Leetcode;

import Leetcode.sqrt;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board = {{'5','3','.','.','7','.','.','.','.'}
        ,{'6','.','.','1','9','5','.','.','.'}
        ,{'.','9','8','.','.','.','.','6','.'}
        ,{'8','.','.','.','6','.','.','.','3'}
        ,{'4','.','.','8','.','3','.','.','1'}
        ,{'7','.','.','.','2','.','.','.','6'}
        ,{'.','6','.','.','.','.','2','8','.'}
        ,{'.','.','.','4','1','9','.','.','5'}
        ,{'.','.','.','.','8','.','.','7','9'}};

        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    char num = board[i][j];
                    board[i][j] = '.';
                    if(!valid(board, i, j, num)){
                        return false;
                    }
                }
            }
        }

        return true;
    }

    public static boolean valid(char[][] board, int row, int col, char num){
        for(int i = 0; i<9; i++){
            if(board[row][i] == num){
                return false;
            }
            if(board[i][col] == num){
                return false;
            }
        }

        int startRow = row - row % 3;
        int starCol = col - col % 3;

        for(int i = startRow; i< startRow+3; i++){
            for(int j = starCol; j< starCol+3; j++){
                if(board[i][j] == num){
                    return false;
                }
            }
        }

        return true;
    }
}
