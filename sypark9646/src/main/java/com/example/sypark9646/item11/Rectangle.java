package com.example.sypark9646.item11;

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

		@Override
		public int hashCode() {
				int result = shape.hashCode();
				result = 31 * result + Integer.hashCode(row);
				result = 31 * result + Integer.hashCode(col);
				return result;
		}
}
