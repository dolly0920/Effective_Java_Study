package com.example.sypark9646.item04;

public class Rectangle extends Shape {

	int row, col;

	public Rectangle() {
		// super(); 묵시적 호출
		System.out.println("Rectangle 호출");
	}

	public Rectangle(int x, int y, int row, int col) {
		super(x, y);
		this.row = row;
		this.col = col;
	}

	@Override
	public void drawCenter() {
		super.drawCenter();
		System.out.println("row = " + row + ", col = " + col);
	}

	@Override
	public String getName() {
		return "rectangle" + this.hashCode();
	}
}
