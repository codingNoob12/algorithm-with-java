package solution.leetcode.types;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {

    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof ListNode) {
            ListNode node = (ListNode) obj;
            if (node.next == null && this.next == null) {
                return true;
            }

            if (node.next == null || this.next == null) {
                return false;
            }
            
            return this.next.equals(node.next);
        }

        return false;
    }
}
