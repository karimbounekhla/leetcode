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
    // Global vars to keep track of min and previous node
    private int min = Integer.MAX_VALUE;
    private TreeNode prev;
    
    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        return min;
    }
    
    // DFS of tree, keeping reference to previous node to evaluate min
    private TreeNode dfs(TreeNode node) {
        if (node == null) return null;
        dfs(node.left);
        if (prev != null && Math.abs(node.val-prev.val) < min) {
            min = Math.abs(node.val - prev.val);
        }
        prev = node;
        dfs(node.right);
        return null;
    }
}