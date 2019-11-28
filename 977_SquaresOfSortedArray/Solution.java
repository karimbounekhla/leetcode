class Solution {
    
    // Simpler O(N*logN) solution
    public int[] sortedSquares(int[] A) {
        int[] ans = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            ans[i] = A[i]*A[i];
        }
        Arrays.sort(ans);
        return ans;
    }
    
    // 2-pass solution, O(N)
    public int[] sortedSquares(int[] A) {
        int N = A.length;
        int j = 0;
        // Find where negative numbers end
        while (j < N && A[j] < 0)
            j++;
        int i = j-1;
        
        int[] res = new int[N];
        int t = 0;
        
        // Iterate over negative numbers in reverse
        while (i >= 0 && j < N) {
            if (A[i] * A[i] < A[j] * A[j]) {
                res[t++] = A[i] * A[i];
                i--;
            } else {
                res[t++] = A[j] * A[j];
                j++;
            }
        }

        // Interate over positive numbers normally
        while (i >= 0) {
            res[t++] = A[i] * A[i];
            i--;
        }
        while (j < N) {
            res[t++] = A[j] * A[j];
            j++;
        }

        return res;
    }
}