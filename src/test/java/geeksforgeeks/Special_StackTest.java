package geeksforgeeks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Special_StackTest {

    @Test
    public void testStackPushPop() {
        Special_Stack.SpecialStack stack = new Special_Stack.SpecialStack(5, "18 19 29 15 16", 5);

        assertTrue(stack.isFull());
        assertFalse(stack.isEmpty());
        assertFalse(stack.push(12));
        assertEquals(15, stack.getMin());
        assertEquals(16, stack.pop());
        assertFalse(stack.isFull());
        assertEquals(15, stack.pop());
        assertEquals(18, stack.getMin());
        stack.pop();
        stack.pop();
        stack.pop();
        assertTrue(stack.isEmpty());
        assertNull(stack.pop());
        assertNull(stack.getMin());
        assertFalse(stack.isFull());
        assertTrue(stack.push(10));
        assertEquals(10, stack.getMin());
        assertFalse(stack.isFull());
        assertFalse(stack.isEmpty());
    }

}