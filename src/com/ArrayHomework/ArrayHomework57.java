package com.ArrayHomework;

public class ArrayHomework57 {

	public static void main(String[] args) {
//		
//		for (int i = 1; i <= 10; i++) {
//			if (i == 5) {
//				break;
//			}
//			System.out.println(i);
//		}
//		and prints the values starting at index 0 
//		and multiple of 2 using a for loop.
//        Hint: syntax
		char[] letters = { 's', 'a', 'y', 'b', 'n', 'c', 't', 'd', 'a', 'e', 'x' };

		for (int i = 0; i <= letters.length; i += 2) {

			System.out.print(letters[i]);
			

		}
	}

}
