package com.Review;

import java.util.Scanner;

public class Homework64 {

	public static void main(String[] args) {
		/*
		 * Prompt user to: "Please enter your birthday month number" if user enters 12,
		 * 1, 2 --> season="Winter" if user enters 3, 4, 5--> season="Spring" if user
		 * enters 6, 7, 8 --> season="Summer" if user enters 9, 10, 11--> season="Fall"
		 * if any other number--> "Please enter valid month number" and season="Unknown"
		 * 
		 * The output of the program should be : "You were born in __ "
		 */
		int x;
		String season = "Unknown";
				

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your birthday month number");
		x = scan.nextInt();

		if (x == 12 || x == 1 || x == 2) {
			System.out.println("Winter");
		}
		else if (x == 3 || x == 4 || x == 5) {
			System.out.println("Spring");
		}
		else if (x == 6 || x == 7 || x == 8) {
			System.out.println("Summer");
		}
		else if (x == 9 || x == 10 || x == 11) {
			System.out.println("Fall");
		} else {
       System.out.println("Please enter valid month number");
		}
		System.out.println("You were born in " + season);
	}
}
