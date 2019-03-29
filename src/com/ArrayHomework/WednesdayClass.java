package com.ArrayHomework;

public class WednesdayClass {

	public static void main(String[] args) {
		// Write a program to sum the values of an array
		// 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] num1 = new int[10];

		int sum = 0;
		for (int i = 0; i <= num.length; i++) {
			sum=sum+i;
		}

		System.out.println("The sum of all array elements = to " + sum);
//done, need to review it
	}
}
