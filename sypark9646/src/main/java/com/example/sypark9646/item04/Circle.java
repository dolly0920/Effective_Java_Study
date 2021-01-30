package com.example.sypark9646.item04;

public class Circle extends Shape {

	int radius;

	public Circle() {
		// super(); 묵시적 호출
		System.out.println("Circle 호출");
	}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public void drawCenter() {
		super.drawCenter();
		System.out.println("radius = " + radius);
	}

	@Override
	public String getName() {
		return "circle" + this.hashCode();
	}
}
