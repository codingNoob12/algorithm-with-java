package solution.leetcode.array;

import static org.assertj.core.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ArrayPartitionTest {

    ArrayPartition sut = new ArrayPartition();

    @ParameterizedTest
    @DisplayName("2n개의 원소를 가진 정수형 배열이 주어지면, 2개씩 짝을 지어 각 짝들 중 최소 값들의 합의 최댓값을 구하여 리턴한다.")
    @MethodSource("provider")
    void givenIntArray_whenGetMaximumSum_thenReturnMaxSum(int[] nums, int expected) {
        int actual = sut.arrayPairSum(nums);

        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> provider() {
        return Stream.of(
            Arguments.of(new int[] {1,4,3,2}, 4),
            Arguments.of(new int[] {6,2,6,5,1,2}, 9),
            Arguments.of(new int[] {}, 0)
        );
    }
}
