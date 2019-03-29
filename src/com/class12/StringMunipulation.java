package com.class12;

public class StringMunipulation {

	public static void main(String[] args) {
		String str="Syntax";
		//how many characters?
		//within this class there are many methods
		//"length" method
		
int lengthOfString=str.length();
System.out.println(lengthOfString);

String str1="Syntax Technologies";

int lengthOf2String=str1.length();
System.out.println(lengthOfString);





//converting toUpperCase and toLowCase
String str3="Hello";

String newString=str3.toUpperCase();
System.out.println(newString);

//
String str4="Hello";
String str5="hello";//lets compare them
//if they are equal---.True, otherwise--->False

str4.contentEquals(str5);

//System.out.println(equality);
String excpecterBrouse="Chrome";
String acualBrowser="chrome";
boolean equals=excpecterBrouse.equalsIgnoreCase(acualBrowser);
System.out.println(equals);
	}

}
