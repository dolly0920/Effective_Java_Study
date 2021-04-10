package com.example.vsfe.item27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    @Test
    public void ArrayTest() {
        Queue<Integer> queue = new Queue<>();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);

        assertEquals(5, queue.getLength());
        assertEquals(1, queue.front());

        assertEquals(1, queue.pop());
        assertEquals(2, queue.pop());
        assertEquals(3, queue.pop());
        assertEquals(4, queue.pop());

        assertEquals(5, queue.front());
        assertFalse(queue.isEmpty());
        queue.pop();

        assertTrue(queue.isEmpty());
    }
}
