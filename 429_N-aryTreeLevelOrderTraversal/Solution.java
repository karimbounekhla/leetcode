/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {

    // Iterative solution
    public List<List<Integer>> levelOrder(Node root) {
        // Use queue to keep track of Levels
        Queue<Node> q = new LinkedList<Node>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (root == null) return res;
        q.add(root);
        
        while (q.size() > 0) {
            int sz = q.size();
            List<Integer> l = new ArrayList<Integer>();
            
            for (int i = 0; i < sz; i++) {
                Node curr = q.poll();
                for (Node n : curr.children) {
                    q.add(n);
                }
                l.add(curr.val);
            }
            res.add(new ArrayList<Integer>(l));
        }
        return res;
    }
}