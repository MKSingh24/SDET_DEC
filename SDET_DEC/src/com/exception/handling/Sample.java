package com.exception.handling;

public class Sample {

	public static void main1(String[] args) throws ArithmeticException {

		System.out.println("Line 1");
		int result = 10 / 0;
		System.out.println("Line 2");// not execute

		System.out.println("Line 3");// not

	}

	public static void main(String[] args) {

		System.out.println("Line 1");
		try {
			int result = 10 / 0;
		} catch (ArithmeticException e) {

			System.out.println(e.getMessage());
			e.printStackTrace();

		}
		System.out.println("Line 2");// not execute

		System.out.println("Line 3");// not

	}

}
