class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];
        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                if(board[r][c]=='.') continue;
                else{
                    int n = board[r][c] - '1';
                    int boxIndex = (r / 3) * 3 + (c / 3);
                    if(rows[r][n] || cols[c][n] ||boxes[boxIndex][n]){
                        return false;
                    }else{
                        rows[r][n] = true;
                        cols[c][n] = true;
                        boxes[boxIndex][n] = true;
                    }
                }
            }
        }
        return true;
    }
}
