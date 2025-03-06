package com.constructor;

public class PrivateConstructor {

	private String name;

	private PrivateConstructor(String name) { // not accessible out of class
		this.name = name;
	}

	// for access out of class using method

	public static PrivateConstructor createAcount(String name) {

		PrivateConstructor e1 = new PrivateConstructor(name);
		return e1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
