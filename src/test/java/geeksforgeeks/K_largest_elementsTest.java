package geeksforgeeks;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class K_largest_elementsTest {

    @Test
    void testParseTests() {
        List<K_largest_elements.Test> tests = K_largest_elements.parseTests("2\n5 2\n12 5 787 1 23\n7 3\n1 23 12 9 30 2 50");

        assertEquals(2, tests.get(0).getNumLargestElements());
        assertEquals(828, tests.get(0).getElements().stream().reduce(0,Integer::sum));
        List<Integer> result = tests.get(0).getResult();
        assertEquals(787, result.get(0));
        assertEquals(23, result.get(1));

        assertEquals(3, tests.get(1).getNumLargestElements());
        assertEquals(127, tests.get(1).getElements().stream().reduce(0,Integer::sum));
        List<Integer> result2 = tests.get(1).getResult();
        assertEquals(50, result2.get(0));
        assertEquals(30, result2.get(1));
        assertEquals(23, result2.get(2));
    }
}