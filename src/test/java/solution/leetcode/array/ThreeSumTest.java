package solution.leetcode.array;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ThreeSumTest {
    
    ThreeSum sut = new ThreeSum();

    @ParameterizedTest
    @DisplayName("정수 배열이 주어지면, 서로 다른 인덱스의 세 원소들의 합이 0이되는 조합을 구하여 리턴한다.")
    @MethodSource("provider")
    void givenIntArray_whenGetCombinationsThatSumOfThreeItemIsZero_thenReturnSuchCombination(int[] nums, List<List<Integer>> expected) {
        List<List<Integer>> actual = sut.threeSum(nums);

        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> provider() {
        return Stream.of(
            Arguments.of(
                new int[] {-1,0,1,2,-1,-4},
                Arrays.asList(Arrays.asList(-1,-1,2), Arrays.asList(-1,0,1))
            ),
            Arguments.of(
                new int[] {0,1,1},
                Arrays.asList()
            ),
            Arguments.of(
                new int[] {0,0,0},
                Arrays.asList(Arrays.asList(0, 0, 0))
            )
        );
    }
}
