package com.class17_2;

public class NumberFour {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {

			for (int v = 1; v <= i; v++) {
				System.out.print("*");
			}

			System.out.println();
		}

		for (int i = 1; i <= 4; i++) {
			for (int y = 4; y >= i; y--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
