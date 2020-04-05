import java.util.HashMap;
import java.util.Map;
import java.lang.Math;

public class Problem5_Smallest_multiple {

    public static void main(String[] args) {
        System.out.println(smallestMultiple(1, 20));
    }

    public static int smallestMultiple(int min, int max)
    {
        Map<Integer,Integer> totalDivisors = new HashMap<>();
        int returnMultiple = 1;

        if(min < 1)
            throw new IllegalArgumentException("Min must be greater than 0");
        if(max < 1)
            throw new IllegalArgumentException("Max must be greater than 0");
        if(max < min)
            throw new IllegalArgumentException("Max must be greater than or equal to Min");

        if(max == 1)
            return 1;
        if(min == 1)
            min = 2;


        for(int i = min; i <= max; i++) {
            Map<Integer,Integer> divisors = getDivisors(i);
            for (Map.Entry<Integer,Integer> divisor : divisors.entrySet()) {
                if(!totalDivisors.containsKey(divisor.getKey()))
                    totalDivisors.put(divisor.getKey(),0);
                if(totalDivisors.get(divisor.getKey()) < divisors.get(divisor.getKey()))
                    totalDivisors.put(divisor.getKey(), divisor.getValue());
            }
        }

        for (Map.Entry<Integer,Integer> divisor : totalDivisors.entrySet()) {
            returnMultiple *= Math.pow(divisor.getKey(),divisor.getValue());
        }

        return returnMultiple;
    }

    public static Map<Integer,Integer> getDivisors(int number) {
        Map<Integer,Integer> divisors = new HashMap<>();
        divisors.put(1,1);

        for(int i = 2; i <= number; i++) {
            while(number % i == 0) {
                if(!divisors.containsKey(i))
                    divisors.put(i,0);
                divisors.put(i,divisors.get(i) + 1);
                number /= i;
            }
        }

        return divisors;
    }
}
