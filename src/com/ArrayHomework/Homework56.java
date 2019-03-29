package com.ArrayHomework;

public class Homework56 {

	public static void main(String[] args) {
		/*
		 * Write a program that creates an array of integers of size 11. Add the years
		 * 2010 to 2020 to your array one by one using a for-loop and then print all
		 * those values Hint: 2010, 2011 (as a column)
		 */
		int[] years = new int[11];

		int currentYear = 2010;

		for (int i = 0; i < years.length; i++) {
			years[i] = currentYear++;
		}
			for (int i = 0; i < years.length; i++) {
				System.out.println(years[i]);
			}
		}
	}

