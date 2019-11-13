class MinStack {

    // Create linked-list data structure containing the item and minimum
    private class Node {
        int item;
        int min;
        Node next;
        
        Node (int item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    // Head node
    Node start;

    public MinStack() {
    }
    
    // Add item onto stack
    public void push(int x) {
        // If no items in stack
        if (start == null) {
            start = new Node(x, null);
            start.min = x;
            return;
        }
        Node oldStart = start;
        start = new Node(x, oldStart);
        
        // Set current minimum value when each Node is inserted
        // This ensures that getting the min is a O(1) operation
        start.min = (x <= oldStart.min) ? x : oldStart.min;
    }
    
    public void pop() {
        start = start.next;
    }
    
    public int top() {
        return start.item;
    }
    
    // Get min value from node on top of stack
    public int getMin() {
        return start.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */