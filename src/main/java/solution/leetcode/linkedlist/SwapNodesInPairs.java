package solution.leetcode.linkedlist;

import solution.leetcode.types.ListNode;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode root = new ListNode(0, head);
        ListNode node = head, prev = root;
        while (node != null && node.next != null) {
            ListNode next = node.next;
            node.next = next.next;
            next.next = node;
            prev.next = next;
            
            prev = node;
            node = node.next;
        }

        return root.next;
    }
}
