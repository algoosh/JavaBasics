package com.Review;

public class Homework65Array {

	public static void main(String[] args) {
		/*
		 * Write a program that prints the total number of elements that are negative
		 * AND odd
		 */

		int[][] a = { { -5, -2, -3, 7 }, { 1, -5, -2, 2 }, { 1, -2, 3, -4 } };
		int count = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				int total = a[i][j];
				if (total < 0 && total % 2 != 0) {
					count = count + 1;
					}
			}
		}
		System.out.println(count);
	}
}              //DONE BUT DONT UNDERSTAND:///
