package com.Review;

import java.util.Scanner;

public class Homework53 {
public static void main(String[] args) {
	/*Write a program that asks the user's age and then display it by adding 10 i.e (age + 10)

First Output: "Enter your age"
Final Output: "your age after 10 years is " remember to put the value in your final output with 10 years added to it
*/
//prompt the user enter his age 
	//the age is after 10 years
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enetr your age");
	int age;
	age =scan.nextInt();
	System.out.println("the age is "+age);
	int x=age+10;
	System.out.println("the age after 10 years is "+ (age + 10));
	
	
}
}
