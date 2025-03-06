package com.exception.handling;

public class Person {

	private String name;
	private int age;

	public Person(String name, int age) {
		if (validateAge(age) && validateName(name)) {
			this.name = name;
			this.age = age;
		}
	}

	// validation method

	private boolean validateAge(int age) {
		if (age >= 18 && age <= 80) {
			return true;
		} else {
			// System.err.println("Invalid age of person");
			try {
				throw new InvalidAgeException("Invald age");// throw key word used to explicitly throw or give
			} // exception
			catch (InvalidAgeException e) {
				e.printStackTrace();
			}

			return false;
		}
	}

	public boolean validateName(String name) {
		if (name == null || name.isEmpty()) {
			throw new InvalidNameException("Name can not be null or empty");
		} else if (!name.matches("[a-zA-Z\\s]+")) {
			throw new InvalidNameException("Name can have only Alphabets");
		}
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
