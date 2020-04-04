import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Problem7_10001st_primeTest {

    @ParameterizedTest
    @CsvSource({"1,2", "2,3", "6,13"})
    void nthPrime(int index, int result) {
        assertEquals(result, Problem7_10001st_prime.nthPrime(index));
    }
}