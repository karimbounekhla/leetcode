class Solution {
    public int search(int[] nums, int target) {
        int piv = findPivot(nums);
        int first_half = binSearch(nums, target, 0, piv-1);
        int second_half = binSearch(nums, target, piv, nums.length-1);
        int idx;
        if (first_half == -1 && second_half == -1) return -1;
        else if (first_half != -1) idx = first_half;
        else idx = second_half;
        return idx;
    }
    
    private int findPivot(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i-1]) return i;
        }
        return 0;
    }
    
    private int binSearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
			int middle = (start + end) / 2;
			if (target < nums[middle]) {
				end = middle - 1;
			}
			if (target > nums[middle]) {
				start = middle + 1;
			}
			if (target == nums[middle]) {
				return middle;
			}
		}
		return -1;
    }
}