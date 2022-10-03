package com.esraturkan.designpatterns.bridge;

public class Rectangle extends Shape{


	public Rectangle(ShapePattern shapePattern) {
		super(shapePattern);
	}

	@Override
	public void draw() {
		System.out.println("Rectangle : " + shapePattern.fill());
	}

}
