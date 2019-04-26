package com.WednesdayClass;

public class SuperClass {
public static void main(String[] args) {
	DeriveClass obj1=new DeriveClass("Sasha",50);
}	
SuperClass(String str){
	System.out.println("This is Super class with one parament");
}
SuperClass(String str1, int num1){
	System.out.println("This is Super class with two paraments");
}
}
class DeriveClass extends SuperClass {
	DeriveClass(String str1){
		super(str1);
		System.out.println("This is from DeriveClass with one parament");
	}
	DeriveClass(String str1, int num2){
		super(str1,num2);
		System.out.println("This is from DeriveClass with two paraments "+str1+", "+num2);
	}
}
