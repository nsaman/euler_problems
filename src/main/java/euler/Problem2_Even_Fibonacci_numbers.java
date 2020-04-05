package euler;

public class Problem2_Even_Fibonacci_numbers {
    public static void main(String[] args) {
        System.out.println(sumOfEvenFibonacci(4000000));
    }

    public static long sumOfEvenFibonacci(int max) {
        long sum = 0;

        int firstNumber = 1;
        int secondNumber = 2;
        while (firstNumber <= max) {
            if(firstNumber % 2 == 0)
                sum += firstNumber;
            int temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = firstNumber + temp;
        }

        return sum;
    }
}
