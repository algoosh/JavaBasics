package com.WednesdayClass;

public class BrownFoxOverLazyDuck {

	public static void main(String[] args) {
		
		String para="      The quick brown fox jumps over the lazy dog.        ";
//		System.out.println(para.length());
//		System.out.println(para.toLowerCase());
//		System.out.println(para.toUpperCase());
//		System.out.println(para.startsWith("The"));
//		System.out.println(para.endsWith("The"));
//		int count=0;
//		for(int i=0; i<para.length(); i++) {//we need a condition
//		if(para.charAt(i)=='a') {
//			count++;
//		}}
//		System.out.println(count);
//	
//	System.out.println(para.substring(para.length()/2));
		//System.out.println(para.substring(10,20));
		
	for( int i=para.length()-1;i>=0;i--) {
			System.out.print(para.charAt(i)); //HOW TO MAKE IN ONE LINE
	}
		
		//System.out.println(para.trim()); 
}

}
