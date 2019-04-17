package com.class17;

public class ReviewStringEquality {

	public static void main(String[] args) {
		/*//equals() - compares 2 strings, if strings are equal--> true, else --> false
		 * String str4="Hello";
		 * String str5="hello";
		 * boolean equality=str4.equals(str5);
		 * System.out.println(equality);
		 * 
		 * //equalsIgnoreCase() - compares 2 strings but 
		 * ignores caseString expectedBrowser="chrome";
		 * String actualBrowser="CHROME";
		 * boolean equals=expectedBrowser.equalsIgnoreCase(actualBrowser);
		 * System.out.println(equals);}}*/
		boolean flag=true;
		String str1="Madam";
		String reverse="";
		for (int i=str1.length()-1;i>=0; i--) {
		reverse=reverse+str1.charAt(i);
		}
		if (str1.equalsIgnoreCase(reverse)) {
			flag=true;
		}else {
			flag=false;
			}
		System.out.println(flag);
		}	
	
	}
	


