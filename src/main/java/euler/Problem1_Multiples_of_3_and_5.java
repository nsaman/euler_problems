package euler;

public class Problem1_Multiples_of_3_and_5 {
    public static void main(String[] args) {
        System.out.println(sumOfThreeAndFiveDivisables(1000));
    }

    public static int sumOfThreeAndFiveDivisables(int underMax) {
        int sum = 0;
        for(int i = 0; i < underMax; i++) {
            if(i % 3 == 0 || i % 5 == 0)
                sum += i;
        }

        return sum;
    }
}
