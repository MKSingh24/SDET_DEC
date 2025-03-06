package com.arrays;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10; // Method declear inside the method is called local variable**created in stack
					// memory**

		int marks[] = new int[3];// Arrays created in heap memory and intilize with deafult value and int
									// marks[]-Referenced variable
		// created in stack memory ,store Hashcode of array which is created in heap
		// memory

		// System.out.println(marks);

		/*
		 * System.out.println(marks[0]); System.out.println(marks[1]);
		 * System.out.println(marks[2]); System.out.println(marks[3]);
		 * System.out.println(marks[4]);
		 * 
		 */
		int len = marks.length;

		marks[0] = 5;
		marks[1] = 51;
		marks[2] = 15;

		for (int i = 0; i <= 2; i++) {
			System.out.println(marks[i]);
		}
		// Enhanced for Loop
		int num[] = { 23, 34, 23 };

		for (int temp : num) {
			System.out.println(temp);
		}

	}

}
