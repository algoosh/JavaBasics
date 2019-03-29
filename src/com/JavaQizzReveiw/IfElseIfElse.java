package com.JavaQizzReveiw;

import java.util.Scanner;

public class IfElseIfElse {

	public static void main(String[] args) {
		int age = 20;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age");
		age = scan.nextInt();

		if (age < 20) {
			System.out.println("You are a teen");
		} else {
			System.out.println("You are young adult");

			if (age > 65) {
				System.out.println("You are an adult");
			} else {
				System.out.println("You are sineour");
			}
		}

	}
}
