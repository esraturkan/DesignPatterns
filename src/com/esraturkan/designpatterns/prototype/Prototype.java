package com.esraturkan.designpatterns.prototype;

public abstract class Prototype {
	protected String type;

	public abstract Prototype clone();

	protected Prototype() {

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
