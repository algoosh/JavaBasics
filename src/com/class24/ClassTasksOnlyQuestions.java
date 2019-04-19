package com.class24;

public class ClassTasksOnlyQuestions {
	/*
	 * 1. Create a class named ‘Programming’. While creating an object of the class,
	 * if nothing is passed to it, then the message “I love programming languages”
	 * should be printed. If some String is passed to it, then in place of
	 * “programming languages” the value variable should be printed. Example, if we
	 * pass “Java”, then “I love Java” should be printed. 2. Create 1 class with a
	 * static method that has 3 overloaded forms. Then call each overloaded method
	 * with specific arguments and observe result. 3. Create 1 class with a private
	 * method that has 3 overloaded forms. Then call each overloaded method with
	 * specific arguments and observe result. (edited)
	 *///------------------------3rd assignment--------------------------------------
	/*
	 * 3. Create 1 class with a private method that has 3 overloaded forms. Then
	 * call each overloaded method with specific arguments and observe result.
	 */
	/*private void privateMethod() {
		System.out.println("Can not access to the private method");
	}

	private void privateMethod(String str) {
		System.out.println("Can not access to the private String"+str);
	}

	 void privateMethod(double weight, double height) {
		System.out.println("Can not access to the private Doubles"+weight+" "+hight);
	}

	 void privateMethod(int age) {
		System.out.println("Can not access to the private Age "+age);
	}*/
	 private void getOverload(String a) {
	        System.out.println("This is private String " + a);
	    }

	    private void getOverload(int b) {
	        System.out.println("This is private integer " + b);
	    }

	    private void getOverload(double c) {
	        System.out.println("This is private double " + c);
	    }

}

