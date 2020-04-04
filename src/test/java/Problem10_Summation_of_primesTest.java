import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Problem10_Summation_of_primesTest {

    @ParameterizedTest
    @CsvSource({"1,0", "3,2", "10,17"})
    void sumOfPrimeUnder(int stopAt, int result) {
        assertEquals(result, Problem10_Summation_of_primes.sumOfPrimeUnder(stopAt));
    }
}