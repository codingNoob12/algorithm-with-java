package solution.leetcode.linkedlist;

import solution.leetcode.types.ListNode;

public class SwapNodesInPairs3 {
    public ListNode swapPairs(ListNode head) {
        if (head != null && head.next != null) {
            ListNode p = head.next;
            head.next = swapPairs(p.next);
            p.next = head;
            return p;
        }
        return head;
    }
}
