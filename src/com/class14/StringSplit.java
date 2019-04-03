package com.class14;

public class StringSplit {

	public static void main(String[] args) {
		
		// "Split" means cut it off
		String str="Welcome Syntax Students Batch 4";
		String[] array=str. split("S");
		
		System.out.println(array.length);// output is "3"
		
		for (String substring:array) {
			System.out.println(substring);//output is
			//Welcome 
			//yntax 
			//trudents Batch 4
			
		}
		System.out.println("-------------------");
		for (int i=0; i<array.length;i++) {
			System.out.println(array[i]);
			
			//done but no understanding
		}
	}

}
