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
    // Recursive solution
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        // Search for node to delete
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            // Case 1 - No left child
            if (root.left == null) return root.right;
            // Case 2 - No right child
            else if (root.right == null) return root.left;
            // Case 3 - Both child 
            else {
                // Replace node with successor then delete successor 
                root.val = findMin(root.right).val;
                root.right = deleteNode(root.right, root.val);
            }
        }
        return root;
    }
    
    // Helper method to find successor node
    private TreeNode findMin(TreeNode root) {
        if (root.left == null) return root;
        return findMin(root.left);
    }
}