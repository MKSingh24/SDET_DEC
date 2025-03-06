package com.staticBlock;

public class Runner {

	public static void main(String[] args) {

		System.out.println(Emp.companyName);

		Emp e = new Emp("mukesh");

		// called
		System.out.println(Emp.companyName);
		Emp e2 = new Emp("mukesh");
		Emp e3 = new Emp("mukesh");
		Emp e4 = new Emp("mukesh");

	}
}
