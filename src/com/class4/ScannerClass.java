package com.class4;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name = sc.nextLine();
		char gender = sc.next().charAt(0);
		int age = sc.nextInt();
		long mobileNo = sc.nextLong();
		double cgpa = sc.nextDouble();
		//String lastNm = sc.nextLine();
		//int houseNm = sc.nextInt();
		//long bankAccountNm = sc.nextLong();
		//double hight = sc.nextDouble();
		
		// print the values

		System.out.println("Nmae: " + name);
		System.out.println("Gender: " + gender);
		System.out.println("Age: " + age);
		System.out.println("Mobile Number: " + mobileNo);
		System.out.println("CGPA: " + cgpa);
		//System.out.println("Last Name: "+lastNm);
		//System.out.println("House Number: "+houseNm);
		//System.out.println("Bank Account Number: "+bankAccountNm);
		//System.out.println("Hight: "+hight);

	}
}
