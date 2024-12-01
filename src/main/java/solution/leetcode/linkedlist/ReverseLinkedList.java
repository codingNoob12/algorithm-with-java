package solution.leetcode.linkedlist;

import solution.leetcode.types.ListNode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode node = head, prev = null;
        while (node != null) {
            ListNode next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        return prev;
    }
}
