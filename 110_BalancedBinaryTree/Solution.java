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
    public boolean isBalanced(TreeNode root) {
        // base case, if reached the end of tree
        if (root == null) {
            return true;
        }

        // For each node, check that right / left branch doesn't differ in height by more than 1
        if (Math.abs(getHeight(root.left)-getHeight(root.right)) > 1) {
            return false;
        }

        // Recursively check that both sides are balanced
        return isBalanced(root.left) && isBalanced(root.right);
    }
    
    // Helper method that returns maximum depth of tree, given a node t
    private int getHeight(TreeNode t) {
        if (t == null) {
            return 0;
        }

        // Recursive call to get max height between left / right branches
        return 1 + Math.max(getHeight(t.left), getHeight(t.right));
    }
}