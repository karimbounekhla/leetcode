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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> output = new ArrayList<>();
        
        if (root == null) {
            return output;
        }
        
        // Start by queuing root
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        // Iterate while there are items in queue
        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> res = new ArrayList<>();
            
            // Iterate over each level
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                // Add child to queue
                if(node.left != null) {
                     q.add(node.left);
                }
                if(node.right != null) {
                     q.add(node.right);
                }
                res.add(node.val);                  
             }
            // Add array of level that was traversed to result
            output.add(res);
        }
        return output;
    }
}