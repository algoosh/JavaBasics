package com.Review;

import java.util.Scanner;

public class Homework41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*IMPORTANT: You must use a Scanner class for this conditional statement

Input variable in console using 121.
Find out if a number is Even or ODD
Please display "Even" if number is even
and "Odd" if the number is an odd number
 
 */
	   int num=90;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the number");
		num=scan.nextInt();
		if(90%2==0) 
			System.out.println("the nimber is even");
	else 
		System.out.println("the number is odd");
		
		
	}

}
