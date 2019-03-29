package com.class7;

import java.util.Scanner;

public class Practices {

	public static void main(String[] args) {
		/* prompt user to enter 2 integers and compare At the end print largest */
		Scanner scan = new Scanner(System.in);
		int num1, num2;
		System.out.println("Please enter the number");
		num1 = scan.nextInt();
		System.out.println("Please enter the number");
		num2 = scan.nextInt();

		if (num1 < num2) {
			System.out.println(num2 + " is L");
		} else {
			System.out.println(num1 + " is L");
//Done and Understood
		}
	}
}
