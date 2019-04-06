package com.class17_2;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int year;
		System.out.println("Please enter the leap year");

		for (int i = 0; i < 10; i++) {
			Scanner scan = new Scanner(System.in);
			year = scan.nextInt();
			if (year % 4 == 0) {
				System.out.println("year is leap");
				break;
			} else {
				System.out.println("year is not leap");
			
				
				//Divisible by 400----leap Y.
				//Divisible 100------not leap Y.
				//Divisible  BY 4-------leap Y.
			}

		}
	}

}
