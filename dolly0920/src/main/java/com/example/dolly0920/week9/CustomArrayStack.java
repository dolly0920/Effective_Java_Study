package com.example.dolly0920.week9;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustomArrayStack<E> implements Stack<E> {

    private int top = 0;
    private int size;
    private E arr[];

    @Override
    public void push(E item) {
        arr[top++] = item;
    }

    @Override
    public E pop() {
        if (empty()) {
            return null;
        }
        return arr[--top];
    }

    @Override
    public E peak() {
        if (empty()) {
            return null;
        }
        return arr[top-1];
    }

    @Override
    public boolean empty() {
        if (size == 0) {
            log.error("Stack is empty");
            return true;
        }
        return false;
    }

    @Override
    public int search(E o) {
        if (size == 0) {
            return -1;
        }

        for (int i=0; i<size; i++) {
            if (arr[i] == o) {
                return i;
            }
        }

        return -1;
    }
}
