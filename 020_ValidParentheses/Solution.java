class Solution {
    public boolean isValid(String s) {
        // Use Stack Approach
        // Potential improvement -> Use HashMap to map '{' > '}', etc...
        Stack<Character> st = new Stack<Character>();
        int n = s.length();
        if (s.equals("")) {
            return true;
        }
        // If uneven string, cannot be valid
        if (n % 2 != 0) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            Character c = s.charAt(i);
            // Push opening parenthesis to Stack
            if (c.equals('{') || 
                c.equals('(') ||
                c.equals('[')) {
                st.push(c);
            } else {
                // if nothing in stack when trying to close parenthesis - invalid
                if (st.size() == 0) return false;
                
                // Check that not closing a parenthesis that doesn't match current opened parenthesis
                if (c.equals('}') && !st.pop().equals('{')) {
                    return false;
                } else if (c.equals(']') && !st.pop().equals('[')) {
                    return false;
                } else if (c.equals(')') && !st.pop().equals('(')) {
                    return false;
                }
            }
        }
        // Ensures that all parenthesis closed
        return st.size() == 0;
    }
}