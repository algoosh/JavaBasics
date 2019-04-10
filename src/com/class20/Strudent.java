package com.class20;

public class Strudent {

	public static void main(String[] args) {
		Strudent obj = new Strudent();
		char myGrade = obj.getGrade(91);
		System.out.println(myGrade);

	}

	char getGrade(int score) {
		char grade;
		if (score > 90) {
			grade = 'A';
		} else if (score > 80) {
			grade = 'B';
		} else if (score > 70) {
			grade = 'C';
		} else if (score > 60) {
			grade = 'D';
		} else
			grade = 'E';
		return grade;
	}
	
}
