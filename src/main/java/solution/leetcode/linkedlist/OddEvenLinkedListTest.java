package solution.leetcode.linkedlist;

import static org.assertj.core.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import solution.leetcode.factory.ListNodeFactory;
import solution.leetcode.types.ListNode;

public class OddEvenLinkedListTest {

    OddEvenLinkedList sut = new OddEvenLinkedList();

    @ParameterizedTest
    @DisplayName("연결리스트가 주어지면, 홀수번째 인덱스인 노드들과 짝수번째 인덱스인 노드들을 묶어서 이들을 하나의 리스트로 만들어라 반환해라")
    @MethodSource("provider")
    void given_when_then(ListNode head, ListNode expected) {
        ListNode actual = sut.oddEvenList(head);

        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> provider() {
        return Stream.of(
            Arguments.of(
                ListNodeFactory.toListNode(new int[] {1,2,3,4,5}),
                ListNodeFactory.toListNode(new int[] {1,3,5,2,4})
            ),
            Arguments.of(
                ListNodeFactory.toListNode(new int[] {2,1,3,5,6,4,7}),
                ListNodeFactory.toListNode(new int[] {2,3,6,7,1,5,4})
            )
        );
    }
}
