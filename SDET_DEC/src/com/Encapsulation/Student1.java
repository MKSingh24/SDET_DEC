package com.Encapsulation;

public class Student1 {

	// Encapsulation-variable and method need to be winding together
	// Always mark instance variable as private
	// And they have to winded to special method called setter and getter

	private String name;
	private int age;
	private int rollNumber;
	private double marksobtainedInEnglish;
	private double marksobtainedInMath;
	private double marksobtainedInScience;
	private String grade;

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
		if (age < 21 && age >= 10) {
			this.age = age;
		} else {
			System.out.println("Invalid age for student");

		}
	}

	public int getRollNumber() {

		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		if (rollNumber >= 1) {
			this.rollNumber = rollNumber;
		} else {
			System.out.println("Invalid rollNumber");
		}
	}

	public double getMarksobtainedInEnglish() {
		return marksobtainedInEnglish;
	}

	public void setMarksobtainedInEnglish(double marksobtainedInEnglish) {
		if (marksobtainedInEnglish > 0 && marksobtainedInEnglish < 100) {
			this.marksobtainedInEnglish = marksobtainedInEnglish;
		} else {
			System.out.println("invalid marks in english");
		}
	}

	public double getMarksobtainedInMath() {
		return marksobtainedInMath;
	}

	public void setMarksobtainedInMath(double marksobtainedInMath) {
		if (marksobtainedInMath > 0 && marksobtainedInMath < 100) {
			this.marksobtainedInMath = marksobtainedInMath;
		} else {
			System.out.println("invalid marks in math");
		}
	}

	public double getMarksobtainedInScience() {
		return marksobtainedInScience;
	}

	public void setMarksobtainedInScience(double marksobtainedInScience) {
		if (marksobtainedInScience > 0 && marksobtainedInScience < 100) {
			this.marksobtainedInScience = marksobtainedInScience;
		} else {
			System.out.println("invalid marks in Science");
		}
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void calculateTotalMarks() {
		double totalMarks = marksobtainedInEnglish + marksobtainedInMath + marksobtainedInScience;

		System.out.println("Total mark obtained" + totalMarks);
	}

}
