package solution.leetcode.linkedlist;

import java.math.BigInteger;

import solution.leetcode.types.ListNode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode reversed_l1 = reverseListNode(l1);
        ListNode reversed_l2 = reverseListNode(l2);
        
        BigInteger bi1 = toBigInteger(reversed_l1);
        BigInteger bi2 = toBigInteger(reversed_l2);

        BigInteger sum = bi1.add(bi2);
        return toReversedListNode(sum);
    }

    private ListNode reverseListNode(ListNode head) {
        ListNode node = head, prev = null;
        while (node != null) {
            ListNode next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        return prev;
    }

    private BigInteger toBigInteger(ListNode head) {
        StringBuilder sb = new StringBuilder();
        ListNode node = head;
        while (node != null) {
            sb.append(node.val);
            node = node.next;
        }
        return new BigInteger(sb.toString());
    }

    private ListNode toReversedListNode(BigInteger bi) {
        ListNode node = null;
        for (char c : bi.toString().toCharArray()) {
            node = new ListNode(Character.digit(c, 10), node);
        }
        return node;
    }
}
