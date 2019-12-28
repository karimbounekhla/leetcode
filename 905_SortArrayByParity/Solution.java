class Solution {
    public int[] sortArrayByParity(int[] A) {
        // 2-pointers
        int lo = 0;
        int hi = A.length-1;
        
        while (lo < hi) {
            // Partition array so that:
            // All entries to left of lo are even
            // All entries to right of hi are odd
            if (A[lo] % 2 != 0 && A[hi] % 2 == 0) {
                int temp = A[lo];
                A[lo] = A[hi];
                A[hi] = temp;
            }
            if (A[lo] % 2 == 0) lo++;
            if (A[hi] % 2 != 0) hi--;
        }
        return A;
    }
}