class Solution {
    public boolean exist(char[][] board, String word) {
        int row=board.length;
        int col=board[0].length;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(dfs(board,word,i,j,0))
                {
                    return true;
                }
            }
        }
        return false;
    }
     private boolean dfs(char[][] board, String word,
                        int row, int col, int index) {

        // Outside grid
        if (row < 0 || row >= board.length ||
            col < 0 || col >= board[0].length) {
            return false;
        }

        // Character doesn't match
        if (board[row][col] != word.charAt(index)) {
            return false;
        }

        // Last character matched
        if (index == word.length() - 1) {
            return true;
        }

        // Mark as visited
        char temp = board[row][col];
        board[row][col] = '#';

        // Explore four directions
        boolean found =
            dfs(board, word, row - 1, col, index + 1) ||
            dfs(board, word, row + 1, col, index + 1) ||
            dfs(board, word, row, col - 1, index + 1) ||
            dfs(board, word, row, col + 1, index + 1);

        // Backtrack
        board[row][col] = temp;

        return found;
    }
}