package com.class10;

public class ArrayShortCut {

	public static void main(String[] args) {

		int[] array = { 10, 20, 30, 40 };// assign, declare;

		System.out.println("I like number " + array[2]);
		System.out.println(array.length + " values of giving numberes are different");

		// store 5 names

		String[] names = { "John", "Mike", "OLGA", "Peter", "Sasha" };// 5 indexes

		System.out.println("There are " + names.length + " values in my String array ");
		System.out.println("The winning names is " + names[2] + " :)");
	}

}
