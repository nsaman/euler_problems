public class Problem7_10001st_prime {
    public static void main(String[] args) {
        System.out.println(nthPrime(10001));
    }

    public static long nthPrime(int primeIndex) {
        if (primeIndex < 1)
            throw new IllegalArgumentException("Index must be greater than 0");

        Problem3_Largest_prime_factor primer = new Problem3_Largest_prime_factor();

        long currentNumber = 2;
        while(true) {
            if(primer.isPrime(currentNumber) && primer.getPrimeSize() == primeIndex)
                return currentNumber;
            else
                currentNumber++;
        }
    }
}
