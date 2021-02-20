package com.example.sypark9646.item11;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Cat implements Animal {

		private final String color;

		public String getColor() {
				return color;
		}

		@Override
		public void jump() {
				System.out.println("cat is jumping");
		}

		@Override
		public boolean equals(Object o) {
				if (this == o) {
						return true;
				}

				if (o == null) {
						return false;
				}

				if (!(o instanceof Cat)) {
						return false;
				}

				Cat cat = (Cat) o;
				return this.color.equals(cat.color);
		}

		@Override
		public int hashCode() {
				return color.hashCode();
		}
}
