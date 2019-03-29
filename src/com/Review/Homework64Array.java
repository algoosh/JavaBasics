package com.Review;

public class Homework64Array {

	public static void main(String[] args) {

		int[][] a = { { 1, 1, 2 }, // sum = 4
				{ 3, 1, 2 }, // sum = 6
				{ 3, 5, 3 }, // sum = 11
				{ 0, 1, 2 } // sum = 3
		};
		// i is the row 4
		//j is the column 3
		int[] result=new int[4];
		
		for (int i = 0; i <4; i++)
		{
			int rowSum=0;
			for (int j= 0; j <3; j++)	
			{
				int value=a[i][j];
				rowSum=rowSum+value;
			}
			result[i]=rowSum;
			
			System.out.println(rowSum);
		}
		System.out.println();
		
       //done but don't understand:///
	}}	

			
	
