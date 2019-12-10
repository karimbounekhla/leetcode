class Solution {
    // Solution 1
    // Using O(N) extra space
    public void rotate(int[] nums, int k) {
        int[] new_arr = new int[nums.length];
        for (int i = 0; i < new_arr.length; i++) {
            int kk = (i+k) % nums.length;
            new_arr[kk] = nums[i];
        }
        System.arraycopy(new_arr, 0, nums, 0, nums.length);
        reverse(nums, 0, nums.length);
    }
    
    // Solution 2
    // In-place O(1) && O(N)
    public void rotate(int[] nums, int k) {
        int kk = k%nums.length;
        // Reverse entire array
        // [7, 6, 5, 4, 3, 2, 1]
        reverse(nums, 0, nums.length);
        // Reverse left side
        // [5, 6, 7, 4, 3, 2,1]
        reverse(nums, 0, kk);
        // reverse right side
        // [5, 6, 7, 1, 2, 3, 4]
        reverse(nums, kk, nums.length);
    }
    
    // Reverse array helper
    private void reverse(int[] arr, int start, int end) {
        int mid = (start+end)/2;
        for (int i = start; i < mid; i++) {
            swap(arr, i, end-(i-start)-1);
        }
    }
    
    // Swap array vals helper
    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}