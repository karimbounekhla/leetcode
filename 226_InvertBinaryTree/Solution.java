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
    public TreeNode invertTree(TreeNode root) {
        // Base Case
        if (root == null) {
            return null;
        }
        
        // Create temporary copy of node, then invert
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        
        // Recursively invert all branches
        root.right = invertTree(root.right);
        root.left = invertTree(root.left);
        
        // Return root of inverted tree
        return root;
    }
    
}