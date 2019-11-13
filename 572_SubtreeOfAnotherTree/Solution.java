/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        // If main tree node is null, false
        if (s == null) {
            return false;
        }
        // If tree equals subtree
        if (equal(s, t)) {
            return true;
        }

        // For each node, recursively look at left / right branches. Only need 1 side to be true
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }
    
    private boolean equal(TreeNode s, TreeNode t) {
        // If arrived at end of both trees without returning false, then trees equal
        if (s == null && t == null) {
            return true;
        }
        // If either sub-tree ends before the other, not equal
        if (t == null || s == null) {
            return false;
        }
        // If values not equal
        if (s.val != t.val) {
            return false;
        }

        // Recursively look at left / right branches, both need to be true.
        return equal(s.left, t.left) && equal(s.right, t.right);
    }
}