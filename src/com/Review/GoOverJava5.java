package com.Review;

import java.util.Scanner;

public class GoOverJava5 {
	public static void main(String[] args) {

		/*
		 * (/package com.class5;import java.util.Scanner; public class LogicalOperator)
		 * ask user enter daily sales amount 
		 * Based on the sales, range commission will be different; 
		 *  Example: sales is <100==>2%
		 * sales more than 100 and less than 200=5%
		 */

		int sale;
		double commission;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter daily sales amount");
		sale=scan.nextInt();
		if (sale<100)System.out.println("commission is 2%");
		else if(sale>100 && sale<300)
			System.out.println("commission is 5%");
		else System.out.println("Revenue is big");
		//Done and understood
		
	}}

