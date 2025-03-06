package com.studentManagementsystem.oop;

public class Student {

	String name;
	int age;
	int rollNumber;
	double marksobtainedInEnglish;
	double marksobtainedInMath;
	double marksobtainedInScience;
	String grade;

	public void calculateTotalMarks() {
		double totalMarks = marksobtainedInEnglish + marksobtainedInMath + marksobtainedInScience;

		System.out.println("Total mark obtained" + totalMarks);
	}

}
