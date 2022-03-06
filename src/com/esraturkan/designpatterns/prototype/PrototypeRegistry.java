package com.esraturkan.designpatterns.prototype;
import java.util.*;


public class PrototypeRegistry {
	private HashMap<String,  Prototype> prototypes;
	
	public PrototypeRegistry() {
		prototypes = new HashMap<String, Prototype>();

	}
	
	public Prototype findPrototype( String type ) {
		
		System.out.println("findPrototype : "+type);
		return prototypes.get( type );
	}
	
	
	public void registerPrototype( Prototype m ) {
	
		System.out.println("registerPrototype : "+m.getType());

		prototypes.put( m.getType(), m );
	}

}
