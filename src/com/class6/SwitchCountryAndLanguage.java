package com.class6;

import java.util.Scanner;

public class SwitchCountryAndLanguage {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String country;
		String language;
		System.out.println("Please enter your country");
		country=scan.nextLine();
		switch (country) {
		
			case "USA":
				language="English";
				break;
			case "Russia":
				language="Russian";
				break;
			case "Iran":
				language="Farsi";
				break;
			case "Italy":
				language="Italian";
				break;
			default:
			language="Unknown";
			
		}
		System.out.println("Your langusge is "+language);
		//Declare and initiate 
		
		//DONE

	}

}
