class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] row = new boolean [9][9];
        boolean[][] column = new boolean [9][9];
        boolean[][] box = new boolean [9][9];
        for(int r = 0; r < 9; r++){
            for(int c = 0; c < 9; c++){
                if (board[r][c] == '.') continue;
                int num = board[r][c] - '1';
                int boxInd = (r/3)*3 + (c/3);
                if(row[r][num] || column[num][c] || box[boxInd][num]) return false;
                else row[r][num] = column[num][c] = box[boxInd][num] = true;
            }
        }
        return true;
    }
}