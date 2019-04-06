package com.class17_2;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// user prompt to enter range of integers;
// print the sum of even and odd integers; 

		int startRange = 0;
		int endRange = 0;

		int sumOfOdds = 0;
		int sumOfEvens = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the startRange");
		startRange = scan.nextInt();
		System.out.println("please enter the endRange");
		endRange = scan.nextInt();
		for (int i = startRange; i <= endRange; i++) {
			if (i % 2 == 0) {
				sumOfEvens = sumOfEvens + i;
			} else {
				sumOfOdds = sumOfOdds + i;
			}
		}
		System.out.println("sumOfEvens= " + sumOfEvens);
		System.out.println("sumOfOdds= " + sumOfOdds);
	}

}
