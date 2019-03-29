package com.JavaQizzReveiw;

public class NesterIfElse {

	public static void main(String[] args) {
		int age = 65;
		int eligible = 65;
		int retired = 64;
		if (age < eligible) {
			System.out.println("No work");

		} else {
			System.out.println("Ligible to work");
			if (age < eligible) {
				System.out.println();
			}

		}
	}
}
