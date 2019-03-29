package com.ArrayHomework;

import java.util.Scanner;

public class Homework55 {

	public static void main(String[] args) {
		/*
		 * Write a program that creates an array of strings with the size being 7. Ask
		 * the user to input Days of a week beginning with Sunday. Add these inputs to
		 * your array and print the values using a for-each loop. Hint: Please enter day
		 * 1 of the week---->Sunday
		 */

		String[] days = new String[7];
		String day = "Sunday";
		Scanner scan = new Scanner(System.in);
		int num;
		for (int i = 0; i < days.length; i++) {
			//System.out.println("Please enter the day of the week");

			day = scan.nextLine();
			days[i] = day;
		}
		for (int i = 0; i < days.length; i++) {
			num = i + 1;
			//System.out.println("The day " + num + " of the week is " + days[i]);
			System.out.println("Please enter day " + num + " of the week " + days[i]);
		}
	}
}