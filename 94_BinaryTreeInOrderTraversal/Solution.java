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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        dfs(root, res);
        return res;
    }
    
    public void dfs(TreeNode root, List<Integer> l) {
        if (root == null) return;
        dfs(root.left, l);
        l.add(root.val);
        dfs(root.right, l);
    }
}