package solution.leetcode.array;

import static org.assertj.core.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TwoSumTest {

    TwoSum sut = new TwoSum();

    @ParameterizedTest
    @DisplayName("정수 배열과 target이 주어졌을 때, 두 수의 합이 target이 되는 정수 배열 nums의 원소들의 인덱스를 배열 형태로 리턴한다.")
    @MethodSource("provider")
    void given_when_then(int[] nums, int target, int[] expected) {
        //given

        //when
        int[] actual = sut.twoSum(nums, target);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> provider() {
        return Stream.of(
            Arguments.of(new int[] {2,7,11,15}, 9, new int[] {0,1}),
            Arguments.of(new int[] {3,2,4}, 6, new int[] {1,2}),
            Arguments.of(new int[] {3,3}, 6, new int[] {0,1})
        );
    }
}
