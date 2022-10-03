package com.esraturkan.designpatterns.bridge;

public class Floral implements ShapePattern {

	public Floral() {
		super();
	}

	@Override
	public String fill() {
		return "Floral Pattern";
	}

}
