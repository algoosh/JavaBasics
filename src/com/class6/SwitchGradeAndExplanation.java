package com.class6;

import java.util.Scanner;

public class SwitchGradeAndExplanation {

	public static void main(String[] args) {
		//Prompt user to enter the grade then explain
		//A--excellent, B--Good, C--Average, D--Bad
		//other grades then not acceptable
		//print; what is the grade and explanation
		String grade;
		String explanation;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your grade");
		grade=scan.nextLine();
		
		switch (grade) {
		case "A":
			explanation="Excellent";
			break;
		case "B":
			explanation="Good";
			break;
		case "C":
			explanation="Average";
			break;
		case "D":
			explanation="Bad";
			default:
				explanation="";
				}
			
			{
				System.out.println("The grade is "+explanation);
			}
		
		
		
		

	}

}
