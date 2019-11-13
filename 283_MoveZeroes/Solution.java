class Solution {
    public void moveZeroes(int[] nums) {
        // Initialize pointers and zeros counter
        int zeros = 0;
        int i = 0;
        int j = 0;
        
        // Loop over all element, moving all non-zeros element back (keeping order)
        while (i < nums.length) {
            if (nums[i] == 0) {
                zeros++;
            } else {
                nums[j] = nums[i];
                j++;
            }
            i++;
        }
        fillZeros(nums, zeros);
    }
    
    // Fill the end of the array with amount of zeros
    private void fillZeros(int[] a, int count) {
        for (int i = a.length - 1; i >= (a.length-count); i--) {
            a[i] = 0;
        }
    }
}