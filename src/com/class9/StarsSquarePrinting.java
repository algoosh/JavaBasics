package com.class9;

public class StarsSquarePrinting {

	public static void main(String[] args) {

		for (int c = 1; c <= 4; c++) {

			for (int r = 1; r <= 6; r++) {
				if (c == 1 || c == 4 || r == 1 || r == 6) {
					System.out.print("*");
				} else {

					System.out.print(" ");
				}

			}

			System.out.println();
		}
	}
}
