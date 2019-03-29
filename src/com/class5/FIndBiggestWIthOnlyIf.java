package com.class5;

import java.util.Scanner;

public class FIndBiggestWIthOnlyIf {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		double num3 = scan.nextDouble();

		double biggest = 0.00;
		if (num1 != num2 && num2 != num3 && num1 != num3) {
			
			if (num1> num2 && num1 > num3) {
				biggest = num1;
			}
			if (num2> num1 && num2 > num3) {
				biggest = num2;
			}
			if (num3> num1 && num3 > num2) {
				biggest = num3;
			}
			System.out.println(biggest);
		}
	}

}
