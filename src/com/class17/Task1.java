package com.class17;

public class Task1 {

	public static void main(String[] args) {
		Task1 obj = new Task1();
		obj.largestNumber(25, 30);
		

	}
	void largestNumber(int a, int b) {
		if (a > b) {
			System.out.println("a is bigger the b");
		} else {
			System.out.println("b is larger the a");
		}
		System.out.println("the largesr number is ");
	}
}
