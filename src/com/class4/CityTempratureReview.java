package com.class4;

import java.util.Scanner;

public class CityTempratureReview {
	public static void main(String[] args) {
		
		
		String cityName;
		int temp;
		Scanner myScanner=new Scanner(System.in);
		
		System.out.println("cityName");
		
		cityName=myScanner.nextLine();

           System.out.println("what is the temp");
           
           temp=myScanner.nextInt();
           int formula=(temp-32)*(5/9);
           
           System.out.println("the temp of the city "+cityName + "is "+formula);
				;
	}

}
