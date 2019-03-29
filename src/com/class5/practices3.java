package com.class5;

import java.util.Scanner;

public class practices3 {

	public static void main(String[] args) {

/*
Write  a program that take user first name and Surname  and  print out  his /her  first name and then Surname.
First Condition: "Please Enter First Name" should print first with input
Second Condition:"Please Enter Surname" should print second with input

Final Output: First Name+ Surname on one line on output.
Make sure there is a space between First Name and Surname.
*/
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter First Name");
		String fisrtName=scanner.next();
		System.out.println("Please Enter Surname");
		String surName=scanner.next();
		System.out.println(fisrtName + " " + surName );
	}

}
