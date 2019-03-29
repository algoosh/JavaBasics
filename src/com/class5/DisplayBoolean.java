package com.class5;

import java.util.Scanner;

public class DisplayBoolean {

	public static void main(String[] args) {

//		Create a program that will take a  boolean value from a user 
//		Capture the value from the user in a variable called isTrue. 
// 		The user can enter True or False		
// 		Display the value back to the user in the console window
//
//		First Output: "Input the boolean value"
//		Final Output: "The value is ______" 
		
Scanner scan=new Scanner(System.in);
System.out.println("Input the boolean value");
boolean isTrue =scan.nextBoolean();
System.out.println("The value is "+isTrue);


		
		
		
		
	}

}
