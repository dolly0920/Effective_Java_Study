package com.example.demo.item01;

public class Circle extends Shape {

	@Override
	public String getName() {
		return "circle" + this.hashCode();
	}
}
