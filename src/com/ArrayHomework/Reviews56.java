package com.ArrayHomework;

import java.util.Scanner;

public class Reviews56 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		
		for (int i = 1; i <= 7; i++) {
			System.out.println("Please enter day " + i + " of the week");
			String day = scan.nextLine();
		}
		System.out.println(days[0]);
		System.out.println(days[1]);
		System.out.println(days[2]);
		System.out.println(days[3]);
		System.out.println(days[4]);
		System.out.println(days[5]);
		System.out.println(days[6]);
	}

}
