package com.Review;

import java.util.Scanner;

public class Homework63 {

	public static void main(String[] args) {
		/*
		 * Prompt user to input two strings : "Please enter two strings" and two
		 * integers: "Please enter two numbers" and make the comparisons: if int1 and
		 * int2 are equal and word1 and word2 are equal, output "AND" if int1 and int2
		 * are equal or word1 and word2 are equal, output "OR" if int1 and int2 are not
		 * equal and word1 and word2 are not equal, output "NONE" Example input/output:
		 * word1: banana word2: apple int1: 2 int2: 2 OR word1: banana word2: banana
		 * int1: 2 int2: 2 AND word1: phone word2: pie int1: 2 int2: 3 NONE
		 */
		
		String word1;
		String word2;
        String output;
		int int1;
		int int2;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two strings");
		word1 = scan.nextLine();
		word2 = scan.nextLine();

		System.out.println("Please enter two numbers");
		int1 = scan.nextInt();
		int2 = scan.nextInt();

		if (int1 == int2 && word1.equals(word2)) {
			System.out.println("And");
		} else if (int1 == int2 || word1.equals(word2)) {
			System.out.println("Or");

		} else if (!(int1 == int2) || word1.equals(word2)) {
			System.out.println("None");

		}else {System.out.println("Unknown");}
	}
}
