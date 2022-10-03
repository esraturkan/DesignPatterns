package com.esraturkan.designpatterns.adapter;

public class DocumentAdapter implements IDocument{
 
	private Pptx pptx;
	
	@Override
	public void openDocument() {


		pptx.slideShow();
	}
  
	public DocumentAdapter(Pptx pptx) {
		this.pptx=pptx;
	}
}
