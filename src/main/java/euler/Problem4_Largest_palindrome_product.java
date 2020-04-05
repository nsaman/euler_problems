package euler;

import org.apache.commons.lang3.StringUtils;

public class Problem4_Largest_palindrome_product {

    public static void main(String[] args) {
        System.out.println(largestPalindromeOfTwoMultiples(100, 999));
    }


    public static int largestPalindromeOfTwoMultiples(int min, int max)
    {
        if(min < 0)
            throw new IllegalArgumentException("Min must be greater than 0");
        if(max < 0)
            throw new IllegalArgumentException("Max must be greater than 0");
        if(max < min)
            throw new IllegalArgumentException("Max must be greater than or equal to Min");

        int currentLargest = -1;
        for(int i = max; i >= min; i--) {
            for(int j = i; j >= min; j--) {
                int product = i * j;
                if(product <= currentLargest) {
                    if (i == j)
                        return currentLargest;
                    break;
                }
                else if(isPalindrome(Integer.toString(product)))
                    currentLargest = product;
            }
        }

        return currentLargest;
    }

    public static boolean isPalindrome(String string) {
        if(StringUtils.isEmpty(string))
            return true;
        for (int i = 0; i < (string.length() + 1) / 2; i++) {
            if(string.charAt(i) != string.charAt(string.length() - 1 - i))
                return false;
        }

        return true;
    }
}
