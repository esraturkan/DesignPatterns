package com.esraturkan.designpatterns.bridge;

public abstract class Shape {

	ShapePattern shapePattern;

	public Shape(ShapePattern shapePattern) {
		super();
		this.shapePattern = shapePattern;
	}

	abstract public void draw();

}
