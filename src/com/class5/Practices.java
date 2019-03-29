package com.class5;

import java.util.Scanner;

public class Practices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter month number");
		int num = scan.nextInt();

		if (num == 1) {
			System.out.print("January");
		}

		else if (num == 2) {
			System.out.print("February");
		} else if (num == 3) {
			System.out.print("March");
		} else if (num == 4) {
			System.out.print("April");
		} else if (num == 5) {
			System.out.print("May");
		} else if (num == 6) {
			System.out.print("June");
		} else if (num == 7) {
			System.out.print("July");
		} else if (num == 8) {
			System.out.print("August");
		} else if (num == 9) {
			System.out.print("September");
		} else if (num == 10) {
			System.out.print("October");
		} else if (num == 11) {
			System.out.print("November");
		} else if (num == 12) {
			System.out.print("December");
		} else {
			System.out.print("Invalid");
		}

		// end of main
	}

}
