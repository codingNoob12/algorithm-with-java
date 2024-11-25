package solution.leetcode.string;

import static org.assertj.core.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ReorderDataInLogFilesTest {

    ReorderDataInLogFiles sut = new ReorderDataInLogFiles();

    @ParameterizedTest
    @DisplayName("로그 파일들이 주어지면, 조건에 맞게 정렬하여 리턴한다.")
    @MethodSource("provideArguments")
    void givenLogsFiles_whenReorderLogFiles_thenReturnLogFiles(String[] logs, String[] expected) {
        // given

        // when
        String[] reordered = sut.reorderLogFiles(logs);

        // then
        assertThat(reordered).isEqualTo(expected);
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(
                        new String[] { "dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig",
                                "let3 art zero" },
                        new String[] { "let1 art can", "let3 art zero", "let2 own kit dig", "dig1 8 1 5 1",
                                "dig2 3 6" }),
                Arguments.of(
                        new String[] { "a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo" },
                        new String[] { "g1 act car", "a8 act zoo", "ab1 off key dog", "a1 9 2 3 1", "zo4 4 7" }),
                Arguments.of(
                        new String[] { "dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "aaa art can" },
                        new String[] { "aaa art can", "let1 art can", "let2 own kit dig", "dig1 8 1 5 1", "dig2 3 6" }));
    }
}
