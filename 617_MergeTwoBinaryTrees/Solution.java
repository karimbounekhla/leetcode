public class Solution {
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
        public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
	    // If other node is null, no addition.
            if (t1 == null) {
                return t2;
            }
            if (t2 == null) {
                return t1;
            }
	
	    // Merge values into Tree 1
            t1.val += t2.val;
	    
            // Recursive call to merge all right and left branches
            t1.left = mergeTrees(t1.left, t2.left);
            t1.right = mergeTrees(t1.right, t2.right);

	    // Return reference to merged tree (t1)
            return t1;
        }
    }
}
