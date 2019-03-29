package com.Review;

import java.util.Scanner;

public class Homework65 {

	public static void main(String[] args) {
		boolean thirsty;
		boolean sleepy;
		String drink;
		Scanner scan = new Scanner(System.in);
		System.out.println("Are you thirsty?");
		thirsty = scan.nextBoolean();
		System.out.println("Are you sleepy?");
		sleepy = scan.nextBoolean();
		if (thirsty && !sleepy) {
			drink = "water";
		} else if (thirsty && sleepy) {
			drink = "Coffe";
		} else if (!thirsty && !sleepy) {
			drink = "Nothing";
		} else {
			drink = "Tea";
		}
		System.out.println("Looks like you need to drink " + drink);
	}

}
