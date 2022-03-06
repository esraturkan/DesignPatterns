package com.esraturkan.designpatterns.prototype;

public class Demo {

	public static void main(String[] args) {
		
		PrototypeRegistry reg = new PrototypeRegistry();
		reg.registerPrototype(new ConcretePrototype() );
		Prototype mySpecialPrototype = reg.findPrototype("ConcretePrototype").clone();
		mySpecialPrototype.setType("ConcretePrototype1");
		reg.registerPrototype(mySpecialPrototype);
		
	}

}
