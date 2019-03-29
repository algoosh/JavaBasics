package com.class5;

import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//enter the age
		// if age bigger then 1 but less the 3 then you are baby
		// if age bigger then3 but older then5 then toddler
		// olfer then 5 but older theb 12 then a kid
		// older the 12 but younfer the 20 then teen
		// if older then 20 but less then 64 then Adult
		// if older or equel 64 then siniour
		Scanner myScanner;
		int age;
		myScanner = new Scanner(System.in);
		System.out.println("enter your age");
		age = myScanner.nextInt();

		if (age >= 1 && age < 3) {
			System.out.println("baby");

		} else if (age >= 3 && age < 5) {
			System.out.println("toddler");

		} else if (age <= 5 && age < 13) {
			System.out.println("kid");

		} else if (age <= 13 && age < 20) {
			System.out.println("teen");

		} else if (age <= 20 && age < 64) {
			System.out.println("adult");

		} else {
			System.out.println("senior");
// why 20 is senior????
			
		}
	}

}
