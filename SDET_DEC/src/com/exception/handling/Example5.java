package com.exception.handling;

public class Example5 {

	public static void main(String[] args) {
		try {
			int result = 10 / 10;
			int a[] = new int[2];
			System.out.println(a[4]);
			Person p = null;
			System.out.println(p.getName());

		} catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

		finally {
			System.out.println("Hello in the finally block");
		}

	}

}
