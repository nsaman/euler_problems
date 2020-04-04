import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem3_Largest_prime_factorTest {

    Problem3_Largest_prime_factor primer;

    @BeforeEach
    void setUp() {
        primer = new Problem3_Largest_prime_factor();
    }

    @Test
    void testNegative() {
        assertEquals(1, primer.largestPrimeFactor(-1));
    }

    @Test
    void testZero() {
        assertEquals(1, primer.largestPrimeFactor(0));
    }

    @Test
    void testOne() {
        assertEquals(1, primer.largestPrimeFactor(1));
    }

    @Test
    void testTwo() {
        assertEquals(2, primer.largestPrimeFactor(2));
    }

    @Test
    void testFour() {
        assertEquals(2, primer.largestPrimeFactor(4));
    }

    @Test
    void testSeven() {
        assertEquals(7, primer.largestPrimeFactor(7));
    }

    @Test
    void testSeventeen() {
        assertEquals(17, primer.largestPrimeFactor(17));
    }

    @Test
    void testOneHundredForty() {
        assertEquals(7, primer.largestPrimeFactor(140));
    }

    @Test
    void testBigNumber() {
        assertEquals(6857, primer.largestPrimeFactor(600851475143L));
    }
}