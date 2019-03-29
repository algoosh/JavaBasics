package com.class12;

public class MoreStringMunipulationsFunctions {

	public static void main(String[] args) {
		// charAt()--->returned character at specified index
		String str="Students";
		char character=str.charAt(7);
		System.out.println(character);
		for(int i=0;i<str.length(); i++) {
			System.out.print(str.charAt(i)+",");
		}
		//inrxOf()---returns the index of specified character
		System.out.println();
		System.out.println("---------indeOf------");
		String str1="Sunday";
		int index=str1.indexOf("n");
		System.out.println(index);
		
String str2="Syntax Technologies";
System.out.println(str2.indexOf("Syntex"));//0
System.out.println(str2.indexOf("Technologies"));//7
System.out.println(str2.indexOf("W"));//-1
System.out.println(str2.indexOf(" "));
	
//REVIEW!!!!!!
	
//	System.out.println("------substring-----");
//	
//	String str3="Today is Sunday Java class";
//	
//	String newString=str3.substring(9);
//	System.out.print(newString);
//	
//	System.out.print(str3.substring(0,5));// today
//	System.out.println(str3.substring(9,20));//Sunday Java
//System.out.println(str3.substring(16,20));// Java
//System.out.println(str3.substring(21));//class
//
	}}
