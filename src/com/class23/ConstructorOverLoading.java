package com.class23;

public class ConstructorOverLoading {
	ConstructorOverLoading(){
		System.out.println("I am a Constructor with no parametrs");
	}
	
	ConstructorOverLoading(String str){
		System.out.println("I am a Constructor with one String parametrs");
	}
	ConstructorOverLoading(String str,String str1){
		System.out.println("I am a Constructor with two String parametrs");
	}
	ConstructorOverLoading(int a){
		System.out.println("I am a Constructor with one intiger parametrs");
	}
}
