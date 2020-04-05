package euler;

public class Problem6_Sum_square_difference {

    public static void main(String[] args) {
        System.out.println(sumSquareDifference(1, 100));
    }

    public static long sumSquareDifference(int min, int max)
    {
        if(min < 1)
            throw new IllegalArgumentException("Min must be greater than 0");
        if(max < 1)
            throw new IllegalArgumentException("Max must be greater than 0");
        if(max < min)
            throw new IllegalArgumentException("Max must be greater than or equal to Min");

        return squareSum(min, max) - sumSquares(min, max);
    }

    public static long sumSquares(int min, int max) {
        long total = 0;

        for (int i = min; i <= max; i++) {
            total += i * i;
        }

        return total;
    }

    public static long squareSum(int min, int max) {
        long total = 0;

        for (int i = min; i <= max; i++) {
            total += i;
        }

        return total * total;
    }
}
