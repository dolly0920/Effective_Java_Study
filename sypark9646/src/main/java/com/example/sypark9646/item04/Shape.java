package com.example.sypark9646.item04;

public abstract class Shape {

	protected int x, y;

	public Shape() {
		System.out.println("Shape 호출");
	}

	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public abstract String getName();

	public void drawCenter() {
		System.out.println("x = " + x + ", y = " + y);
	}
}
