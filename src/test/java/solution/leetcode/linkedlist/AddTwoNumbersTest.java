package solution.leetcode.linkedlist;

import static org.assertj.core.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import solution.leetcode.factory.ListNodeFactory;
import solution.leetcode.types.ListNode;

public class AddTwoNumbersTest {

    AddTwoNumbers sut = new AddTwoNumbers();

    @ParameterizedTest
    @DisplayName("두 개의 연결 리스트가 주어졌을 때, 이를 뒤집어 합을 구한 뒤, 다시 뒤집어 반환한다.")
    @MethodSource("provider")
    void givenListNodes_whenReverseAndCalculateSumOfTheLists_thenReturnTheSumListInReverseOrder(ListNode l1, ListNode l2, ListNode expected) {
        ListNode actual = sut.addTwoNumbers(l1, l2);

        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> provider() {
        return Stream.of(
            Arguments.of(
                ListNodeFactory.toListNode(new int[] {2,4,3}),
                ListNodeFactory.toListNode(new int[] {5,6,4}),
                ListNodeFactory.toListNode(new int[] {7,0,8})
            ),
            Arguments.of(
                ListNodeFactory.toListNode(new int[] {0}),
                ListNodeFactory.toListNode(new int[] {0}),
                ListNodeFactory.toListNode(new int[] {0})
            ),
            Arguments.of(
                ListNodeFactory.toListNode(new int[] {9,9,9,9,9,9,9}),
                ListNodeFactory.toListNode(new int[] {9,9,9,9}),
                ListNodeFactory.toListNode(new int[] {8,9,9,9,0,0,0,1})
            )
        );
    }
}
