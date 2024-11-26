package solution.leetcode.array;

import static org.assertj.core.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductOfArrayExceptSelfTest {

    ProductOfArrayExceptSelf sut = new ProductOfArrayExceptSelf();

    @ParameterizedTest
    @DisplayName("정수형 배열이 주어지면, 각 인덱스별로 자신을 제외한 나머지 원소들의 곱을 갖도록 하는 새로운 배열을 만들어 리턴한다.")
    @MethodSource("provider")
    void givenIntArray_whenGetIntArrayThatEachElementIsProductExceptSelf_thenReturnSuchArray(int[] nums, int[] expected) {
        int[] actual = sut.productExceptSelf(nums);

        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> provider() {
        return Stream.of(
            Arguments.of(new int[] {1,2,3,4}, new int[] {24,12,8,6}),
            Arguments.of(new int[] {-1,1,0,-3,3}, new int[] {0,0,9,0,0}),
            Arguments.of(new int[] {}, new int[] {}),
            Arguments.of(new int[] {6}, new int[] {1})
        );
    }
}
