class Solution {
    public int numIslands(char[][] grid) {
        int ROWS = grid.length; int COLS = grid[0].length;
        int islands = 0;
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                if (grid[r][c] == '1') {
                    dfs(grid, r, c);
                    islands++;
                }
            }
        }
        return islands;
    }

    public void dfs(
            char[][] grid,
            int r, 
            int c
        ){
            
        int ROWS = grid.length; int COLS = grid[0].length;
        if (r < 0 || c < 0 || r >= ROWS || c >= COLS || grid[r][c] != '1') {
            return;
        }

        grid[r][c] = '0'; // mark as visited

        dfs(grid, r + 1, c);
        dfs(grid, r - 1, c);
        dfs(grid, r, c + 1);
        dfs(grid, r, c - 1);
    }
}