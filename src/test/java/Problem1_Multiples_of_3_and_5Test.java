import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem1_Multiples_of_3_and_5Test {

    @Test
    void testNegative() {
        assertEquals(0, Problem1_Multiples_of_3_and_5.sumOfThreeAndFiveDivisables(-1));
    }

    @Test
    void testZero() {
        assertEquals(0, Problem1_Multiples_of_3_and_5.sumOfThreeAndFiveDivisables(0));
    }

    @Test
    void testTen() {
        assertEquals(23, Problem1_Multiples_of_3_and_5.sumOfThreeAndFiveDivisables(10));
    }

    @Test
    void testOneThousand() {
        assertEquals(233168, Problem1_Multiples_of_3_and_5.sumOfThreeAndFiveDivisables(1000));
    }
}