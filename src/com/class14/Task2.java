package com.class14;

public class Task2 {

	public static void main(String[] args) {
		String original="Today is Java Class";
		char[] array=original.toCharArray();
		String reverse="";
		
		for(int i=original.length()-1; i>=0;  i--) {
			reverse=reverse+array[i];
		}
System.out.println("Today is Java Class reverse is "+reverse);
	}

}
