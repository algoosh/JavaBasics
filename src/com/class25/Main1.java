package com.class25;

public class Main1 {
	/*
	 * private int a=100; protected String name="SyntaxSolutions"; float
	 * salary=565656.09f; public String city="Florida";
	 * 
	 * public static void main(String[] args) { Main1 x=new Main1();
	 * System.out.println(x.a); System.out.println(x.name);
	 * System.out.println(x.salary); System.out.println(x.city); }
	 */
	/*
	 * declare one private method in Main class as display create a method to return
	 * print those two values and print them in your main method by calling that
	 * method
	 */

	private int batch = 3;
	private String name = "SyntaxSolutions";

	private void x() {
		System.out.println(batch);
		System.out.println(name);
	}

	public static void main(String[] args) {
		Main1 a = new Main1();
		a.x();
}}