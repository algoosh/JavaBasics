package com.class5;

import java.util.Scanner;

public class ClassHomework2 {

	public static void main(String[] args) {
		// program will read 3 inputs( quiz,mid term,final scores;
		// Determine the grade based on
		// grade A/score >=90;
		// B/ >=70-90;
		// C/ 50-70;
		// F/<50;

		int quiz;
		int midTurm;
		int finalGrade;
		int score;
		Scanner sc = new Scanner(System.in);
		quiz = sc.nextInt();
		System.out.println("enter your quiz score");
		midTurm = sc.nextInt();
		System.out.println("enter your midTurm score");
		finalGrade = sc.nextInt();
		System.out.println("enter your finalGrade score");
		int avarage = (quiz + midTurm + finalGrade) / 3;

		if (avarage > 90) {
			System.out.println("B");
		} else if (avarage >= 70 && avarage > 90) {
			System.out.println("B");
		} else if (avarage >= 50 && avarage > 70) {
			System.out.println("C");
		} else if (avarage < 50)
			System.out.println("F");
	}

	{
		System.out.println("You will be able to get dipl");
	}

}
