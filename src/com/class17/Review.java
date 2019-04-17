package com.class17;

public class Review {

	public static void main(String[] args) {
		Review obj = new Review();
		obj.m(20, 200);
		obj.x(57);
		obj.x(500);
	}

	public void m(int num1, int num2) {
		int largest=0;
		if (num1> num2) {
			num1=largest;
		}else 
			largest =num2;
		System.out.println("The largest number is "+largest);
	}
//------------------------------------------------------------------------
	/*Create a method that will take a number and prints
	 whether the number is even or odd.*/

	void x (int num3) {
		if (num3%2==0) {
			System.out.println("even");
		}else 
			System.out.println("odd");
	}
//-------------------------------------------------------------------------------
	/*Create a method that will print 
	 * whether given String is palindrome or not.*/
	
	
}

	

