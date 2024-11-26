package solution.leetcode.array;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TrappingRainWater2Test {

    TrappingRainWater2 sut = new TrappingRainWater2();

    @ParameterizedTest
    @DisplayName("높이가 주어지면, 얼마만큼의 빗물이 저장될 수 있는지 계산하여 리턴한다.")
    @MethodSource("provider")
    void givenHeights_whenCalculatesTrappingRainWater_thenReturnsSuchWaters(int[] height, int expected) {
        int actual = sut.trap(height);

        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> provider() {
        return Stream.of(
            Arguments.of(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}, 6),
            Arguments.of(new int[] {4,2,0,3,2,5}, 9),
            Arguments.of(new int[] {3,3,3,3,3}, 0),
            Arguments.of(new int[] {}, 0)
        );
    }
}
