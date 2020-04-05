package geeksforgeeks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://practice.geeksforgeeks.org/problems/pythagorean-triplet/0
public class Pythagorean_Triplet {
    public static void main(String[] args) {
        String input = "1\n5\n3 2 4 6 5";
        List<PythagoreanTripletTest> tests = parseTests(input);

        for (PythagoreanTripletTest test : tests) {
            System.out.println(test.getResult() ? "Yes" : "No");
        }
    }

    public static List<PythagoreanTripletTest> parseTests(String input) {
        String[] inputLines = input.split("\n");

        List<PythagoreanTripletTest> tests = new ArrayList<>();

        for(int i = 0; i < Integer.parseInt(inputLines[0]); i++) {
            int numberOfElements = Integer.parseInt(inputLines[1+i*2]);

            String[] elementStrings = inputLines[2+i*2].split(" ");
            List<Integer> elements = new ArrayList<>();
            for(int j = 0; j < numberOfElements; j++) {
                elements.add(Integer.parseInt(elementStrings[j]));
            }

            tests.add(new PythagoreanTripletTest(elements));
        }

        return tests;
    }

    public static class PythagoreanTripletTest {
        private List<Integer> elements;

        public PythagoreanTripletTest(List<Integer> elements) {
            this.elements = elements;
        }

        public List<Integer> getElements() {
            return elements;
        }

        public boolean getResult() {
            if(elements == null || elements.size() < 3)
                return false;

            List<Integer> copy = new ArrayList<>(elements);
            Collections.sort(copy);

            for (int aIndex = 0; aIndex < copy.size() - 2; aIndex++) {
                int a = copy.get(aIndex);
                for(int bIndex = aIndex + 1; bIndex < copy.size() - 1; bIndex++) {
                    int b = copy.get(bIndex);
                    double realC = Math.sqrt((a * a + b * b));
                    int intC = (int)Math.floor(realC);
                    if(Double.isInfinite(realC) || a * a + b * b - intC * intC != 0)
                        continue;

                    List<Integer> sublist = copy.subList(bIndex + 1, copy.size());
                    while(sublist.size() > 0) {
                        int pivotIndex = sublist.size() / 2;
                        int pivot = sublist.get(pivotIndex);
                        if(intC > pivot) {
                            if(pivotIndex == sublist.size() - 1)
                                break;
                            sublist = sublist.subList(pivotIndex + 1, sublist.size());
                        }
                        else if (intC < pivot) {
                            if(pivotIndex == 0)
                                break;
                            sublist = sublist.subList(0, pivotIndex);
                        }
                        else
                            return true;
                    }
                }
            }

            return false;
        }
    }
}
