package com.example.sypark9646.item10;

public class Circle {

		Shape shape;
		int radius;

		public Circle() {
				System.out.println("Circle 호출");
		}

		public Circle(int x, int y, int radius) {
				this.shape = new Shape(x, y);
				this.radius = radius;
		}

		public void drawCenter() {
				shape.drawCenter();
				System.out.println("radius = " + radius);
		}

		@Override
		public boolean equals(Object o) {
				if (this == o) {
						return true;
				}

				if (o == null) {
						return false;
				}

				if (!(o instanceof Circle)) {
						return false;
				}

				Circle circle = (Circle) o;
				return this.shape.equals(circle.shape) && this.radius == circle.radius;
		}
}
