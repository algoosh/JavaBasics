package com.class6;

import java.util.Scanner;

public class SwitchStrings {

	public static void main(String[] args) {

//prompt user to enter their country
		// specify favorite food
		Scanner scan = new Scanner(System.in);
//Declare, assign, using it
		String country;
		String favoriteFood;

		System.out.println(" Enter your country");
		country = scan.nextLine();
		switch (country) {

		case "USA":
			favoriteFood = "Burger";
			break;

		default:
			favoriteFood = "";
			// ect..
			// Don't Forger the default "Unknown"
			// print after closing with } then next line is syso
			// debug and test
			// it will jump to the country food right away
			System.out.println(favoriteFood);
			

		}

	}

}
