package com.esraturkan.designpatterns.abstractfactory;

public class AndroidFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new AndroidButton();
	}

	@Override
	public TextBox createTextBox() {
		return new AndroidTextbox();
	}

}
