package com.class6;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

//if it is a good weather to go any activities
		// weather is good if tempt is between 40 and 180 degrees---snowing then snowbd
		// } Tempt between 25-40 is snowing -----snowboarding ELSE not goin snow bd
		// we are not going snowbd
//Tempt more then 80 degrees ----sunny and to to the beach
		// ELSE not go to the beach
		// boolean
		// Tempt from user
		// if > or <40-80 else
		// else if 25-40 else
		// if>80 true sunny or not sunny
		// activity =go hiking, not go , beach not beach (String)
		boolean snow, rain, sunny;
		int temp;
		String activity = "";

		Scanner scan = new Scanner(System.in);
		// checking temp First

		System.out.println("Please enter the temp");
		temp = scan.nextInt();
		if (temp > 40 && temp < 80) {
			// ask user "Is it raining"
			System.out.println("is it raining");
			rain = scan.nextBoolean();
			if (rain) {
				System.out.println("watch moveis");
			} else {
				System.out.println("go hiking");
			}

		} else if (temp >= 25 && temp < 40) {
			System.out.println("is it snowing");
			boolean snowing = scan.nextBoolean();
			if (snowing) {
				activity = "Snowboarding";

			} else {
				System.out.println("Not snowboarding");

			}
		} else if (temp >= 80) {

			System.out.println(" is it sunny");

			sunny = scan.nextBoolean();
				if (sunny) {
					activity = "Go to the beach";
				} else {
					activity = "Do more coding";
				}

		} else

		{
			System.out.println("Please enter diffrerent temp");
			activity = "Unknown";
		}
		
		
		System.out.println("my activity for today is " + activity);

	}
}
