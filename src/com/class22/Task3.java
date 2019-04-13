package com.class22;

public class Task3 {
	/*Write a program  that will have a private default constructor
	 class 
	 and create 2 objects of this class:
	  1 - inside same class; 2 - from outside the class.
	  */
	
	private Task3 () {
		System.out.println(" I am constructor with no paramerts");
	}
	Task3(String word){
		System.out.println("I am constructor with ONE paramert called "+word);
	}
	Task3(int number,String word1){
		System.out.println("I am constructor with TWO paramerts called "+number+" and "+word1);

	}

	public static void main(String[] args) {
		Task3 obj= new Task3();
		Task3 obj1=new Task3("word");
		Task3 obj2= new Task3(123,"word1");
	}
	
	}
	

