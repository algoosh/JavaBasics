package com.class4;

import java.util.Scanner;

public class CityTemprText {
	public static void main(String[] args) {
		String city;
		int temp;
		Scanner myScanner=new Scanner(System.in);
		System.out.println("Please enter city name");
		city=myScanner.nextLine();
		System.out.println("Please enetr tempreture in F");
		temp=myScanner.nextInt();
		//formula (F-32)*(5/9)
		int conrvTemp=(temp-32)*5/9;
		System.out.println(conrvTemp);
System.out.println("The tempreture in the city "+city+ " is " +conrvTemp);
               
               
               






}
	

}
