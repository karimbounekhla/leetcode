class Solution {
    public int singleNumber(int[] nums) {
        // Use HashMap O(N)
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int a = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (!hm.containsKey(nums[i])) {
                hm.put(nums[i],null);
                a += nums[i];
            } else {
                a -= nums[i];
            }
        }
        return a;
    }
}