package com.example.sypark9646.item01;

public class CreateShapeFromNameFactory extends ShapeFactory {

	private static Circle CIRCLE = new Circle();
	private static Rectangle RECTANGLE = new Rectangle();

	@Override
	Shape createShape(String name) {
		switch (name) {
			case "circle":
				return CIRCLE;
			case "rectangle":
				return RECTANGLE;
		}
		return null;
	}
}
