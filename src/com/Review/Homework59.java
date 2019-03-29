package com.Review;

import java.util.Scanner;

public class Homework59 {

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4, 5 };
		Scanner scan = new Scanner(System.in);
System.out.println("Please enrter numbers");
		num[0] = scan.nextInt();
		num[1] = scan.nextInt();
		num[2] = scan.nextInt();
		num[3] = scan.nextInt();
		num[4] = scan.nextInt();

		for (int i = 4; i>=0; i--) {
			
			System.out.println(num[i]);

		}
	}

}
