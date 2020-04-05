package euler;

import euler.Problem9_Special_Pythagorean_triplet;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Problem9_Special_Pythagorean_tripletTest {

    @ParameterizedTest
    @CsvSource({"12,60","30,780","56,4200"})
    void findSummedPythagoreanTriplet(int sum, int product) {
        assertEquals(product, Problem9_Special_Pythagorean_triplet.findSummedPythagoreanTriplet(sum).product());
    }
}