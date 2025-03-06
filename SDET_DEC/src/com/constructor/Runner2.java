package com.constructor;

public class Runner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student2 s1 = new Student2("mukesh", 18, 4);

		// job of constructor do Assignment(1st time initialization) and job of setter
		// is do modification

		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.getRollNumber());

		// to update the value of name using setter

		System.out.println("************to update the value of name using setter*************");

		s1.setName("mukesh singh");
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.getRollNumber());

		// used copy constructor to create copy of object

		System.out.println("******//used copy constructor to create copy of object********");

		Student2 copyStudent = new Student2(s1);

		System.out.println(copyStudent.getName());
		System.out.println(copyStudent.getAge());
		System.out.println(copyStudent.getRollNumber());

		// private constructor

		System.out.println("**************crteating object through private constructor********** ");

		PrivateConstructor emp = PrivateConstructor.createAcount("mukesh");

		System.out.println(emp.getName());

	}

}
