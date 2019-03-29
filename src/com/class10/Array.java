package com.class10;

public class Array {

	public static void main(String[] args) {
//		// contains the SAME data of variable
//		// indexes starts on 0
//		int num;
//		num = 10;
//		int[] array1; // Declare an array-------preferred one;
//		int[] array2; // Declare an array;
//		int array3[]; // Declare an array;
//
//		array1 = new int[4];
//
//		// assigning value
//		array1[0] = 10;
//		array1[1] = 20;
//		array1[2] = 30;
//		array1[3] = 40;
//
//		// access value
//		System.out.println(array1[0]);
//		System.out.println(array1.length);
//		int[] numbers = new int[3];// using only ONE line
//		numbers[0] = 5;
//		numbers[1] = 10;
//		numbers[2] = 15;
//		// numbers[3]=20;//this is an extra, no error during compilation but error during run time
//		//so Java will complain
//		System.out.println(numbers[2]);
//		System.out.println(numbers.length);
//		System.out.println(array1.length +" "+ numbers.length);
	//	--------------------------------------------------
		String[] a = new String[3];
		a[0] = "Hello";
		a[1] = "Hi";
		a[2] = "Bye";
		System.out.println(a[1] +" friends");
		System.out.println(a[0] +" my love");
		//done and understood
	}
}
