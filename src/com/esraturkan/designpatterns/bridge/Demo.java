package com.esraturkan.designpatterns.bridge;

public class Demo {
	public static void main(String[] args) {

		Shape circle = new Circle(new Floral());
		circle.draw();

	}
}
