package com.esraturkan.designpatterns.bridge;

public class Triangle  extends  Shape{


	public Triangle(ShapePattern shapePattern) {
		super(shapePattern);
	}

	@Override
	public void draw() {
		System.out.println("Triangle : " + shapePattern.fill());

	}

}
