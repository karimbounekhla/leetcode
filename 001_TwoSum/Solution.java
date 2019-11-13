class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Use HashMap to avoid O(n^2) bruteforce approach
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        // First pass, add key/value to HashMap
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], i);
        }

        // Second pass, check if value in hashmap exists such that nums[i] + search = target
        for (int i = 0; i < nums.length; i++) {
            int search = target - nums[i];

            // Ensure not using same element twice
            if (hm.containsKey(search) && hm.get(search) != i) {
                return new int[]{i, hm.get(search)};
            }
        }

        // No result found
        return null;
        
    }
}