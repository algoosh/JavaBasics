package com.class4;

import java.util.Scanner;

public class ScannerClass1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = input.nextLine();
		System.out.println("Goodmorning " + name);
		int num = input.nextInt();
		System.out.println("Name is S" + num);

	}

}
