class Solution {

    public int heightChecker(int[] heights) {
        // Create copy array and sort
        int[] copied = new int[heights.length];
        System.arraycopy(heights, 0, copied, 0, heights.length);
        Arrays.sort(copied);
        int swaps = 0;
        
        // Iterate over arrays, incrementing counter when entry is out of place
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != copied[i]) {
                swaps++;
            }
        }

        // Return result
        return swaps;
    }
}