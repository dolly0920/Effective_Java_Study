package com.example.dolly0920.week5;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack implements Cloneable {
  private Object[] elements;
  private int size = 0;
  private static final int DEFAULT_INITIAL_CAPACITY = 16;

  public Stack() {
    this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
  }

  public void push(Object e) {
    ensureCapacity();
    elements[size++] = e;
  }

  public Object pop() {
    if (size == 0) {
      throw new EmptyStackException();
    }
    Object result = elements[--size];
    elements[size] = null;
    return result;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public Stack clone() {
    try {
      Stack result = (Stack) super.clone();
      result.elements = elements.clone(); // clone method for Mutable object
      return result;
    } catch (CloneNotSupportedException e) {
      throw new AssertionError();
    }
  }

  private void ensureCapacity() {
    if (elements.length == size) {
      elements = Arrays.copyOf(elements, 2 * size + 1);
    }
  }
}
