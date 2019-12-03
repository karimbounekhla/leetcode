class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int L = s.length();
        // Maximum length of potential repeating substring is L/2
        for (int len = 1; len <= L / 2; len++) {
            // Create pattern used to compare against using substring method
            String pattern = s.substring(0, len);
            // Start and End index of comparison pointers
            int i = len;
            int j = i + len - 1;

            // Performance improvement - string has to be divisible by substring length
            if (L % len != 0)
                continue;

            while (j < L) {
                // Compare next substrings of the same length
                String comp = s.substring(i, j + 1);
                if (!pattern.equals(comp)) {
                    break;
                }
                i += len;
                j += len;
            }
            // If above loop runs to completion, index i equals length of array and match
            // found
            if (i == L) {
                return true;
            }
        }
        return false;
    }
}