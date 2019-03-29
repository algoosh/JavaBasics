package com.class4;

import java.util.Scanner;

public class ScannerAndIf {
	public static void main(String[] args) {

		int num1, num2;

		Scanner scan = new Scanner(System.in);

		System.out.println("fist number");
		num1 = scan.nextInt();
		System.out.println("enter first number");
		num2 = scan.nextInt();
		System.out.println("enter second number");
		System.out.println(num1);
		System.out.println(num2);
		if (num1 > num2) {
			System.out.println(num1 + " is larger then " + num2);

		} else {
			System.out.println(num1 + " is smaller then " + num2);
		}
System.out.println("I am done");
	}
}
