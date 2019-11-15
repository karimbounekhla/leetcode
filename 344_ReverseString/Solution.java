class Solution {
    public void reverseString(char[] s) {
        // Keep pointers to start and end
        int i = 0, j = s.length-1;
        
        // Move pointers and swap until they cross
        while (i <= j) {
            char temp = s[i];
            s[i++] = s[j];
            s[j--] = temp;
        }
    }
}