class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        // Use DP cache
        int[][] dp = new int[row][col];
        int result = Integer.MIN_VALUE;
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (dp[i][j] == 0) {
                    dfs(matrix, dp, i, j, Integer.MIN_VALUE);
                    result = Math.max(result, dp[i][j]);
                }
            }
        }
        return result;
    }
    
    // Depth first search with caching
    private int dfs(int[][] matrix, int[][] dp, int row, int col, int prev) {
        if (row < 0 || row > matrix.length - 1 || col < 0 || col > matrix[0].length - 1
           || matrix[row][col] <= prev) {
            return 0;
        }
        
        if (dp[row][col] != 0) return dp[row][col];
        
        int left = dfs(matrix, dp, row, col-1, matrix[row][col]);
        int right = dfs(matrix, dp, row, col+1, matrix[row][col]);
        int up = dfs(matrix, dp, row-1, col, matrix[row][col]);
        int down = dfs(matrix, dp, row+1, col, matrix[row][col]);
        
        dp[row][col] = Math.max(Math.max(left, right), Math.max(up, down)) + 1;
        return dp[row][col];
    }
}