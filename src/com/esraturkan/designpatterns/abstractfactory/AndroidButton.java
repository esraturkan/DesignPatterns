package com.esraturkan.designpatterns.abstractfactory;

public class AndroidButton implements Button {

	@Override
	public void draw() {

		System.out.println("AndroidButton draw() method.");
	}

}
