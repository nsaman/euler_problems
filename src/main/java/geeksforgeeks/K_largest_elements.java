package geeksforgeeks;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://practice.geeksforgeeks.org/problems/k-largest-elements/0
public class K_largest_elements {
    public static void main(String[] args) {
        String input = "2\n5 2\n12 5 787 1 23\n7 3\n1 23 12 9 30 2 50";
        List<Test> tests = parseTests(input);

        List<List<Integer>> results = getTestsResults(tests);

        for (List<Integer> result : results) {
            System.out.println(StringUtils.join(result, " "));
        }
    }

    public static List<Test> parseTests(String input) {
        String[] inputLines = input.split("\n");

        List<Test> tests = new ArrayList<>();

        for(int i = 0; i < Integer.parseInt(inputLines[0]); i++) {
            String[] testRules = inputLines[1+i*2].split(" ");
            int numberOfElements = Integer.parseInt(testRules[0]);
            int numLargestElements = Integer.parseInt(testRules[1]);

            String[] elementStrings = inputLines[2+i*2].split(" ");
            List<Integer> elements = new ArrayList<>();
            for(int j = 0; j < numberOfElements; j++) {
                elements.add(Integer.parseInt(elementStrings[j]));
            }

            tests.add(new Test(numLargestElements,elements));
        }

        return tests;
    }

    public static List<List<Integer>> getTestsResults(List<Test> tests) {
        List<List<Integer>> testResults = new ArrayList<>();
        for (Test test : tests) {
            testResults.add(test.getResult());
        }

        return testResults;
    }

    public static class Test {
        private int numLargestElements;
        private List<Integer> elements;

        public Test(int numLargestElements, List<Integer> elements) {
            this.numLargestElements = numLargestElements;
            this.elements = elements;
        }

        public int getNumLargestElements() {
            return numLargestElements;
        }

        public List<Integer> getElements() {
            return elements;
        }

        public List<Integer> getResult() {
            List<Integer> copy = new ArrayList<>(elements);
            Collections.sort(copy, Collections.reverseOrder());

            return copy.subList(0,numLargestElements);
        }
    }
}
