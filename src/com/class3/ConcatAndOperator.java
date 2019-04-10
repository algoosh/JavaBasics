package com.class3;

import pack1.ClassB;

public class ConcatAndOperator {
	public static void main(String[] args) {
// we will have to intinges and 2 stings
		String a = "Hello";
		String b = "Bye";
		int x = 10;
		int y = 20;

		System.out.println(x + y + a + b);
		System.out.println(x + a + y + b);
		System.out.println(a + b + (x + y));
		System.out.println(a + b + x + y);
		System.out.println(a + (y + x) + b);
		//printing in one line
		System.out.print(x + y + a + b);
		System.out.print(x + a + y + b);
		System.out.print(a + b + (x + y));
		System.out.print(a + b + x + y);
		System.out.print(a + (y + x) + b);
}
             //DONE!!!!!
}
