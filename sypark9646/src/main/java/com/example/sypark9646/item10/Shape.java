package com.example.sypark9646.item10;

public class Shape {

		protected int x, y;

		public Shape() {
				System.out.println("Shape 호출");
		}

		public Shape(int x, int y) {
				this.x = x;
				this.y = y;
		}

		public void drawCenter() {
				System.out.println("x = " + x + ", y = " + y);
		}

		@Override
		public boolean equals(Object o) {
				if (this == o) {
						return true;
				}

				if (o == null) {
						return false;
				}

				if (!(o instanceof Shape)) {
						return false;
				}

				Shape shape = (Shape) o;
				return this.x == shape.x && this.y == shape.y;
		}
}
