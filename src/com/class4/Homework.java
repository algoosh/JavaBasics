package com.class4;

public class Homework {

	public static void main(String[] args) {
		String str = "Hello";
		String str1 = "Bye";
		System.out.print(str);
		System.out.println(str1);
		int mod = 25 % 2;
		System.out.println(mod);
		// is number even or odd?
		int num = 45;
		if (45 % 2 == 0) {
			System.out.println(num + " is even");

		} else {
			System.out.println(num + " is odd");
		}
		// if number positive or negative
		int a =0;

		if (a > 0) {
			System.out.println("the number is positive");
		} else if (a < 0) {
			System.out.println("the number is negative");
		} else {
			System.out.println("the number is null");
		}

	}
}
