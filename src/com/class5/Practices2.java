package com.class5;
import java.util.Scanner;

public class Practices2 {

	public static void main(String[] args) {

		// Write a program that takes a user's name and prints it.
		
		// Step 1:"Hello, please Enter user name" should read First in your output
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello, please Enter user name"); 
		String name = scan.next(); 
		
		// Step 2:"your name is "+ any variable name should read Second in your output
		String output = "your name is "+ name;
		System.out.println(output);
	}

}
