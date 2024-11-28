package solution.leetcode.linkedlist;

import static org.assertj.core.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import solution.leetcode.types.ListNode;

public class PalindromeLinkedListTest2 {

    PalindromeLinkedList2 sut = new PalindromeLinkedList2();

    @ParameterizedTest
    @DisplayName("연결리스트의 head가 주어지면, 해당 연결리스트가 팰린드롬을 만족하는지를 결과로 리턴한다.")
    @MethodSource("provider")
    public void givenLinkedList_whenCheckWhetherItIsPalindrome_thenReturnTheResult(ListNode head, boolean expected) {
        boolean actual = sut.isPalindrome(head);

        assertThat(actual).isEqualTo(expected);
    }

    private static ListNode createList(int[] values) {
        ListNode root = new ListNode();
        ListNode node = root;
        for (int value : values) {
            node.next = new ListNode(value);
            node = node.next;
        }
        return root.next;
    }

    private static Stream<Arguments> provider() {
        return Stream.of(
            Arguments.of(createList(new int[] {1, 2, 2, 1}), true),
            Arguments.of(createList(new int[] {1, 2}), false),
            Arguments.of(createList(new int[] {}), true),
            Arguments.of(createList(new int[] {1}), true),
            Arguments.of(createList(new int[] {1, 2, 3, 2, 1}), true)
        );
    }
}
