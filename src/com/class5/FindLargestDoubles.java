package com.class5;

import java.util.Scanner;

public class FindLargestDoubles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		double num3 = scan.nextDouble();
		
		double biggest;
		
		if (num1 != num2) {
			
			// which is bigger
			
			// if num1 is greater than num2 , Then return num1 Else return num2
			// biggest = (num1 > num2) ? num1: num2;
			
			if(num1 > num2) {
				biggest =num1;
			}else {
				biggest = num2;
			}
				
				
				
			if(num3 != num2 && num3 != num1) {
				
				/// which is bigger
				
				// if biggest is greater than num3 , Then return biggest Else return num3
				//biggest = biggest > num3 ? biggest: num3;
				
				if (biggest > num3) {
					biggest = biggest;
				}else {
					biggest = num3;
				}
				
				System.out.println(biggest);
			}
		}

	}
}
