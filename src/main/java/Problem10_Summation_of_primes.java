public class Problem10_Summation_of_primes {
    public static void main(String[] args) {
        System.out.println(sumOfPrimeUnder(2000000));
    }

    public static long sumOfPrimeUnder(int stopAt) {
        Problem3_Largest_prime_factor primer = new Problem3_Largest_prime_factor();

        long total = 0;
        for(int i = 2; i < stopAt; i++) {
            if(primer.isPrime(i))
                total += i;
        }

        return total;
    }
}
