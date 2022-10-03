package com.esraturkan.designpatterns.adapter;

public class Pdf implements IDocument {

	@Override
	public void openDocument() {
		System.out.println("open document - pdf")  ; 
		
	}

}
