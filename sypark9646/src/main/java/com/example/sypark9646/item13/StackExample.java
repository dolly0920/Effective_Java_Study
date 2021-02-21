package com.example.sypark9646.item13;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StackExample {

		private Object[] elements;
		private int size = 0;
		private static final int DEFAULT_INITIAL_CAPACITY = 16;

		public StackExample() {
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
				elements[size] = null; // 다 쓴 참조 해제 return result;
				return result;
		}

		// 원소를 위한 공간을 적어도 하나 이상 확보한다.
		private void ensureCapacity() {
				if (elements.length == size) {
						elements = Arrays.copyOf(elements, 2 * size + 1);
				}
		}

		@Override
		public StackExample clone() {
				try {
						StackExample result = (StackExample) super.clone();
						result.elements = elements.clone(); // elements 배열의 clone을 재귀적으로 호출
						return result;
				} catch (CloneNotSupportedException e) {
						throw new AssertionError();
				}
		}
}
