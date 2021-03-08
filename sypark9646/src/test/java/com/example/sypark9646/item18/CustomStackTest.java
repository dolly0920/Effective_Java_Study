package com.example.sypark9646.item18;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import java.util.EmptyStackException;
import java.util.Stack;
import java.util.Vector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CustomStackTest {

    @DisplayName("stack 동작 비교 테스트")
    @Test
    void testCustomStack() {
        CustomStack<String> customStack = new CustomStack<>(new Vector<>());
        Stack<String> stack = new Stack<>();

        customStack.push("1");
        customStack.push("2");
        customStack.push("3");

        stack.push("1");
        stack.push("2");
        stack.push("3");

        Assertions.assertAll(
            () -> Assertions.assertEquals(stack.search("3"), customStack.search("3")),
            () -> Assertions.assertEquals(stack.search("10"), customStack.search("10")),
            () -> Assertions.assertEquals(stack.peek(), customStack.peek()),
            () -> Assertions.assertEquals(stack.pop(), customStack.pop()),
            () -> Assertions.assertEquals(stack.pop(), customStack.pop()),
            () -> Assertions.assertEquals(stack.pop(), customStack.pop())
        );
    }

    @DisplayName("empty stack exception 테스트")
    @Test
    void testCustomStack_WhenEmptyStackCallsPeek_ThrowException() {
        CustomStack<String> customStack = new CustomStack<>(new Vector<>());

        Assertions.assertTrue(customStack.empty());
        assertThatThrownBy(customStack::peek).isInstanceOf(EmptyStackException.class);
    }
}
