package solution.leetcode.linkedlist;

import static org.assertj.core.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import solution.leetcode.factory.ListNodeFactory;
import solution.leetcode.types.ListNode;

public class MergeTwoSortedListsTest {

    MergeTwoSortedLists sut = new MergeTwoSortedLists();

    @ParameterizedTest
    @DisplayName("연결 리스트들이 주어지면, 오름차순으로 이들을 연결하여 반환한다.")
    @MethodSource("provider")
    void givenListNodes_whenLinkInAscendingOrder_thenReturnOrderedList(ListNode list1, ListNode list2, ListNode expected) {
        ListNode actual = sut.mergeTwoLists(list1, list2);

        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> provider() {
        return Stream.of(
            Arguments.of(
                ListNodeFactory.toListNode(new int[] {1, 2, 4}),
                ListNodeFactory.toListNode(new int[] {1, 3, 4}),
                ListNodeFactory.toListNode(new int[] {1, 1, 2, 3, 4, 4})
            ),
            Arguments.of(
                ListNodeFactory.toListNode(new int[] {}),
                ListNodeFactory.toListNode(new int[] {}),
                ListNodeFactory.toListNode(new int[] {})
            ),
            Arguments.of(
                ListNodeFactory.toListNode(new int[] {}),
                ListNodeFactory.toListNode(new int[] {0}),
                ListNodeFactory.toListNode(new int[] {0})
            )
        );
    }
}
