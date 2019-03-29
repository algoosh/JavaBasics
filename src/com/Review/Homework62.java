package com.Review;

import java.util.Scanner;

public class Homework62 {

	public static void main(String[] args) {

		double score;
		boolean loan;
		String eligibility = "";

		Scanner scan = new Scanner(System.in);
		System.out.println("Do you need a loan?");
		loan = scan.nextBoolean();
		if (loan) {
			System.out.println("What is your credit score?");
		score = scan.nextDouble();

		if (score < 600) {
			eligibility = "Not eligible";
		} else if (score >= 600 && score <= 700) {
			eligibility = "Maybe eligible";
		} else if (score >= 701 && score <= 800) {
			eligibility = "Eligible";
		} else if (score > 801) {
			eligibility = "Definitely eligible";

		} else {
			eligibility = "Unknown";

		}
		System.out.println("The eligibility is ____" + eligibility);

	}
	}
}
