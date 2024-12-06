package solution.leetcode.linkedlist;

import static org.assertj.core.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import solution.leetcode.factory.ListNodeFactory;
import solution.leetcode.types.ListNode;

public class SwapNodesInPairsTest2 {

    SwapNodesInPairs2 sut = new SwapNodesInPairs2();

    @ParameterizedTest
    @DisplayName("연결 리스트가 주어졌을 때, 짝끼리 교환하여 반환한다.")
    @MethodSource("provider")
    void givenListNode_whenSwapNodesInPair_thenReturnSwapedListNode(ListNode head, ListNode expected) {
        ListNode actual = sut.swapPairs(head);

        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> provider() {
        return Stream.of(
            Arguments.of(
                ListNodeFactory.toListNode(new int[] {1,2,3,4}),
                ListNodeFactory.toListNode(new int[] {2,1,4,3})
            ),
            Arguments.of(
                ListNodeFactory.toListNode(new int[] {}),
                ListNodeFactory.toListNode(new int[] {})
            ),
            Arguments.of(
                ListNodeFactory.toListNode(new int[] {1}),
                ListNodeFactory.toListNode(new int[] {1})
            ),
            Arguments.of(
                ListNodeFactory.toListNode(new int[] {1,2,3}),
                ListNodeFactory.toListNode(new int[] {2,1,3})
            )
        );
    }
}
