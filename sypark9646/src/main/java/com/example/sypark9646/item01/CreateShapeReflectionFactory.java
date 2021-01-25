package com.example.sypark9646.item01;

import java.lang.reflect.Constructor;

public class CreateShapeReflectionFactory extends ShapeFactory {

	@Override
	Shape createShape(String name) {
		try {
			Class<?> clssName = Class.forName(name);
			Constructor<?> constructor = clssName.getConstructor();

			return (Shape) constructor.newInstance();
		} catch (Exception e) {
			return null;
		}
	}
}
