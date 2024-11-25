package solution.leetcode.string;

import static org.assertj.core.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class MostCommonWordTest {

    MostCommonWord sut = new MostCommonWord();

    @ParameterizedTest
    @DisplayName("문장과 금지 단어가 주어지면, 금지 단어를 제외한 단어들 중 최빈값을 리턴한다.")
    @MethodSource("provider")
    void givenParagraphAndBanned_whenGetMostCommonWord_thenReturnMostCommonWword(String paragraph, String[] banned, String expected) {
        //given

        //when
        String actual = sut.mostCommonWord(paragraph, banned);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> provider() {
        return Stream.of(
            Arguments.of(
                "Bob hit a ball, the hit BALL flew far after it was hit.",
                new String[] {"hit"},
                "ball"
            ),
            Arguments.of(
                "a.",
                new String[] {},
                "a"
            ),
            Arguments.of(
                "Bob hit a    ball, the __&*()0546 hit BALL flew far after it was hit.",
                new String[] {"hit"},
                "ball"
            ),
            Arguments.of(
                "",
                new String[] {},
                ""
            )
        );
    }
}
