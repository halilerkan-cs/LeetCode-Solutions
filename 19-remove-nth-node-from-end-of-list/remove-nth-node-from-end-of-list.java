/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head, fast = head, preSlow = null;
        
        for(int i = 0; i < n-1; i++, fast = fast.next);
        for(; fast.next != null; fast = fast.next, slow = slow.next)
            preSlow = slow;

        if(slow == head)
            return head.next;
        preSlow.next = slow.next;
        return head;
    }
}