class Solution {
    public int findNumbers(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (evenNumInt(nums[i])) res++;
        }
        return res;
    }
    
    // Helper method
    private boolean evenNumInt(int num) {
        int numDig = 0;
        int curr = num;
        while (curr > 0) {
            curr = curr / 10;
            numDig++;
        }
        return numDig % 2 == 0;
    }
}