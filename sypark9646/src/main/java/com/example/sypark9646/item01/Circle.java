package com.example.sypark9646.item01;

public class Circle extends Shape {

	@Override
	public String getName() {
		return "circle" + this.hashCode();
	}
}
