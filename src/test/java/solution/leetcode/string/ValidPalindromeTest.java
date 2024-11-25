package solution.leetcode.string;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ValidPalindromeTest {

    ValidPalindrome sut = new ValidPalindrome();

    @ParameterizedTest
    @DisplayName("팰린드롬 문자열이 주어지면, true를 반환한다.")
    @ValueSource(strings = { "A man, a plan, a canal: Panama", " ", "_aba_", "" })
    void givenPalindrome_whenCheckingThatItIsPalindrome_thenReturnTrue(String s) {
        //given

        //when
        boolean isPalindrome = sut.isPalindrome(s);

        //then
        assertThat(isPalindrome).isTrue();
    }

    @ParameterizedTest
    @DisplayName("팰린드롬이 아닌 문자열이 주어지면, false를 반환한다.")
    @ValueSource(strings = { "race a car", "0P" })
    void givenNonpalindrome_whenCheckingThatItIsPalindrome_thenReturnFalse(String s) {
        //given
        
        //when
        boolean isPalindrome = sut.isPalindrome(s);

        //then
        assertThat(isPalindrome).isFalse();
    }
}
