package com.exception.handling;

public class PersonRunner {

	public static void main(String[] args) {

		Person p1 = null;
		Person p2 = null;
		try {
			p1 = new Person(null, 24);

			p2 = new Person("mukesh", 156);

		} catch (InvalidNameException e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}

		System.out.println(p1);
		System.out.println(p2);
	}
}
