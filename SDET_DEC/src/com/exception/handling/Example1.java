package com.exception.handling;

public class Example1 {

	public static void main(String[] args) {
//sample try-catch block
		try {
			int result = 10 / 0;
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
