package com.class17_2;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int startPoint;
		int endPoint;
		int sumOfEven=0;
		int sumOfOdd=0;
		
		{
			System.out.println("Please enters startPoint");
		} startPoint=scan.nextInt();{
		System.out.println("Please enters endPoint");
	}        endPoint=scan.nextInt();
	if (startPoint< endPoint) {
		for(int a=startPoint; a<=endPoint; a++) {
		if (a%2==0) {
		sumOfEven=+a;
		}
		else {
			sumOfOdd+=a;
		}
		System.out.println("The sum of even numbers are "+sumOfEven);
		System.out.println("The sum of odd numbers are "+sumOfOdd);
	
	}  //fix brackets!!
}}}