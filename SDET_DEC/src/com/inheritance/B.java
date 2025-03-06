package com.inheritance;

public class B extends A {

	public B(int x, int y) {
		super(x, y); // super key word used to call constructor inside another constructor outside of
						// the class
		// if the parant class (A) has parameterized constructor is the job of child
		// class(B) to call to call that constructor

	}

	public void add() {
		System.out.println(x + y);
	}

}
