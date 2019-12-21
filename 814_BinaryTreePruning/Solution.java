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
    public TreeNode pruneTree(TreeNode root) {
        return prune(root);
    }
    
    // Recursive implementation
    // Sub-tree doesn't contain a 1 IFF it is a leaf and it its value is 0
    private TreeNode prune(TreeNode node) {
        if (node == null) return null;
        node.left = prune(node.left);
        node.right = prune(node.right);
        
        // If '0', set link to that leaf to be null
        if (node.val == 0 && isLeaf(node)) {
            node = null;
        }
        
        return node;
    }
    
    // Helper method to find if node is leaf
    private boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }
}