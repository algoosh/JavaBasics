package com.class14;

public class ReverseStringOne {

	public static void main(String[] args) {
		String str = "Today is Java class";
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println(reverse);
	}

}
