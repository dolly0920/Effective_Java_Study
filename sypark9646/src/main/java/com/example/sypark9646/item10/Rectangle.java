package com.example.sypark9646.item10;

public class Rectangle {

		Shape shape;
		int row, col;

		public Rectangle() {
				System.out.println("Rectangle 호출");
		}

		public Rectangle(int x, int y, int row, int col) {
				this.shape = new Shape(x, y);
				this.row = row;
				this.col = col;
		}

		public void drawCenter() {
				shape.drawCenter();
				System.out.println("row = " + row + ", col = " + col);
		}

		@Override
		public boolean equals(Object o) {
				if (this == o) {
						return true;
				}

				if (o == null) {
						return false;
				}

				if (!(o instanceof Rectangle)) {
						return false;
				}

				Rectangle rectangle = (Rectangle) o;
				return this.shape.equals(rectangle.shape) && this.row == rectangle.row && this.col == rectangle.col;
		}
}
