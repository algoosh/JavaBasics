package com.class36;

public class Task1 {

	public static void main(String[] args) {
		checkAmount(600);
	}

	public static void checkAmount(int am) {

		int bal = 500;

		if (am <= bal) {

			System.out.println("take ur money");
		} else {

			throw new ArithmeticException("insaffisiant fund");
		}
	}
}

// done but PRACTICE
