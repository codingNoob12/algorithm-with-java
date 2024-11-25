package solution.leetcode.string;

import static org.assertj.core.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class LongestPalindromicSubstringTest {

    LongestPalindromicSubstring sut = new LongestPalindromicSubstring();

    @ParameterizedTest
    @DisplayName("문자열이 주어지면, 가장 긴 팰린드롬 부분 문자열을 리턴한다.")
    @MethodSource("provider")
    void givenString_whenGetLongestPalindromicSubstring_thenReturnSuchString(String s, String expected) {
        //given

        //when
        String actual = sut.longestPalindrome(s);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> provider() {
        return Stream.of(
            Arguments.of("babad", "bab"),
            Arguments.of("cbbd", "bb"),
            Arguments.of("", ""),
            Arguments.of("ab", "b"),
            Arguments.of("a", "a")
        );
    }
}
