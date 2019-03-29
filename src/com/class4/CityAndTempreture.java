package com.class4;

import java.util.Scanner;
public class CityAndTempreture {
	public static void main(String[] args) {
		//ask user to enter the city and temperature in F
		//program convert from F to C
		//the temperature in the city_is_
	    String cityName;
		int temp;
		Scanner myName=new Scanner(System.in);
		System.out.println("Please enter your city");
		cityName=myName.nextLine();
		
		System.out.println("please enter the temprature");
		
		temp=myName.nextInt();
		//formula (F-32)*5/9;
		int convertedTemp=(temp-32)*(5/9);
		System.out.println("The temprature in the city "+cityName+" convertedTemp from F to C is "+ convertedTemp);
		;
	}

}
