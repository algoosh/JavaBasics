package com.WednesdayClass;

public class Intiger {

	public static void main(String[] args) {
		Intiger obj = new Intiger(100, 100, 100);

	}

	Intiger(int a) {
		System.out.println("My lucky number is " + a);
	}

	Intiger(int b, int c) {
		this(10);
		System.out.println("My lucky number is " + (b + c));
	}

	Intiger(int x, int y, int z) {
		this(15, 15);
		System.out.println("My lucky number is " + (x + y + z));
	}
//DONE AND UNDERSTOOD
}
