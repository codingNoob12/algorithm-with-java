package solution.leetcode.linkedlist;

import static org.assertj.core.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import solution.leetcode.factory.ListNodeFactory;
import solution.leetcode.types.ListNode;

public class ReverseLinkedListTest {

    ReverseLinkedList sut = new ReverseLinkedList();

    @ParameterizedTest
    @DisplayName("연결 리스트가 주어지면, 해당 리스트를 뒤집은 뒤 반환한다.")
    @MethodSource("provider")
    void givenListNode_whenReverseListNode_thenReturnListNode(ListNode head, ListNode expected) {
        ListNode actual = sut.reverseList(head);

        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> provider() {
        return Stream.of(
            Arguments.of(
                ListNodeFactory.toListNode(new int[] {1,2,3,4,5}),
                ListNodeFactory.toListNode(new int[] {5,4,3,2,1})
            ),
            Arguments.of(
                ListNodeFactory.toListNode(new int[] {1,2}),
                ListNodeFactory.toListNode(new int[] {2,1})
            ),
            Arguments.of(
                ListNodeFactory.toListNode(new int[] {}),
                ListNodeFactory.toListNode(new int[] {})
            )
        );
    }
}
