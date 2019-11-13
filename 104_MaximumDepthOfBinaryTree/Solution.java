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
    public int maxDepth(TreeNode root) {
	// Base Case
        if (root == null) {
            return 0;
        }
        
	// Recursively calculate depth, and return the maximum (+1 for root)
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
      
    }
}