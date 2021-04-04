package com.example.dolly0920.week9;

public interface Stack<E> {

    void push(E item);
    E pop();
    E peak();
    boolean empty();
    int search(E o);
}
