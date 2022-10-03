package com.esraturkan.designpatterns.adapter;

public class Docx implements IDocument {

	@Override
	public void openDocument() {
  
		System.out.println("openDocument - docx");
		
	}

}
