package com.esraturkan.designpatterns.adapter;

public class Demo {

	
	public static void main(String[] args) {
		
		IDocument document=new Pdf();
		document.openDocument();
		
		Pptx pptx=new  Pptx();
		
		document=new DocumentAdapter(pptx);
		
		document.openDocument();
	}
}
