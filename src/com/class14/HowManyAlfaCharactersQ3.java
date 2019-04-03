package com.class14;

public class HowManyAlfaCharactersQ3 {

	public static void main(String[] args) {
		String str = "Syntax! students batch4 are 100% tester";
		String newstr = str.replaceAll("[^A-Za-z]", "");
		System.out.println(newstr.length());
	}
}