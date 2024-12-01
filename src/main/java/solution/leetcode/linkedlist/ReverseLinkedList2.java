package solution.leetcode.linkedlist;

import solution.leetcode.types.ListNode;

public class ReverseLinkedList2 {
    public ListNode reverseList(ListNode head) {
        return reverse(head, null);
    }

    private ListNode reverse(ListNode node, ListNode prev) {
        if (node == null) {
            return prev;
        }

        ListNode next = node.next;
        node.next = prev;
        return reverse(next, node);
    }
}
