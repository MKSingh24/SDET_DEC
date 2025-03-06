package com.constructor; //constructor is special method which has same as that class

public class Student2 {

	String name;
	int age;
	int rollNumber;

	public Student2(String name, int age, int rollNumber) {// parameterized constructors
		super();
		this.name = name;
		this.age = age;
		this.rollNumber = rollNumber;

		// job of constructor-if i want to intialize the instance variable during object
		// creation i need constructor
		// constructor do es not have return type
		// job of setter is modification

	}

	// copy constructor-used to create copy of an object

	public Student2(Student2 other) {
		this.name = other.name;
		this.age = other.age;
		this.rollNumber = other.rollNumber;
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

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

}
