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
        ListNode[] nodes = new ListNode[31];
        ListNode preHead = new ListNode(0, head), node = preHead;
        int size = 0;
        
        do {
            nodes[size] = node;
            size++;
            node = node.next;
        }
        while (node != null);

        nodes[size - n - 1].next = nodes[size - n + 1];
        return preHead.next;
    }
}