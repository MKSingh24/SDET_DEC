package com.builderDesign;

public class Runner {

	public static void main(String[] args) {

		//Employee e1 = new Employee("Manoj", 1, 20000);//not working because constructor is private

		//System.out.println(e1);

		// using Builder class

		Employee e2 = new Employee.Builder().name("Banti").salary(3400000).name(5).build();

		System.out.println(e2);

	}

}
