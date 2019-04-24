package com.Utube;

class Main {
	public static void main(String[] args) {
Girl w=new Girl();



	}
}

class Women {
	int a = 10;
	int b = 20;
	//int sum1 = a + b;
}

class Girl extends Women {
	int a = 30;
	int b = 40;
	int sum2 = a + b;

	void addition(int a, int b) {
		int sum = a + b;
		System.out.println("the sum of Child's class local vatiables is " + sum);
		System.out.println("the sum of Child's class instance vatiables is " + sum2);
		//System.out.println("the sum of Parent's class instance vatiables is " + sum1);
	}
}