package com.Review;

public class Ripl70String {

	public static void main(String[] args) {
//		//contains() --> checks for specific value in the string
//		 //if value is present--> true ,
//		 //  else--> false
//		
//		   String str="Good morning, students!";
//		   boolean contains=str.contains("students");
//		 System.out.println(contains);
//		 
//		  String present="Welcome, Mehmet5465464";
//		   String neededValue="WELCOME,";
//		   boolean flag=present.contains(neededValue);
//		  System.out.println(flag);  
		

		/*
		 * Print out the position of the first occurrence of "c"
		Print out the position of the first occurrence of " "
		Print out the position of the first occurrence of the variable target1
		Print out the position of the first occurrence of the variable target2   */
		
		 String str = "abracadabra alakazam";
		    String target1 = "dab";
		    String target2 = "ABRA";
	boolean letter=str.contains("c");
	System.out.println(letter);
	
	boolean space=str.contains(" ");
	System.out.println(space);
	
	boolean var1=str.contains("dab");
	System.out.println(var1);
	
	boolean var2=str.contains("ABRA");
	System.out.println(var2);
		  }

}
