package com.class23;

public class Addition {// THIS PROCCESS CALL A method OVERLOADING
// now we have "add" method have different numbers of parameters
	public void add(int a, int b) {
		System.out.println("Method to add two values");
		System.out.println(a + b);
	}

	public void add(int a) {
		System.out.println("Method to add 100");
		System.out.println(a + 100);
	}

	public void add(int a, int b, int c) {
		System.out.println("Method to add three integer values");
		System.out.println(a + b + c);
	}
//changing the data type of the parameters
	public void add(double a, double b) {
		System.out.println("Method to add two double values");
		System.out.println(a + b );
}
	public void add(int a, double b) {
		System.out.println(a + b );
}
	public void add(double a, int b) {
		System.out.println(a + b );
}
	public void add(double a, double b, double c) {
		System.out.println(a + b + c);
}
}
