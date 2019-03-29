package com.Review;

import java.util.Scanner;

public class Homework58 {
	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4, 5 };
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the number");
		num[0] = scan.nextInt();

		num[1] = scan.nextInt();

		num[2] = scan.nextInt();

		num[3] = scan.nextInt();

		num[4] = scan.nextInt();

		for (int i = 0; i < num.length; i++) {

			System.out.println(num[i] * 10);

		}
	}

}