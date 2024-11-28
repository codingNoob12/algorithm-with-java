package solution.leetcode.linkedlist;

import java.util.ArrayDeque;
import java.util.Deque;

import solution.leetcode.types.ListNode;

public class PalindromeLinkedList2 {
    public boolean isPalindrome(ListNode head) {
        Deque<ListNode> stack = new ArrayDeque<>();
        ListNode node = head;
        while (node != null) {
            stack.push(node);
            node = node.next;
        }

        while (!stack.isEmpty()) {
            if (stack.pop().val != head.val) {
                return false;
            }
            head = head.next;
        }
        return true;
    }
}
