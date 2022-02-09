package com.esraturkan.designpatterns.factorymethod;

public class Demo {

	public static void main(String[] args) {

		Shape rectangle = new Rectangle();
		Shape circle = new Circle();
		Shape triangle = new Triangle();

		rectangle.calculateArea();
		circle.calculateArea();
		triangle.calculateArea();

	}
}
