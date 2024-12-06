package solution.leetcode.linkedlist;

import solution.leetcode.types.ListNode;

public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        ListNode oddRoot = new ListNode(), evenRoot = new ListNode();
        ListNode odd = oddRoot, even = evenRoot, node = head;
        
        int count = 0;
        while (node != null) {
            count++;
            if (count % 2 == 0) {
                even.next = node;
                even = even.next;
            } else {
                odd.next = node;
                odd = odd.next;
            }

            node = node.next;
        }
        odd.next = evenRoot.next;
        even.next = null;

        return oddRoot.next;
    }
}
