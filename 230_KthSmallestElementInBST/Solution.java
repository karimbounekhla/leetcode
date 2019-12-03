/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    // Global vars to keep track of count through recursion
    int N = 0;
    int ans = 0;

    // Use DFS until kth node explored.
    // ALTERNATIVE SOLUTION: Use DFS to store vals in array, then return (k-1)th
    // index of array
    public int kthSmallest(TreeNode root, int k) {
        dfs(root, k);
        return ans;
    }

    /**
     * DFS until reached k, then return val
     * 
     * @param root root
     * @param k    k
     */
    private void dfs(TreeNode root, int k) {
        if (root == null) {
            N++;
            return;
        }
        dfs(root.left, k);
        if (N == k) {
            ans = root.val;
        }
        dfs(root.right, k);
    }
}