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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode node = head, intervalHead = null, intervalTail = null;
        ListNode beforeInterval = null, afterInterval = null;
        if(left-right == 0)
            return head;
        for(int i = 1; node.next != null; i++, node = node.next) {
            if(i == left - 1)
                beforeInterval = node;
            if(i == left) {
                intervalHead = node;
                ListNode[] nodes = reverseTo(node, right - left);
                intervalTail = nodes[0];
                afterInterval = nodes[1];
                break;
            }
        }

        if(beforeInterval != null)
            beforeInterval.next = intervalTail;
        if(intervalHead != null)
            intervalHead.next = afterInterval;
        if(left == 1)
            return intervalTail;
        return head;
    }

    public ListNode[] reverseTo(ListNode head, int length) {
        ListNode left = head, right = head.next, nextRight = null;
        
        for(int i = 0; i < length; i++) {
            nextRight = right.next;
            right.next = left;
            left = right;
            right = nextRight;
        }

        return new ListNode[]{left, nextRight};
    }

}