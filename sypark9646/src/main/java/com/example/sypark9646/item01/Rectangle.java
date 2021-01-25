package com.example.demo.item01;

public class Rectangle extends Shape {

	@Override
	public String getName() {
		return "rectangle" + this.hashCode();
	}
}
