package euler;

import euler.Problem4_Largest_palindrome_product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class Problem4_Largest_palindrome_productTest {

    @Test
    void testNullPalidrome() {
        assertTrue(Problem4_Largest_palindrome_product.isPalindrome(null));
    }

    @ParameterizedTest
    @ValueSource(strings = { "", "a", "aa", "aba", "abba", "abbcdcbba" })
    void testHappyPalidromes(String string) {
        assertTrue(Problem4_Largest_palindrome_product.isPalindrome(string));
    }

    @ParameterizedTest
    @ValueSource(strings = { "ab", "abb" })
    void testBadPalidromes(String string) {
        assertFalse(Problem4_Largest_palindrome_product.isPalindrome(string));
    }

    @Test
    void testNegativeMin() {
        assertThrows(IllegalArgumentException.class, () -> {
            Problem4_Largest_palindrome_product.largestPalindromeOfTwoMultiples(-1,9);
        });
    }

    @Test
    void testNegativeMax() {
        assertThrows(IllegalArgumentException.class, () -> {
            Problem4_Largest_palindrome_product.largestPalindromeOfTwoMultiples(1,-1);
        });
    }

    @Test
    void testMaxLessThanMin() {
        assertThrows(IllegalArgumentException.class, () -> {
            Problem4_Largest_palindrome_product.largestPalindromeOfTwoMultiples(5,4);
        });
    }

    @Test
    void testLargestPalidromeOneDigits() {
        assertEquals(9, Problem4_Largest_palindrome_product.largestPalindromeOfTwoMultiples(1,9));
    }

    @Test
    void testLargestPalidromeTwoDigits() {
        assertEquals(9009, Problem4_Largest_palindrome_product.largestPalindromeOfTwoMultiples(10,99));
    }

    @ParameterizedTest
    @CsvSource({ "5,5", "5,6" })
    void testLargestPalidromeNoPalidromeFound(int min, int max) {
        assertEquals(-1, Problem4_Largest_palindrome_product.largestPalindromeOfTwoMultiples(min,max));
    }
}