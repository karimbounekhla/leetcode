/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        // Initialize Stack and pointer to start of list
        ListNode list = head;
        Stack st = new Stack ();

        // Loop through linked list, pushing every element to stack
        while(list != null)   {
            st.push(list.val);
            list = list.next;
        }

        // Loop through linked list again, checking that popped element equals element
        // If not equal, Linked List not palindromic
        while(head!=null)   {
            if(!st.pop().equals(head.val)) {
                return false;
            }
            head = head.next;
        }

        return true;
        }
}
