package com.Review;

public class ReplString70 {

	public static void main(String[] args) {
		
		/*int indexOf(int ch)     Description:
		 * This method returns the index within this string of the first occurrence of the specified character or
		 *  -1 if the character does not occur.
		 * Syntax:public int indexOf(int ch )  */
	//	-------------------------------------------------
		/*Print out the position of the first occurrence of "c"
Print out the position of the first occurrence of " "
Print out the position of the first occurrence of the variable target1
Print out the position of the first occurrence of the variable target2*/
		
		String str = "abracadabra alakazam";
	    String target1 = "dab";
	    String target2 = "ABRA";
		         //  int indexOf(int ch)
		           int letter=str.indexOf("c");
		           System.out.println(letter);
		           int space=str.indexOf(" ");
		           System.out.println(space);
		           int var1=str.indexOf(target1);
		           System.out.println(var1);
		           int var2=str.indexOf("ABRA");
		           System.out.println(var2);
		           
	//----------------------------------------------------------------------
//		String Str = new String("Welcome on Board");
//		String SubStr1 = new String("Tutorials");
//		String SubStr2 = new String("Sutorials");
//		
//		System.out.print("Found Index :");
//		System.out.println(Str.indexOf('o'));
//		
//		System.out.print("Found Index :");
//		System.out.println(Str.indexOf(SubStr1));
//		System.out.print("Found Index :");
//		System.out.println(Str.indexOf(SubStr2));
//		
                      //done and understood
	}
}
