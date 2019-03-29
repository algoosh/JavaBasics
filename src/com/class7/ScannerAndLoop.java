package com.class7;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		// prompt the user to ask a name 3times
		// after each input it should print " you are doing great"
		String name;

		Scanner scan = new Scanner(System.in);
		int a = 3;
		while (a <= 3) {
			System.out.println("Please enetr a name");
			name = scan.nextLine();
			System.out.println(" you are doing great " + name);
			a++;

		}

	}

}
