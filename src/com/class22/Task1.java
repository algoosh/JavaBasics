package com.class22;

public class Task1 {
	Task1(){
		System.out.println("I am Constructor without paraments");
		
	}
	Task1(String str){
		
		System.out.println("I am Constructor with paraments "+str);	
	}

	public static void main(String[] args) {
		Task1 obj1= new Task1();
		
		Task1 obj2= new Task1("Today");
	}

}
