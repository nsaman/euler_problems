package euler;

public class Problem9_Special_Pythagorean_triplet {
    public static void main(String[] args) {
        PythagoreanTriplet triplet = findSummedPythagoreanTriplet(1000);
        System.out.println(triplet != null ? triplet.product() : -1);
    }

    public static PythagoreanTriplet findSummedPythagoreanTriplet(int sum) {
        for(int c = (sum + 1)/2; c > 0; c--) {
            if (c - 2 + c - 1 + c < sum)
                break;
            for(int b = c - 1; b > 0; b--) {
                if (b - 1 + b + c < sum)
                    break;
                for(int a = b - 1; a > 0; a--) {
                    if (a + b + c < sum)
                        break;

                    if(a + b + c == sum && a * a + b * b == c * c)
                        return new PythagoreanTriplet(a,b,c);
                }
            }
        }

        return null;
    }

    public static class PythagoreanTriplet {
        public int a;
        public int b;
        public int c;

        public PythagoreanTriplet(int a, int b, int c){
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public int product() {
            return a * b * c;
        }
    }
}
