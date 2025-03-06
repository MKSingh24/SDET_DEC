package com.Encapsulation;

public class Runner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student1 s1 = new Student1();
		// System.out.println(s1.name); print default value
		s1.setName("Mukesh");
		s1.setAge(14);
		s1.setRollNumber(-22);
		s1.setMarksobtainedInEnglish(56);
		s1.setMarksobtainedInMath(70);
		s1.setMarksobtainedInScience(60);
		s1.setGrade("A");

		// we able to pass invalid value in instance variable t
		// Encapsulation-winding variable and method together 1-All instance variable
		// going to mark as private

		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.getRollNumber());
		System.out.println(s1.getMarksobtainedInEnglish());
		System.out.println(s1.getMarksobtainedInMath());
		System.out.println(s1.getMarksobtainedInScience());
		System.out.println(s1.getGrade());
		s1.calculateTotalMarks();

	}

}
