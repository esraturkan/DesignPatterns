package com.esraturkan.designpatterns.abstractfactory;

public class IOSFactory implements GUIFactory {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new IOSButton();
	}

	@Override
	public TextBox createTextBox() {
		// TODO Auto-generated method stub
		return new IOSTextBox();
	}



}
