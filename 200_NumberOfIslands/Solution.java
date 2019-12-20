class Solution {
    public int numIslands(char[][] grid) {
        int numIslands = 0;
        // Iterate over whole grid
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                // When finding island, use DFS to remove island and increment numIslands
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    numIslands++;
                }
            }
        }
        return numIslands;
    }
    
    // recursive DFS to mark connected component of island to '0'
    private void dfs(char[][] grid, int i, int j) {
        grid[i][j] = '0';
        if ((i-1) >= 0 && grid[i-1][j] == '1') {
            dfs(grid, i-1, j);
        }
        if ((i+1) < grid.length && grid[i+1][j] == '1') {
            dfs(grid, i+1, j);
        }
        if ((j-1) >= 0 && grid[i][j-1] == '1') {
            dfs(grid, i, j-1);
        }
        if ((j+1) < grid[i].length && grid[i][j+1] == '1') {
            dfs(grid, i, j+1);
        }
    }
}