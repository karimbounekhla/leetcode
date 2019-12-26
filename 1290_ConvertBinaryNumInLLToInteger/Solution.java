/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        int output = 0;
        ListNode curr = head;
        while (curr != null) {
            output = output * 2 + curr.val;
            curr = curr.next;
        }
        return output;
    }
}