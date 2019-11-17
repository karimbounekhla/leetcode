class Solution {
    public String toLowerCase(String str) {
        String s = "";
        // Iterate over each char
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                // if upper case, use ascii character code equivalent to conver to lower case
                c += 'a' - 'A';
                s += c;
            } else {
                s += c;
            }
        }
        return s;
    }
}