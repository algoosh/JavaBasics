package com.class17_2;

import java.util.Scanner;

public class ScannerMethod {

	public static void main(String[] args) {
		ScannerMethod obj = new ScannerMethod();

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		obj.sum(a, b);

		/*
		 * obj.sum(100, 200);
		 * 
		 * 
		 * obj.sub(); obj.sub(); }
		 */
	}

	 int sum (int x, int y) {
		 
		return x +y;
	}

	void sub() {
		int a = 10, b = 20;
		System.out.println(a + b);
	}
}
