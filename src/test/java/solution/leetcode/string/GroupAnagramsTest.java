package solution.leetcode.string;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class GroupAnagramsTest {

    GroupAnagrams sut = new GroupAnagrams();

    @ParameterizedTest
    @DisplayName("")
    @MethodSource("provider")
    void givenStrings_whenGetGroupAnagrams_thenReturnGroupAnagrams(String[] strs, List<List<String>> expected) {
        // given

        // when
        List<List<String>> actual = sut.groupAnagrams(strs);

        // then
        assertThat(sortedList(actual)).isEqualTo(sortedList(expected));
    }

    private List<List<String>> sortedList(List<List<String>> lists) {
        return lists.stream()
                .map(l -> l.stream()
                        .sorted()
                        .collect(Collectors.toList()))
                .sorted((list1, list2) -> list1.size() - list2.size())
                .collect(Collectors.toList());
    }

    private static Stream<Arguments> provider() {
        return Stream.of(
                Arguments.of(
                        new String[] { "eat", "tea", "tan", "ate", "nat", "bat" },
                        Arrays.asList(Arrays.asList("bat"), Arrays.asList("nat", "tan"),
                                Arrays.asList("ate", "eat", "tea"))),
                Arguments.of(
                        new String[] { "" },
                        Arrays.asList(Arrays.asList(""))),
                Arguments.of(
                        new String[] { "a" },
                        Arrays.asList(Arrays.asList("a"))));
    }
}
