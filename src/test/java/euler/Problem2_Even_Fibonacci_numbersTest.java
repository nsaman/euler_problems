package euler;

import euler.Problem2_Even_Fibonacci_numbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem2_Even_Fibonacci_numbersTest {

    @Test
    void testNegative() {
        assertEquals(0, Problem2_Even_Fibonacci_numbers.sumOfEvenFibonacci(-1));
    }

    @Test
    void testZero() {
        assertEquals(0, Problem2_Even_Fibonacci_numbers.sumOfEvenFibonacci(0));
    }

    @Test
    void testOne() {
        assertEquals(0, Problem2_Even_Fibonacci_numbers.sumOfEvenFibonacci(0));
    }

    @Test
    void testTwo() {
        assertEquals(2, Problem2_Even_Fibonacci_numbers.sumOfEvenFibonacci(2));
    }

    @Test
    void testEight() {
        assertEquals(10, Problem2_Even_Fibonacci_numbers.sumOfEvenFibonacci(8));
    }

    @Test
    void testFourMillion() {
        assertEquals(4613732, Problem2_Even_Fibonacci_numbers.sumOfEvenFibonacci(4000000));
    }
}