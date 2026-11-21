class Solution {
    public boolean isValidSudoku(char[][] board) {
        int i = 0;
        while(i < 9){
            Set<Character> setRow = new HashSet<>();
            Set<Character> setCol = new HashSet<>();
            for(int j = 0;j < 9; j ++){
                if(board[i][j] != '.' && !setRow.add(board[i][j])) return false;
                if(board[j][i] != '.' && !setCol.add(board[j][i])) return false;
                if(i % 3 == 0 && j % 3 == 0){
                    Set<Character> setBox = new HashSet<>();
                    for(int ia = i; ia < i + 3; ia++){
                        for(int ja = j; ja < j + 3; ja++){
                            if(board[ia][ja] != '.' && !setBox.add(board[ia][ja])) return false;
                        }
                    }
                }
            }
            i++;
        }
        return true;
    }
}