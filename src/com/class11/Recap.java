package com.class11;

public class Recap {

	public static void main(String[] args) {
		// Create an array of names will hold 5 elemenets and retrieve all values
		String[] names = new String[5];
		names[0] = "Asel";
		names[1] = "Aw";
		names[2] = "Ar";
		names[3] = "W";
		names[4] = "D";

		/*
		 * for( int i=0;i<=4; i++) OR better way is------ ----->
		 */ for (int i = 0; i < names.length; i++) {
			 /*this way you can add another name 
			 and change the size*/
			System.out.println(names[i]);
			
			String[] studentsNames= {"O", "A", "S", "K"};
			
			for (String student:studentsNames) {
				System.out.print(student+" ");
			}
			
		}
	}

}
