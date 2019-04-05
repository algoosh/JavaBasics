package com.class17;

public class Greetings {
	public static void main(String[] args) {// object will be created inside the main method

		Greetings obj = new Greetings();
		obj.hello();
		// how to find the largest number;
		/*
		 * int a=10; int b=20; if(a>b) { System.out.println("a is larger"); }else {
		 * System.out.println("b is larger"); }
		 */
		obj.findLargest(20, 10);// calling method FindLargest and passing values to line21 then 22
		obj.findLargest(30, 31);// the same as
		obj.helloToInstructor("Olga");// put here any name,change it
	}

	void helloToInstructor(String name) {// method with 1 paramentre
		System.out.println("Hell " + name);// method body
	}

	void hello() {
		System.out.println("hello");
	}

	void findLargest(int a, int b) {//method with 2 parametrs
		// how to find the largest number;
		/*
		 * int a = 10; int b = 20;
		 */
		if (a > b) {
			System.out.println("a is larger then b");
		} else {
			System.out.println("b is larger then a");
		}
	}
}
