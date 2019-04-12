package com.class20;

public class Task {

	public static void main(String[] args) {
		Task obj = new Task();
		String email="";
		obj.creatEmail("J", "M", "google");
		System.out.println(email.toLowerCase());
		System.out.println(email);

		email = obj.creatEmail("Bob", "Jonson", "outlook");
		System.out.println(email);
	}

	String creatEmail(String name, String lastName, String emailType) {

		String email = name + lastName + "@" + emailType + ".com";
		return email.toLowerCase();
		//------------------------------------------------------------------------
		//
	}

	
	
}
