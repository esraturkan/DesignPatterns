package com.esraturkan.designpatterns.abstractfactory;

public class Demo {
	
	
	
	public static void main(String[] args) {
	
		GUIFactory factory;
        factory=new AndroidFactory();
        factory.createButton().draw();
        factory.createTextBox().draw();
		
	}

}
