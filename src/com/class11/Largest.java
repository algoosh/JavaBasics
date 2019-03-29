package com.class11;

public class Largest {

	public static void main(String[] args) {
		// create an array of integers and find largest number
		
		int[][] a = {
				{5,2,3,7},
				{1,5,1,1},
				{8,3,1,2}
			};

		int largest = a[0][0];
		
		for (int i = 0; i < a.length; i++) {
			for (int j=0;j<a[i].length;j++) {
				
			if (a[i][j] > largest) {
				largest = a[i][j];
			}
		}}
		System.out.println(largest);

	}
}
