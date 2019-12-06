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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<Integer>();
        dfs(root, l);
        return l;
    }
    
    // Recursive solution
    public void dfs(TreeNode root, List<Integer> l) {
        if (root == null) return;
        dfs(root.left, l);
        dfs(root.right, l);
        l.add(root.val);
    }
}