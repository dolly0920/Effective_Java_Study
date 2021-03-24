package com.example.vsfe.item27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    @Test
    public void ArrayTest() {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(4, stack.getLength());
        assertEquals(3, stack.top());

        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());

        assertEquals(5, stack.top());
        assertFalse(stack.isEmpty());
        stack.pop();

        assertTrue(stack.isEmpty());
    }
}
