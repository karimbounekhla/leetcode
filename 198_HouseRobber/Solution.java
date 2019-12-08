class Solution {
    
    // Recursive Dynamic Programming Solution
    public int rob(int[] nums) {
        // Use memo arr for efficiency
        int[] memo = new int[nums.length];
        // Or use Arrays.fill() method
        for (int i = 0; i < memo.length; i++) {
            memo[i] = -1;
        }
        return rob(nums, nums.length-1, memo);
    }
    
    public int rob(int[] nums, int i, int[] memo) {
        if (i < 0) {
            return 0;
        }
        // Optimize solution so don't redo calculation for each house
        if (memo[i] >= 0) {
            return memo[i];
        }
        // Top-down approach
        // Rob current house + value of robbing 2nd houses over VS rob next house
        int res = Math.max(rob(nums, i-2, memo) + nums[i], rob(nums, i-1, memo));
        memo[i] = res;
        return res;
    }
    
    
}