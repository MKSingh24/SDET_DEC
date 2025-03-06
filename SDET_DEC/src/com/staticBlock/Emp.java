package com.staticBlock;

public class Emp {

	private String name;
	public static String companyName;

	// job of static block is to initialized Static variables
	// Early initialization of Static variables
	// will be called when class loaded in method area
	// called only once
	static {
		companyName = "EY";
		System.out.println("I am in the static block");
	}

	static {

		System.out.println("I am in the static block2");
	}

	static {

		System.out.println("I am in the static block3");
	}

	// job constructor is initialized instance variable;

	public Emp(String name) {
		super();
		this.name = name;
		companyName = "IBM";

		System.out.println("I am in the constructor");
	}

}
