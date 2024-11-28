package solution.leetcode.array;

import static org.assertj.core.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class BestTimeToBuyAndSellStockTest {

    BestTimeToBuyAndSellStock sut = new BestTimeToBuyAndSellStock();

    @ParameterizedTest
    @DisplayName("주가가 주어지면, 주식을 통해 볼 수 있는 최대 이익을 구하여 리턴한다.")
    @MethodSource("provider")
    void givenPrices_whenGetMaxProfit_thenReturnMaxProfit(int[] prices, int expected) {
        int actual = sut.maxProfit(prices);

        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> provider() {
        return Stream.of(
            Arguments.of(new int[] {7,1,5,3,6,4}, 5),
            Arguments.of(new int[] {7,6,4,3,1}, 0),
            Arguments.of(new int[] {}, 0),
            Arguments.of(new int[] {1, 6, 2, 8}, 7),
            Arguments.of(new int[] {2, 8, 1, 6}, 6),
            Arguments.of(new int[] {2, 8, 1, 9, 7}, 8)
        );
    }
}
