package solution.leetcode.linkedlist;

import solution.leetcode.types.ListNode;

public class SwapNodesInPairs2 {
    public ListNode swapPairs(ListNode head) {
        ListNode node = head;

        while (node != null && node.next != null) {
            int temp = node.val;
            node.val = node.next.val;
            node.next.val = temp;

            node = node.next.next;
        }

        return head;
    }
}
