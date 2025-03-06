package com.exception.handling;

public class Example2 {

	public static void main(String[] args) {

		// try block with multiple catch block
		try {
			int result = 10 / 10;
			int a[] = new int[2];
			System.out.println(a[4]);
			Person p = null;
			System.out.println(p.getName());

		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

		catch (NullPointerException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
