package com.class24;
/*Create 1 class with a static method that has 3 overloaded forms. 
 * Then call each overloaded method with specific arguments and observe result.*/

public class ThreeOverLoadedForms {
	public static void sM() {
		System.out.println("This is a method with NO PARAMETRS");
	}

	public static void sM(int age, String name) {
		System.out.println("This is a method with different type of variables ARE " + age + " " + name);

	}

	public static void sM(double x, double y) {
		System.out.println("This is a method with the samr type of var ARE " + x + " " + y);
	}

	public static void sM1(int age1, String name1) {
		System.out.println("This is a method with different returntype ARE " + age1 + " " + name1);
	}

	public static void main(String[] args) {
		ThreeOverLoadedForms obj = new ThreeOverLoadedForms();
		obj.sM();
		obj.sM(10, "Annie");
		obj.sM(5.7, 7.5);
		obj.sM1(52, "Alex");
	}

}
