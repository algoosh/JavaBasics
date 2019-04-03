package com.class14;

public class ReverseString {

	public static void main(String[] args) {
		// reverse String without function condition WITH RESTRICTIONS

		String original = "Today is Java class";
//--------------------The 1st way of doing it is------>    USING toCharArray();---------------------------------------
		System.out.println();
		// we need to convert
		original.toCharArray();
		String reverse = "";
		char[] array = original.toCharArray();
		for (int i = array.length - 1; i >= 0; i--) {
			reverse = reverse + array[i];// ""+"s";

		}
		System.out.println("Reverse String is: " + reverse);

//---------------------------The 2nd way of doing it is------>    USING charAt();--------------------------------------

		String reverse1 = "";

		for (int i = original.length() - 1; i >= 0; i--) {
			reverse1 = reverse1 + original.charAt(i);
		}
		System.out.println("Reverse String is: " + reverse1);

//-------------------------------The 3d way of doing it is------->substring();-----------------------------------------------

		String reverse2 = "";

		// System.out.println(original.length());
		for (int i = original.length(); i > 0; i--) {
			reverse2 = reverse2 + original.substring(i - 1, i);
		}
		System.out.println("Reverse String is: " + reverse2);
//done but NO understanding
	}

}
