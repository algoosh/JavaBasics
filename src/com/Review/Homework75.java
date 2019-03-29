package com.Review;

import java.util.Scanner;

public class Homework75 {

	public static void main(String[] args) {
		String carOrigin = "";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your favorite car make");


			switch (scan.nextLine()) 
			{
			case "BMW":
				carOrigin = "german car";
				break;
			case "Toyota":
				carOrigin = "japanese car";
				break;
			case "Maserati":
				carOrigin = "italian car";
				break;
			default:
				carOrigin = "unknown";
			}
			
			
			
	    System.out.println("Your favorite car is " + carOrigin);
		}
}
