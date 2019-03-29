package com.class4;

public class Variable {
	public static void main(String[] args) {

		double availableRate = 3.5;
		double acceptableRate = 4.5;

		double housePrice = 1000000;

		boolean house = true;
		if (availableRate < acceptableRate) {

			if (housePrice < 2000000) {

				System.out.println("You will have your own place using Cash");
			} else {
				System.out.println("You will have your own place using taking a loan");

			}
		} else {
			System.out.println("You will NOT have your own place");
		}

	}

}
