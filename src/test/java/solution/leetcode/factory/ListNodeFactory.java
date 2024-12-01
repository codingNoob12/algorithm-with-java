package solution.leetcode.factory;

import solution.leetcode.types.ListNode;

public class ListNodeFactory {

    public static ListNode toListNode(int[] values) {
        ListNode root = new ListNode();
        ListNode node = root;
        for (int value : values) {
            node.next = new ListNode(value);
            node = node.next;
        }
        return root.next;
    }
}
