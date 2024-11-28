package solution.leetcode.linkedlist;

import solution.leetcode.types.ListNode;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        
        ListNode fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        if (fast.next != null) {
            slow = slow.next;
        }

        ListNode node = slow, rev = null;
        while (node != null) {
            ListNode next = node.next;
            node.next = rev;
            rev = node;
            node = next;
        }

        while (head != slow) {
            if (head.val != rev.val) {
                return false;
            }
            head = head.next;
            rev = rev.next;
        }

        return true;
    }
}
