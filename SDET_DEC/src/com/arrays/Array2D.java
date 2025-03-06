package com.arrays;

public class Array2D {

	public static void main(String[] args) {

		int a[][] = new int[2][2];// 2*2 arrays=4 data store in heap

		a[0][0] = 12;
		a[0][1] = 13;
		a[1][0] = 14;
		a[1][1] = 15;

		for (int rowIndex = 0; rowIndex < a.length; rowIndex++) {
			// System.out.println(rowIndex);

			for (int columnIndex = 0; columnIndex < a[rowIndex].length; columnIndex++) {

				System.out.println(a[rowIndex][columnIndex]);
			}
		}

		System.out.println("***********Using for each loop***************");

		for (int r[] : a) // row
		{
			for (int c : r) // column
			{
				System.out.println(c);
			}
		}

	}

}
