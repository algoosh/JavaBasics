package com.Review;

import java.util.Scanner;

public class Homework51 {

	public static void main(String[] args) {
		
/*
Write a program that takes a user's name and prints it. 
Step 1:"Hello, please Enter user name" should read First in your output
Step 2:"your name is "+ any variable name should read Second in your output

Hint: you are not restricted for any name you can use any name
*/
	//Prompt the user to enter his name and printed
		//print:Hello please enter the user name
		
		Scanner scan=new Scanner(System.in);
		System.out.println("hello , please enter user name");
		String name="John";
		name=scan.nextLine();
		System.out.println("hello , please enter user name");
		System.out.println("your name is "+ name);
		
	/*import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
    System.out.println("Hello, please Enter user name");
    String name=scanner.next();
    System.out.println("your name is "+ name);
    */	
		
		
		
		
	}

}
