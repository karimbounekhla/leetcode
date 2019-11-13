class Solution {
    
    // Solution 1 - using HashMap
    
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        // Loop over array 
        for (int i = 0; i < nums.length; i++) {
            // Each time element is encountered, add to HashMap
            int val = hm.getOrDefault(nums[i], 0);
            hm.put(nums[i], val + 1);
            
            // If value of key (i.e. occurance) is > N/2, return that value.
            if (val >= nums.length/2) {
                return nums[i];
            }
        }
        return 0;
    }
    
    // Solution 2 - Using Sort
    
    public int majorityElement(int[] nums) {
        // Sort Array
        Arrays.sort(nums);
        
        // Majority element is guaranteed to be in the middle of array
        return nums[nums.length/2];
    }
}