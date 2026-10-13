class Solution {
    public static boolean solve(char[][] board){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] != '.'){
                    if(!isValid(board, i, j, board[i][j])){
                        return false;
                    }
                }
            }
           
        }
         return true;
    }
    public static boolean isValid(char board[][], int row, int col, char val){
        for(int i = 0; i<9; i++){
            if(i != row && board[i][col] == val){
                return false;
            }
            if(i != col && board[row][i] == val){
                return false;
            }
            int r = 3*(row/3) + i/3;
            int c = 3*(col/3) + i%3;
            if((r != row || c != col) && board[r][c] == val){
                return false;
            }
             
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        return solve(board);
    }
}
