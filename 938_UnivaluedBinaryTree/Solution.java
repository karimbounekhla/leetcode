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
    public boolean isUnivalTree(TreeNode root) {
        return dfs(root.val, root);
    }
    
    // Helper recursive method 
    private boolean dfs(int value, TreeNode node) {
        // Base case - reached bottom of tree
        if (node == null) {
            return true;
        }
        
        // Return false if encounter differing value
        if (node.val != value) {
            return false;
        }
        
        // Tree traversal ensuring that both trees are univalued
        return dfs(value, node.left) && dfs(value, node.right);
    }
}