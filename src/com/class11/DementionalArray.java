package com.class11;

public class DementionalArray {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 10, 20, 30 }, { 100, 200, 300 } };
		for (int i = 0; i < arr.length; i++)// looping through the row
		{
			for (int j = 0; j < arr[i].length; j++)//
			{
				System.out.print(arr[i][j] + ", ");
			}
			System.out.println();// creating new line
//done understood but review
		}
		System.out.println("--------For each Loop");
		for (int[] singleArray : arr) {
			for (int numbers : singleArray) {
				System.out.print(numbers+" ");
			}
			System.out.println();
		}
	} 
	
}
