package com.studentManagementsystem.oop;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		// System.out.println(s1.name); print default value
		s1.name = "mukesh123";
		s1.age = 118;
		s1.rollNumber = 5;
		s1.marksobtainedInEnglish = 675;
		s1.marksobtainedInMath = 89;
		s1.marksobtainedInScience = 67;
		s1.grade = "Bdfg";

		// we able to pass invalid value in instance variable- to avoid we use
		// encapsulation
		// Encapsulation-winding variable and method together 1-All instance variable
		// going to mark as private

		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.rollNumber);
		System.out.println(s1.marksobtainedInEnglish);
		System.out.println(s1.marksobtainedInMath);
		System.out.println(s1.marksobtainedInScience);
		System.out.println(s1.grade);

		s1.calculateTotalMarks();

	}

}
