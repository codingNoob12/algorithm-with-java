package solution.leetcode.string;

import static org.assertj.core.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ReverseStringTest {

    ReverseString sut = new ReverseString();

    @ParameterizedTest
    @DisplayName("문자형 배열이 주어지면, 원소들의 순서를 역순으로 뒤집는다.")
    @MethodSource("provideArguments")
    void givenCharArray_whenReverseString_thenDoNothing(char[] s, char[] expected) {
        // given

        // when
        sut.reverseString(s);

        // then
        assertThat(s).isEqualTo(expected);
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new char[] { 'h', 'e', 'l', 'l', 'o' }, new char[] { 'o', 'l', 'l', 'e', 'h' }),
                Arguments.of(new char[] { 'H', 'a', 'n', 'n', 'a', 'h' }, new char[] { 'h', 'a', 'n', 'n', 'a', 'H' }),
                Arguments.of(new char[] {}, new char[] {}),
                Arguments.of(new char[] { 'a' }, new char[] { 'a' }));
    }
}
