package com.esraturkan.designpatterns.prototype;

public class  ConcretePrototype  extends Prototype {

	public ConcretePrototype() {
		super();
		type = "ConcretePrototype";
	}

	@Override
	public Prototype clone( ) {
		System.out.println("cloned");
		return new ConcretePrototype();
	}

}
