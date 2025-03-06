package com.exception.handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Example7 {

	public static void main(String[] args) {

		// try-catch block with resources

		String filePath = "E:\\Eclpse-WorkSpace\\SDET_DEC\\src\\com\\exception\\handling\\demo.txt";

		File file = new File(filePath);
		// Put all the deceleration out side Try Block
		// FileReader fileReader;
		// BufferedReader bufferedReader = null;
		String data = null;
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
			// fileReader = new FileReader(file);
			// BufferedReader bufferedReader = new BufferedReader(fileReader);
			data = bufferedReader.readLine();
			// System.out.println(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// to closed the resources we use finally block

		System.out.println(data);

	}

}
