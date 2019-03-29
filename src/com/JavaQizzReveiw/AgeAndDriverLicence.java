package com.JavaQizzReveiw;

import java.util.Scanner;

public class AgeAndDriverLicence {

	public static void main(String[] args) {
		int age;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter your age");
		
		age=scan.nextInt();
		if (age>=18) {System.out.println("DL");
	}else {
		System.out.println("permission");
	//Done and Understood
	}
	}
}
