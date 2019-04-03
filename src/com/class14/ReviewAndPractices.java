package com.class14;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ReviewAndPractices {

	public static void main(String[] args) {
		// __________Practice More___________________

		/*int arr[] = { 144, 46, 0, 86, 292, -1 };
		int largest = 0;
		int secondLargest = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
			if (arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];

			}
		}
		System.out.println(largest);
		System.out.println(secondLargest);*/
		// _____________Reshenie vnizy________________________
		/*
		 * int largest = arr[0]; int secondLargest = 0;
		 * 
		 * for (int i = 0; i < arr.length; i++) { if (arr[i] > largest) { largest =
		 * arr[i]; } if (arr[i] > secondLargest && arr[i]!=largest) { secondLargest =
		 * arr[i]; } } System.out.println("2nd largest number is:" + secondLargest);
		 * System.out.println("largest number is:" + largest);
		 */

		// _______________________Problem#2___ Do Not Understand ________________

		/*
		 * Write a program that reads two people's first names and if they expecting boy
		 * or girl? Based on the input suggests a name for a baby:
		 */
		/*
		 * Scanner scan; String motherName,fatherName, gender, babyName;
		 * 
		 * scan=new Scanner(System.in); System.out.println("Please enter mothers name");
		 * motherName=scan.nextLine();
		 * 
		 * System.out.println("Please enter fathers name"); fatherName=scan.nextLine();
		 * 
		 * System.out.println("Please enter expected gender"); gender=scan.nextLine();
		 * 
		 * 
		 * if(gender.equalsIgnoreCase("boy")) { babyName=fatherName.substring(0,
		 * fatherName.length()/2)+ motherName.substring(motherName.length()/2); }else
		 * if(gender.equalsIgnoreCase("girl")){ babyName=motherName.substring(0,
		 * motherName.length()/2)+ fatherName.substring(fatherName.length()/2); }else {
		 * babyName="No suggestion";
		 * 
		 * } System.out.println(babyName.toUpperCase());
		 */
		// _______________________Question____________________
		// Reverse a String without using a reverse function
		// 1 using toCharArray();

		String original = "Today is Java Class";
		String reverse = "";
		char[] array = original.toCharArray();
		for (int i = array.length - 1; i >= 0; i--) {
			reverse = reverse + array[i];
		}
		System.out.println("Reversed String is: " + reverse);
//------------------------------------------------------------------------		
		String str = "Today is long day ";
		String reverse1="";
		char[] arr=str.toCharArray();
		for (int i=str.length()-1;i>=0; i-- ) {
			reverse1=reverse1+arr[i];
			}
		System.out.println(reverse1);
//---------------------------------------------------------------------		
		String day="Today is practice day";
		String reverse2="";
		char[] arr2=day.toCharArray();
		for(int i=day.length()-1;i>=0;i--) {
			reverse2=reverse2+arr2[i];
			}
		System.out.println(reverse2);
		//----------------------------------------------------------
		String les="I have my work in 30 minutes";
		String reverse3="";
		char[] arr3=les.toCharArray();
		for (int i=les.length()-1;i>=0;i--) {
			reverse3=reverse3+arr3[i];
			}
		System.out.println(reverse3);
		//--------------------------------------------------------------
		String last="One more time";
		String reverse4="";
		char[] arr4=last.toCharArray();
		for (int i=last.length()-1;i>=0;i--) {
		reverse4=reverse4+arr4[i];
		}
		System.out.println(reverse4);
	}
}
