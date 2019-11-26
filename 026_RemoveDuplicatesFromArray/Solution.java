class Solution {
    public int removeDuplicates(int[] nums) {
        // Use two pointers, i = slow, j = fast
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            // Iterate until find number that is not duplicate
            if (nums[j] != nums[i]) {
                // Increment i and assign 
                nums[++i] = nums[j];
            }
        }
        // return position of slow pointer + 1 for j
        return i+1;
    }
}