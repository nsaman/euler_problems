package geeksforgeeks;

//https://practice.geeksforgeeks.org/problems/special-stack/1
public class Special_Stack {

    public static void main(String[] args) {
        String input = "1\n5\n18 19 29 15 16";

        String[] rules = input.split("\n");
        for(int i = 0; i < Integer.parseInt(rules[0]); i++) {
            SpecialStack stack = new SpecialStack(Integer.parseInt(rules[i*2 + 1]), rules[i*2 + 2], Integer.parseInt(rules[i*2 + 1]));

            System.out.println(stack.getMin());
        }
    }

    public static class SpecialStack {
        private int[] stack;
        private int currentIndex;
        private Integer min;

        public SpecialStack(int numInputs, String input, int maxSize) {
            stack = new int[maxSize];
            min = null;
            currentIndex = -1;

            String[] inputs = input.split(" ");

            for(int i = 0; i < numInputs; i++) {
                push(Integer.parseInt(inputs[i]));
            }
        }

        public boolean push(int value){
            if(isFull())
                return false;

            if(min == null || value < min)
                min = value;

            currentIndex++;
            stack[currentIndex] = value;

            return true;
        }

        public Integer pop(){
            if(isEmpty())
                return null;

            currentIndex--;

            if(isEmpty())
                min = null;
            else {
                int newMin = Integer.MAX_VALUE;
                for (int i = 0; i < currentIndex; i++) {
                    if (stack[i] < newMin)
                        newMin = stack[i];
                }
                min = newMin;
            }

            return stack[currentIndex + 1];
        }

        public boolean isEmpty(){
            return currentIndex == -1;
        }

        public boolean isFull(){
            return currentIndex == stack.length - 1;
        }

        public Integer getMin(){
            return min;
        }
    }
}
