import java.lang.Math;
import java.util.ArrayList;
import java.util.List;

public class Problem3_Largest_prime_factor {
    private List<Long> primes;

    public Problem3_Largest_prime_factor() {
        this.primes = new ArrayList<>();
    }

    public static void main(String[] args) {
        System.out.println((new Problem3_Largest_prime_factor()).largestPrimeFactor(600851475143L));
    }


    public long largestPrimeFactor(long number)
    {
        if(number < 1)
            return 1;

        long currentSearchedNumber = number;
        long currentLargest = 1;
        long largestPossible = (long)Math.sqrt(number);

        for (int i = 2; i <= largestPossible; i++) {
            //if(isPrime(i)) {
                boolean newLargest = false;
                while(currentSearchedNumber % i == 0) {
                    currentLargest = i;
                    currentSearchedNumber = currentSearchedNumber / i;
                    newLargest = true;
                }
                if(newLargest)
                    largestPossible = (long)Math.sqrt(number);
            //}
        }

        if(currentLargest == 1)
            return number;
        else
            return currentLargest;
    }

    private boolean isPrime(long number) {
        for(Long prime : primes) {
            if (number % prime == 0)
                return false;
        }

        primes.add(number);
        return true;
    }
}
