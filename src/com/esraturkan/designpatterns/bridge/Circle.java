package com.esraturkan.designpatterns.bridge;

public class Circle extends Shape {

	public Circle(ShapePattern shapePattern) {
		super(shapePattern);
	}

	@Override
	public void draw() {

		System.out.println("Circle : " + shapePattern.fill());
	}

}
