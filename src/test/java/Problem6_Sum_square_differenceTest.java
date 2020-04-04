import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Problem6_Sum_square_differenceTest {

    @ParameterizedTest
    @CsvSource({"1,1,0", "1,2,4", "1,10,2640"})
    void sumSquareDifference(int min, int max, int result) {
        assertEquals(result, Problem6_Sum_square_difference.sumSquareDifference(min, max));
    }

    @ParameterizedTest
    @CsvSource({"1,1,1", "1,2,5", "1,10,385"})
    void sumSquares(int min, int max, int result) {
        assertEquals(result, Problem6_Sum_square_difference.sumSquares(min, max));
    }

    @ParameterizedTest
    @CsvSource({"1,1,1", "1,2,9", "1,10,3025"})
    void squareSum(int min, int max, int result) {
        assertEquals(result, Problem6_Sum_square_difference.squareSum(min, max));
    }
}