package com.Review;

public class Homework70String {

	public static void main(String[] args) {
		/*startsWith(), endsWith(),
		 *  --> will return true if String starts/ends with specific value
				//else --> falseSystem.out.println("______StartWith & EndsWith________");*/
				  String str1="syntax";
				boolean starts=str1.startsWith("s");
				System.out.println(starts);
				System.out.println(str1.endsWith("X"));
				//
				System.out.println("--------------startsWith/endsWith---------");
/*Validate if the string ends with "u" prints the Boolean value accordingly
Validate if the string ends with "world" prints the Boolean value accordingly
Validate if the string ends with "are" prints the Boolean value accordingly
Validate if the string ends with "you" prints the Boolean value accordingly*/
           String s1="hello how are you";
	boolean last=s1.endsWith("u");
	System.out.println(last);
	boolean last1=s1.endsWith("world");
	System.out.println(last1);
	boolean last2=s1.endsWith("are");
	System.out.println(last2);
	boolean last3=s1.endsWith("you");
	System.out.println(last3);
	}
}//Done and understood
