package euler;

import euler.Problem5_Smallest_multiple;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Problem5_Smallest_multipleTest {

    @ParameterizedTest
    @CsvSource({"1,1,1", "5,5,5", "1,5,60", "1,10,2520"})
    void smallestMultipleHappy(int min, int max, int smallestMultiple) {
        assertEquals(smallestMultiple, Problem5_Smallest_multiple.smallestMultiple(min,max));
    }

    @Test
    void smallestMultipleMinMustBePositive() {
        assertThrows(IllegalArgumentException.class, () -> {Problem5_Smallest_multiple.smallestMultiple(0,1);});
    }

    @Test
    void smallestMultipleMaxMustBePositive() {
        assertThrows(IllegalArgumentException.class, () -> {Problem5_Smallest_multiple.smallestMultiple(1,0);});
    }

    @Test
    void smallestMultipleMaxMustBeGreaterThanEqualMin() {
        assertThrows(IllegalArgumentException.class, () -> {Problem5_Smallest_multiple.smallestMultiple(2,1);});
    }

    @Test
    void getDivisorsOne() {
        Map<Integer,Integer> result = Problem5_Smallest_multiple.getDivisors(1);

        assertEquals(1,result.size());
        assertEquals(1,result.get(1));
    }

    @Test
    void getDivisorsTwenty() {
        Map<Integer,Integer> result = Problem5_Smallest_multiple.getDivisors(20);

        assertEquals(3,result.size());
        assertEquals(1,result.get(1));
        assertEquals(2,result.get(2));
        assertEquals(1,result.get(5));
    }
}