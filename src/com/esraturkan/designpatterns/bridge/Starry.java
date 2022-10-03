package com.esraturkan.designpatterns.bridge;

public class Starry  implements ShapePattern  {

	public Starry() {
		super();
	}

	@Override
	public String fill() {
		
		return "Starry Pattern";
	}


}
