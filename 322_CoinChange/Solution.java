class Solution {
    public int coinChange(int[] coins, int amount) {
        // Set default value in array to be 1 + amount
        int max = amount + 1;
        int[] dp = new int[max];
        
        Arrays.fill(dp, max);
        
        // 0 coins to make change for 0
        dp[0] = 0;
        
        // For each amount, starting from 1, find min amount of change we can make 
        // Bottom-up approach
        for (int i = 1; i < max; i++) {
            for (int c : coins) {
                if (c <= i) {
                    dp[i] = Math.min(dp[i], 1+dp[i-c]);
                }
            }
        }
        // If value is valid, return - otherwise return -1
        return dp[amount] > amount ? -1 : dp[amount];
    }
}