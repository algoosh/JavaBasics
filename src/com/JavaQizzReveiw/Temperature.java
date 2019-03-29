package com.JavaQizzReveiw;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		String cityName;
		int temp;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the city name");
		cityName=scan.nextLine();
		System.out.println("Please enter the tempreture");
		temp=scan.nextInt();
		//System.out.println("The temperature in the city "+cityName+ " is " +temp);
		int tempF=(35-32)*5/9;
		int tempC=5/9*(65-32);
		//System.out.println("The temperature in the city "+cityName+ " is " +tempF);
		System.out.println("The temperature in the city "+cityName+ " is " +tempC);
	}

}
