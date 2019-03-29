package com.class5;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
//if num is between 1 to 10 then num is small
		// if num between 11 to 100 id medium
		// if between 101 and 10000 then num is large
Scanner scan=new Scanner(System.in);

System.out.println(" enter the number");
		int num = 15;
		num =scan.nextInt();
		
		// true And false---/false
		if (num > 1 && num <= 10) {
			System.out.println(" num is small");
			// true And true----/true
		} else if (num >= 11 && num <= 100) {
			System.out.println("num is medium");
			// false And false ----/false
		} else if (num >= 101 && num <= 1000) {
			{
				System.out.println(" num is large");
			}
		} else {
			System.out.println("Out if range");
            
			//Done and understood 
		}
	}
}