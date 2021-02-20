package com.example.sypark9646.item11;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Dog implements Animal {

		private final String color;

		public String getColor() {
				return color;
		}

		@Override
		public void jump() {
				System.out.println("dog is jumping");
		}

		@Override
		public boolean equals(Object o) {
				if (this == o) {
						return true;
				}

				if (o == null) {
						return false;
				}

				if (!(o instanceof Dog)) {
						return false;
				}

				Dog dog = (Dog) o;
				return this.color.equals(dog.color);
		}

		@Override
		public int hashCode() {
				return color.hashCode();
		}
}
