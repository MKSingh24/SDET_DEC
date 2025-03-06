package com.exception.handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Example6 {

	public static void main(String[] args) {

		String filePath = "E:\\Eclpse-WorkSpace\\SDET_DEC\\src\\com\\exception\\handling\\demo.txt";

		File file = new File(filePath);
		// Put all the deceleration out side Try Block
		FileReader fileReader;
		BufferedReader bufferedReader = null;
		String data = null;
		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			data = bufferedReader.readLine();
			// System.out.println(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// to closed the resources we use finally block

		finally {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println(data);

	}

}
