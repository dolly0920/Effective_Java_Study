package com.example.dolly0920.week11;

import java.util.Arrays;
import java.util.Collection;
import java.util.EmptyStackException;
import java.util.Iterator;

public class GenericStack<E> {

  private E[] elements;
  private int size = 0;
  private static final int DEFAULT_INITIAL_CAPACITY = 16;

  public GenericStack() {
    elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
  }

  public void push(E e) {
    ensureCapacity();
    elements[size++] = e;
  }

  public E pop() {
    if (size == 0) {
      throw new EmptyStackException();
    }
    E result = elements[--size];
    elements[size] = null;
    return result;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  private void ensureCapacity() {
    if (elements.length == size) {
      elements = Arrays.copyOf(elements, 2 * size + 1);
    }
  }

  public void pushAll(Iterable<? extends E> src) { // bounded wildcard type ( producer - extends)
    for (E e : src) {
      push(e);
    }
  }

  public void popAll(Collection<? super E> dst) { // (consumer - super)
    while(!isEmpty()) {
      dst.add(pop());
    }
  }
}
