package com.class11;

public class ClassHomework2 {

	public static void main(String[] args) {
		String[][] countries = { { "Canada", "America", "Mexico" }, { "Bolivia", "Salvador", "Peru", "Chile" },
				{ "Italy", "German", "Phillipeen", "Tai Wanei" } };
		for (int i = 0; i < countries.length; i++) {

			for (int a = 0; a < countries[i].length; a++) {

			System.out.print(countries[i][a] + " ");

			}
			//System.out.println();
		}

	}

}
